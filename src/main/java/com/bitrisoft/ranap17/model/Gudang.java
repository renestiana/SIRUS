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
public class Gudang implements Serializable{
    
    private static final long serialVersionU1D = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kd_gudang", length = 5)
    private String kdGudang;
    @Column(name = "nm_gudang", length = 30)
    private String nmGudang;
    @Column(name = "status")
    private Character status;

    /**
     * @return the kdGudang
     */
    public String getKdGudang() {
        return kdGudang;
    }

    /**
     * @param kdGudang the kdGudang to set
     */
    public void setKdGudang(String kdGudang) {
        this.kdGudang = kdGudang;
    }

    /**
     * @return the nmGudang
     */
    public String getNmGudang() {
        return nmGudang;
    }

    /**
     * @param nmGudang the nmGudang to set
     */
    public void setNmGudang(String nmGudang) {
        this.nmGudang = nmGudang;
    }

    /**
     * @return the status
     */
    public Character getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Character status) {
        this.status = status;
    }
    
    
    
}
