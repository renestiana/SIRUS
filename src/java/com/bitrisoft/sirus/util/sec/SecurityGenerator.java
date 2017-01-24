/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitrisoft.sirus.util.sec;

import com.bitrisoft.sirus.dao.sec.SecurityNodeDAO;
import com.bitrisoft.sirus.entity.sec.SecurityNode;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.faces.context.FacesContext;

/**
 *
 * @author Developer
 */
public class SecurityGenerator {

    public static final String ACTION_TYPE_DISABLE = "disabled";
    public static final String ACTION_TYPE_READONLY = "readOnly";
    public static final String ACTION_TYPE_HIDDEN = "hidden";
    
    public static final String EL_TYPE_FORM = "form";
    public static final String EL_TYPE_FIELD = "field";
    public static final String EL_TYPE_LABEL = "label";
    public static final String EL_TYPE_LINK = "link";   
    
    //public static final

    private HashMap<String,Object[]> componentMap;    
    private List<SecurityNode> secNodeList;
    private List<SecurityNode> secMenuList;
    private String formname;
    private Short admin;
    private String[] secOther;
    private String formOther;
    private StringBuilder treeMenu;
    private SecurityNodeDAO securityNodeDAO;
    private PXConfigJpaController jpaPXConfigController = null;
    private String groupID;
    
    public SecurityGenerator() {
    }

    public SecurityGenerator(String formname) {
        this.formname = formname;
        componentMap = new HashMap<String, Object[]>();        
    }
    
    private String removeTail(String url) {
        String temp = url;

        for (int i = 0; i<2;i++)
        {
            temp = temp.substring(temp.indexOf("/")+1);
        }

        return temp;
    }
    
    public void createTreeMenu(String template,int parentSys)
    {        
        List<Object[]> treeData = securityNodeDAO.findTreeMenuEntities(template, parentSys);
        for (Object[] objects : treeData) {
            //Sys,Menu,Type_,Link,ElementID
            if(objects[2].toString().equals("0")){ // folder
                treeMenu.append("<li id=\""+objects[4].toString()+"\">\n");
                treeMenu.append("<span class=\"folder\"><a id=\"a_"+objects[4].toString()+"\" href=\"javascript:;\" title=\""+objects[1].toString()+"\">"+objects[1].toString()+"</a></span>\n");
                treeMenu.append("<ul>\n");
                createTreeMenu(template,(Integer)objects[0]);
                treeMenu.append("</ul>\n");
                treeMenu.append("</li>\n");
            }
            if(objects[2].toString().equals("1")){ // link
                treeMenu.append("<li id=\""+objects[4].toString()+"\">\n");
                if(objects[4].toString().contains("pending_approval")){
                    treeMenu.append("<span class=\"file\"><a id=\"a_"+objects[4].toString()+"\" href =\"javascript:openMenuDetail('"+objects[3].toString()+"');\" title=\""+objects[1].toString()+"\">"+objects[1].toString()+"</a></span>\n");
                }else{
                    treeMenu.append("<span class=\"file\"><a id=\"a_"+objects[4].toString()+"\" href =\"javascript:openMenu('"+objects[3].toString()+"');\" title=\""+objects[1].toString()+"\">"+objects[1].toString()+"</a></span>\n");
                }
                treeMenu.append("</li>\n");
            }
            if(objects[2].toString().equals("2")){ // span
                treeMenu.append("<li><span>------------------------------</span></li>\n");              
            }                    
        }       
    }
    
    public void createTreeMenuUser(String groupID,int parentSys)
    {        
        List<Object[]> treeData = securityNodeDAO.findTreeMenuUserEntities(groupID, parentSys);
        for (Object[] objects : treeData) {
            //Sys,Menu,Type_,Link,ElementID
            if(objects[2].toString().equals("0")){ // folder
                treeMenu.append("<li id=\""+objects[4].toString()+"\">\n");
                treeMenu.append("<span class=\"folder\"><a id=\"a_"+objects[4].toString()+"\" href=\"javascript:;\" title=\""+objects[1].toString()+"\">"+objects[1].toString()+"</a></span>\n");
                treeMenu.append("<ul>\n");
                createTreeMenuUser(groupID,(Integer)objects[0]);
                treeMenu.append("</ul>\n");
                treeMenu.append("</li>\n");
            }
            if(objects[2].toString().equals("1")){ // link
                treeMenu.append("<li id=\""+objects[4].toString()+"\">\n");
                
                if (objects[4].toString().indexOf("pending_approval")==-1) {
                    treeMenu.append("<span class=\"file\"><a id=\"a_"+objects[4].toString()+"\" href =\"javascript:openMenu('"+objects[3].toString()+"');\" title=\""+objects[1].toString()+"\">"+objects[1].toString()+"</a></span>\n");
                } else {
                    treeMenu.append("<span class=\"file\"><a id=\"a_"+objects[4].toString()+"\" href =\"javascript:openMenuDetail('"+objects[3].toString()+"');\" title=\""+objects[1].toString()+"\">"+objects[1].toString()+"</a></span>\n");
                }
                
                treeMenu.append("</li>\n");
            }
            if(objects[2].toString().equals("2")){ // span
                treeMenu.append("<li><span>------------------------------</span></li>\n");              
            }                    
        }       
    }
    
    public String getTreeMenu(){
        return treeMenu.toString();
    }

    public void addSecurity(String formOther,String ... description){
        this.formOther = formOther;
        this.secOther = description;
    }
    
    public boolean accessible(String name)
    {
        boolean allow = true;
        if (secMenuList!=null) {
            for (SecurityNode node:secMenuList) {
                if (node.getSecurityNodePK().getDescription().equals(name)==true) {
                    if (!node.getChecked() && admin==0){
                        allow = false;
                    }
                    break;
                }
            }
        }
        return allow;
    }
    
    public boolean accessible2(String... name)
    {
        for (String string : name) {
            if(accessible(string)){
                return true;
            }
        }
        return false;
    }
    
    public boolean accessibleGroupMenu(String groupMenu)
    {
        boolean allow = false;
        if (admin!=null && admin==1) {
            allow = true;
        } else {
            for (SecurityNode node:secMenuList) {
                if (node.getGroupMenu().equals(groupMenu)==true ) {
                    if (node.getChecked()) {
                        allow = true;
                        break;
                    }                    
                }
            }
        }
        return allow;
    }

    public boolean check(String name)
    {
        boolean allow = true;
        if (secNodeList!=null) {
            for (SecurityNode node:secNodeList)
            {
                if (node.getSecurityNodePK().getDescription().equals(name))
                {
                    if (node.getChecked())
                    {
                        allow = false;
                    }
                }
            }
        }
        return allow;
    }

    public String getScript()
    {        

        StringBuilder temp = new StringBuilder();
        temp.append("<script>\n");
        // disabledGroup di gunakan untuk men-disable isi seluruh content div / content table
        temp.append("function disabledGroup(el) {\n");
        temp.append("   try {\n");
        temp.append("       var tag = el.tagName;\n");
        temp.append("       if(tag.toString().toUpperCase()=='A'){ \n");
        temp.append("           disabledLink(el);\n");
        temp.append("       }else{\n ");
        temp.append("           el.disabled = true;\n");
        temp.append("       }\n");
        temp.append("   }catch(E){}\n");
        temp.append("   if(el.childNodes && el.childNodes.length > 0) {\n");
        temp.append("       for (var x = 0; x < el.childNodes.length; x++) {\n");
        temp.append("           disabledGroup(el.childNodes[x]);\n");
        temp.append("       }\n");
        temp.append("   }\n");
        temp.append("}\n");
        
        temp.append("function disabledLink(el) {\n");
        temp.append("    el.style.color = 'grey'; \n " );
        temp.append("    el.style.cursor = 'default'; \n ");
        temp.append("    el.setAttribute('onclick', 'return false'); \n " );
        temp.append("    el.setAttribute('onmousedown', 'return false'); \n " );
        temp.append("    el.setAttribute('onmouseup', 'return false'); \n " );
        temp.append("    el.setAttribute('onkeypress', 'return false'); \n " );
        temp.append("}\n");
        for (String key: componentMap.keySet())
        {
            int idx = 0;
            Object[] setting = componentMap.get(key);
            try
            {
                if (key.lastIndexOf('#')>-1)
                {                    
                    String[] keyTemp = key.split("#");
                    key = keyTemp[0];
                    idx = Integer.parseInt(keyTemp[1]);                    
                }
            }catch (Exception ex) {}

            
            String var = key.replaceAll(":", "_");
            var = var.replaceAll("-", "_");
            
            //temp.append("document.forms['Header']."+ key +"."+setting[0]+" = "+setting[1]+" \n ");          
            
            temp.append("var "+var+" = document.getElementById('"+key+"'); \n");
            temp.append("if ("+var+"!=null) { \n ");
            // jika security hide dan elType bukan table atau eltype table dan eltype detail table.
            if (setting[0].equals("hidden") && ( setting[2].equals("table") || (!setting[2].equals("table") && !setting[2].toString().startsWith("table:link"))))
            {
                temp.append("  "+var+".style.display = 'none'; \n");

            } else if (setting[2].equals("field"))
            {

                if (setting[0].equals("disabled"))
                {
                    temp.append("  "+var+".disabled = true; \n");
                }else if (setting[0].equals("readOnly")){
                    temp.append("  "+var+".readOnly = true; \n");
                    // jika yg di security Field = Date, maka view picker-nya di hide
                    if(key.indexOf("Date")>0){
                         temp.append("    var "+var+"Span = document.getElementById('"+key+"Span'); \n");
                         temp.append("    if ("+var+"Span!=null) { \n ");
                         temp.append("        "+var+"Span.style.display = 'none'; \n");
                         temp.append("    } \n");
                    }
                }

            } else if (setting[2].equals("link"))
            {
                //temp.append("  "+var+"."+setting[0]+" = " + setting[1] + "; \n");
                if (setting[0].equals("disabled"))
                {
                    temp.append("    disabledLink("+var+"); \n " );
                }
            } else if (setting[2].toString().startsWith("table:link"))
            {
                //int idx = Integer.parseInt(setting[2].toString().substring(11));

                temp.append("  var "+var+"_rows = document.getElementById('"+key+"').getElementsByTagName('tbody')[0].getElementsByTagName('tr'); \n");
                temp.append("  for (i = 0; i < "+var+"_rows.length; i++) { \n");
                temp.append("    var cells = "+var+"_rows[i].cells; \n");
                temp.append("    var links = cells["+idx+"].getElementsByTagName('a'); \n");

                if (setting[0].equals("disabled") || setting[0].equals("hidden"))
                {
                    //temp.append("    alert(links.length) \n");
                    temp.append("    if (links.length>0){ \n ");
                    if (setting[0].equals("disabled"))
                    {
                        temp.append("      disabledLink(links[0]); \n"); 
                    } else
                    {
                        temp.append("      links[0].style.display = 'none'; \n");
                    }
                    temp.append("    } ");                    
                }

                temp.append("  } \n");
            }else if(setting[0].equals("disabled") && setting[2].equals("group")){                                
                temp.append("  disabledGroup("+var+"); \n");
            }          
            temp.append("} \n");
        }
        
        temp.append("</script>");
        
        return temp.toString();
    }
        
    public String getMenuLabel(String menuID) {
        return jpaPXConfigController.getMenuLabel(menuID,admin,groupID);
    }
    
    public void initMenu()
    {
        retrieveMenuSecurityFromDB();
    }

    public void init()
    {
        retrieveDataFromDB();
    }
    
    public void initMenuTree()
    {
        retrieveTreeMenuFromDB();
    }
    
    private void retrieveMenuSecurityFromDB()
    {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        securityNodeDAO = (SecurityNodeJpaController) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "securityNodeJpa");
        UserLoginJpaController userLoginJpaController = (UserLoginJpaController) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "userLoginJpa");
        HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();

        String user = (String) facesContext.getExternalContext().getSessionMap().get("user");

        if (user==null) {
            try {
                response.sendRedirect("faces/SessionTimeOut.jsp");
            } catch (IOException ex) {
                Logger.getLogger(SecurityGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            UserLogin userLogin = userLoginJpaController.findUserLogin(user);
            admin = userLogin.getAdministratorShort();
            secMenuList = securityNodeDAO.findSecurityNodeEntities(userLogin.getGroupID());
            userLogin = null;
        }
    }
    
    private void retrieveTreeMenuFromDB()
    {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        securityNodeDAO = (SecurityNodeJpaController) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "securityNodeJpa");
        UserLoginJpaController userLoginJpaController = (UserLoginJpaController) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "userLoginJpa");
        HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();

        String user = (String) facesContext.getExternalContext().getSessionMap().get("user");

        if (user==null) {
            try {
                response.sendRedirect("faces/SessionTimeOut.jsp");
            } catch (IOException ex) {
                Logger.getLogger(SecurityGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            UserLogin userLogin = userLoginJpaController.findUserLogin(user);
            admin = userLogin.getAdministratorShort();
            treeMenu = new StringBuilder();
            if(admin==1){
                createTreeMenu("Standard Orlansoft", 0);
            }else{
                createTreeMenuUser(userLogin.getGroupID(), 0);
            }
            
            userLogin = null;
        }
    }
    
    private void retrieveDataFromDB()
    {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SecurityNodeJpaController securityNodeDAO = (SecurityNodeJpaController) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "securityNodeJpa");
        SecurityNodeItemJpaController securityNodeItemJpaController = (SecurityNodeItemJpaController) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "securityNodeItemJpa");
        UserLoginJpaController userLoginJpaController = (UserLoginJpaController) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "userLoginJpa");
        HttpServletResponse response = (HttpServletResponse) facesContext.getExternalContext().getResponse();
        HttpServletRequest request = (HttpServletRequest) facesContext.getExternalContext().getRequest();
        jpaPXConfigController = (PXConfigJpaController) facesContext.getApplication().getELResolver().getValue(facesContext.getELContext(), null, "pXConfigJpa");
        String user = (String) facesContext.getExternalContext().getSessionMap().get("user");
        
        if (user==null) {
            try {
                response.sendRedirect("faces/SessionTimeOut.jsp");
            } catch (IOException ex) {
                Logger.getLogger(SecurityGenerator.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            UserLogin userLogin = userLoginJpaController.findUserLogin(user);
            admin = userLogin.getAdministratorShort();
            groupID = userLogin.getGroupID();
            if (!userLogin.getAdministrator())
            {
                secNodeList = securityNodeDAO.findSecurityNodeEntities(userLogin.getGroupID(), formname);

                for (SecurityNode node:secNodeList)
                {
                    if (!node.getAction().equalsIgnoreCase("access"))
                    {
                        if (node.getChecked())
                        {
                            List<SecurityNodeItem> nodeItemList = securityNodeItemJpaController.findSecurityNodeItemEntities(
                                    node.getSecurityNodePK().getGroupId(),
                                    node.getSecurityNodePK().getForm(),
                                    node.getSecurityNodePK().getDescription());

                            for (SecurityNodeItem nodeItem:nodeItemList)
                            {
                                componentMap.put(nodeItem.getSecurityNodeItemPK().getElement(), new Object[] {node.getAction(), node.getChecked(), nodeItem.getElType()});
                            }
                        }
                    }else{
                        if(node.getChecked()==false){ // jika tidak punya aksses
                            try {
                                response.sendRedirect(request.getContextPath() + "/NotAuthorized.jsp");
                            } catch (IOException ex) {
                                Logger.getLogger(SecurityGenerator.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
                if(formOther!=null){
                    for (int i = 0; i < secOther.length; i++) {
                        String description = secOther[i];
                        SecurityNode securityNode = securityNodeDAO.findSecurityNode(new SecurityNodePK(userLogin.getGroupID(), formOther, description));
                        if(securityNode!=null && securityNode.getChecked()){
                            List<SecurityNodeItem> nodeItemList = securityNodeItemJpaController.findSecurityNodeItemEntities(userLogin.getGroupID(),formOther,description);
                            for (SecurityNodeItem nodeItem:nodeItemList)
                            {
                                componentMap.put(nodeItem.getSecurityNodeItemPK().getElement(), new Object[] {securityNode.getAction(), securityNode.getChecked(), nodeItem.getElType()});
                                secNodeList.add(securityNode);
                            }
                        }
                        
                    }
                }
            } else {
                secNodeList = new Vector<SecurityNode>();
            }
            userLogin = null;
        }
    }
}   
