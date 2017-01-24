/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitrisoft.sirus.dao.sec;

import com.bitrisoft.sirus.entity.sec.SecurityNode;
import com.bitrisoft.sirus.entity.sec.SecurityNodePK;
import com.bitrisoft.sirus.dao.exceptions.*;
import com.bitrisoft.sirus.entity.sec.SecurityNodePK;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Developer
 */
public interface SecurityNodeDAO {
    
    public void create(SecurityNode securityNode) throws PreexistingEntityException, Exception;
    
    public void edit(SecurityNode securityNode) throws NonexistentEntityException, Exception;
    
    public void destroy(SecurityNodePK id) throws NonexistentEntityException;
    
    public List<SecurityNode> findSecurityNodeEntities();
    
    public List<SecurityNode> findSecurityNodeEntities(int maxResults, int firstResult);
    
    public List<SecurityNode> findSecurityNodeEntities(boolean all, int maxResults, int firstResult);
    
    public List<SecurityNode> findSecurityNodeEntities(String groupID);
    
    public List<Object[]> findTreeMenuEntities(String Template,int parentSys);
    
    public void insertTreeMenuUser(int sys,String menu,int type,String link,int parentSys,String groupid,int sequence,String elementID,String sysStandard);
    
    public void removeTreeMenuUser(String sys,String groupid,String parentSys);
    
    public void resortTreeMenuUser(String groupid,String parentSys);
    
    public void removeTreeMenuGroup(String groupid);
    
    public void updateTreeMenuUser(String sys,String groupid,String menu,Integer seq);
    
    public void updateSequenceOnly(String groupid,int sys,int seq);
    
    public void updateSequence_parentSys(String groupid,int sys,int seq,int parentSys);
    
    public void updateSeqTreeMenuUser(String groupid,int seq,int parentSys);
    
    public void updateSeqMinusTreeMenuUser(String groupid,int seq,int parentSys);
    
    public Integer getNextSysUser(String groupID);
    
    public Integer getNextSysSeq(String groupID,int parentSys,int sequence);
    
    public Integer getPrevSysSeq(String groupID,int parentSys,int sequence);
    
    public Integer getMaxSequenceUser(String groupID,int parentSys);
    
    public Integer getMinSequenceUser(String groupID,int parentSys);
    
    public Object[] findTreeMenu(String Template,int sys);
    
    public Object[] findTreeMenuUser(String groupID,int sys);
    
    public List<Object[]> findTreeMenuUserEntities(String groupID,int parentSys);
    
    public List<Object> findTempaleTreeMenuEntities();
    
    public List<Object[]> findUserGroupEntities();
    
    public void copyAllTreeMenuUser(String groupid,String template);
    
    public void saveAsTemplate(String groupid,String template);
    
    public void removeTemplate(String template);

    public List<SecurityNode> findSecurityNodeEntities(String groupID, String form);

    public List<SecurityNode> findSecurityNodeEntities(String groupID, String form, String description);

    public List<String> findSecurityNodeMenuEntities();

    public List<String> findSecurityNodeFormEntities();

    public List<String> findSecurityNodeDetailEntities(String groupForm);

    public SecurityNode findSecurityNode(SecurityNodePK id);

    public int getSecurityNodeCount();
    
    public List<SecurityNode> findSecurityMenuEntities(boolean all, int maxResults, int firstResult);

    public List<ArrayList> findSecurityMenuEntities();
    
}
