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
public class DaftarPoli implements Serializable{
    
    private static final long serialVersionUID = 1l;
    @Id
    @Basic(optional = false)
    @Column(name = "id_poli")
    private String idPoli;
    @Basic(optional = false)
    @Column(name = "nama_poli")
    private String namaPoli;
    @Column(name = "lantai")
    private String lantai;

    /**
     * @return the idPoli
     */
    public String getIdPoli() {
        return idPoli;
    }

    /**
     * @param idPoli the idPoli to set
     */
    public void setIdPoli(String idPoli) {
        this.idPoli = idPoli;
    }

    /**
     * @return the namaPoli
     */
    public String getNamaPoli() {
        return namaPoli;
    }

    /**
     * @param namaPoli the namaPoli to set
     */
    public void setNamaPoli(String namaPoli) {
        this.namaPoli = namaPoli;
    }

    /**
     * @return the lantai
     */
    public String getLantai() {
        return lantai;
    }

    /**
     * @param lantai the lantai to set
     */
    public void setLantai(String lantai) {
        this.lantai = lantai;
    }
    
    
}
