/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitrisoft.sirus.entity.sec;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Developer
 */
@Entity
@Table(name="SecurityNode")
public class SecurityNode implements Serializable {
    

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private SecurityNodePK securityNodePK;

    @Basic(optional = false)
    @Column(name = "Action", nullable = false, length = 20)
    private String action;
    
    @Basic(optional = false)
    @Column(name = "Checked", nullable = false)
    private boolean checked;

    @Basic(optional = false)
    @Column(name = "GroupMenu", nullable = false, length = 50)
    private String groupMenu;

    @Basic(optional = false)
    @Column(name = "GroupForm", nullable = false, length = 50)
    private String groupForm;

    @Basic(optional = false)
    @Column(name = "Seq", nullable = false)
    private Integer seq;
       
    /**
     * @return the securityNodePK
     */
    public SecurityNodePK getSecurityNodePK() {
        return securityNodePK;
    }

    /**
     * @param securityNodePK the securityNodePK to set
     */
    public void setSecurityNodePK(SecurityNodePK securityNodePK) {
        this.securityNodePK = securityNodePK;
    }

    /**
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * @return the checked
     */
    public boolean isChecked() {
        return checked;
    }

    /**
     * @param checked the checked to set
     */
    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    /**
     * @return the groupMenu
     */
    public String getGroupMenu() {
        return groupMenu;
    }

    /**
     * @param groupMenu the groupMenu to set
     */
    public void setGroupMenu(String groupMenu) {
        this.groupMenu = groupMenu;
    }

    /**
     * @return the groupForm
     */
    public String getGroupForm() {
        return groupForm;
    }

    /**
     * @param groupForm the groupForm to set
     */
    public void setGroupForm(String groupForm) {
        this.groupForm = groupForm;
    }

    /**
     * @return the seq
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * @param seq the seq to set
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }
    
}
