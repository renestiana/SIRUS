/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitrisoft.sirus.entity.sec;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Developer
 */
@Embeddable
public class SecurityNodePK {
    
    @Basic(optional = false)
    @Column(name = "GroupId", nullable = false, length = 20)
    private String groupId;

    @Basic(optional = false)
    @Column(name = "Form", nullable = false, length = 50)
    private String form;
    
    @Basic(optional = false)
    @Column(name = "Description", nullable = false, length = 50)
    private String description;

    public SecurityNodePK() {
    }
    
    public SecurityNodePK(String groupId, String form, String description) {        
        this.groupId = groupId;
        this.form = form;
        this.description = description;
    }

    /**
     * @return the groupId
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * @param groupId the groupId to set
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * @return the form
     */
    public String getForm() {
        return form;
    }

    /**
     * @param form the form to set
     */
    public void setForm(String form) {
        this.form = form;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
