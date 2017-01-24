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
@Table(name = "SecurityNodeItem")
public class SecurityNodeItems implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SecurityNodeItemsPK securityNodeItemsPK;

    @Basic(optional = false)
    @Column(name = "ElType", nullable = false)
    private String elType;

    public SecurityNodeItems() {
    }

    public SecurityNodeItems(SecurityNodeItemsPK securityNodeItemsPK) {
        this.securityNodeItemsPK = securityNodeItemsPK;
    }

    /*public SecurityNode(String app, String groupId, String form, String description) {
        this.securityNodePK = new SecurityNodePK(app, groupId, form, description);
    }*/
    public SecurityNodeItems(String groupId, String form, String description, String element) {
        this.securityNodeItemsPK = new SecurityNodeItemsPK(groupId, form, description, element);
    }

    public SecurityNodeItemsPK getSecurityNodeItemsPK() {
        return securityNodeItemsPK;
    }

    public void setSecurityNodeItemsPK(SecurityNodeItemsPK securityNodeItemsPK) {
        this.securityNodeItemsPK = securityNodeItemsPK;
    }

    
}
