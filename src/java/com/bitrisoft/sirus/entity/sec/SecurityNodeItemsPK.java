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
class SecurityNodeItemsPK {
    @Basic(optional = false)
    @Column(name = "GroupID", nullable = false, length = 20)
    private String groupId;

    @Basic(optional = false)
    @Column(name = "Form", nullable = false, length = 50)
    private String form;
    
    @Basic(optional = false)
    @Column(name = "Description", nullable = false, length = 50)
    private String description;

    @Basic(optional = false)
    @Column(name = "Element", nullable = false, length = 20)
    private String element;


    public SecurityNodeItemsPK() {
    }

    public SecurityNodeItemsPK(String groupId, String form, String description, String element) {
        this.groupId = groupId;
        this.form = form;
        this.description = description;
        this.element = element;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the element
     */
    public String getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(String element) {
        this.element = element;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        //hash += (app != null ? app.hashCode() : 0);
        hash += (groupId != null ? groupId.hashCode() : 0);
        hash += (form != null ? form.hashCode() : 0);
        hash += (description != null ? description.hashCode() : 0);
        hash += (element != null ? element.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SecurityNodeItemsPK)) {
            return false;
        }
        SecurityNodeItemsPK other = (SecurityNodeItemsPK) object;
        /*if ((this.app == null && other.app != null) || (this.app != null && !this.app.equals(other.app))) {
            return false;
        }*/
        if ((this.groupId == null && other.groupId != null) || (this.groupId != null && !this.groupId.equals(other.groupId))) {
            return false;
        }
        if ((this.form == null && other.form != null) || (this.form != null && !this.form.equals(other.form))) {
            return false;
        }
        if ((this.description == null && other.description != null) || (this.description != null && !this.description.equals(other.description))) {
            return false;
        }
        if ((this.element == null && other.element != null) || (this.element != null && !this.element.equals(other.element))) {
            return false;
        }
        
        return true;
    }
   
}
