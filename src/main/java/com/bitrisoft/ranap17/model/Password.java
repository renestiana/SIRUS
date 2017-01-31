/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitrisoft.ranap17.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Reni
 */
@Entity
public class Password implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "user_id", nullable = false)
    private String userId;
    @Basic(optional = false)
    @Column(name = "kode_password", nullable = false)
    private String kodePassword;
    @Column(name = "nama_id")
    private String namaId;
    @Column(name = "status_user")
    private String statusUser;

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the kodePassword
     */
    public String getKodePassword() {
        return kodePassword;
    }

    /**
     * @param kodePassword the kodePassword to set
     */
    public void setKodePassword(String kodePassword) {
        this.kodePassword = kodePassword;
    }

    /**
     * @return the namaId
     */
    public String getNamaId() {
        return namaId;
    }

    /**
     * @param namaId the namaId to set
     */
    public void setNamaId(String namaId) {
        this.namaId = namaId;
    }

    /**
     * @return the statusUser
     */
    public String getStatusUser() {
        return statusUser;
    }

    /**
     * @param statusUser the statusUser to set
     */
    public void setStatusUser(String statusUser) {
        this.statusUser = statusUser;
    }
    
    
    
}
