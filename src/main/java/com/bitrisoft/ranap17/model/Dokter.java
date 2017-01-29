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
 * @author Developer
 */
@Entity
public class Dokter implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_dokter")
    private String idDokter;
    @Basic(optional = false)
    @Column(name = "nama_dokter")
    private String namaDokter;
    @Column(name = "alamat_dokter")
    private String alamatDokter;
    @Column(name = "ahli_dokter")
    private String ahliDokter;
    @Column(name = "telp_dokter")
    private String telpDokter;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "komisi_dokter")
    private Float komisiDokter;
    @Column(name = "status_dokter")
    private Character statusDokter;
    
    
    /**
     * @return the idDokter
     */
    public String getIdDokter() {
        return idDokter;
    }

    /**
     * @param idDokter the idDokter to set
     */
    public void setIdDokter(String idDokter) {
        this.idDokter = idDokter;
    }

    /**
     * @return the namaDokter
     */
    public String getNamaDokter() {
        return namaDokter;
    }

    /**
     * @param namaDokter the namaDokter to set
     */
    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    /**
     * @return the alamatDokter
     */
    public String getAlamatDokter() {
        return alamatDokter;
    }

    /**
     * @param alamatDokter the alamatDokter to set
     */
    public void setAlamatDokter(String alamatDokter) {
        this.alamatDokter = alamatDokter;
    }

    /**
     * @return the ahliDokter
     */
    public String getAhliDokter() {
        return ahliDokter;
    }

    /**
     * @param ahliDokter the ahliDokter to set
     */
    public void setAhliDokter(String ahliDokter) {
        this.ahliDokter = ahliDokter;
    }

    /**
     * @return the telpDokter
     */
    public String getTelpDokter() {
        return telpDokter;
    }

    /**
     * @param telpDokter the telpDokter to set
     */
    public void setTelpDokter(String telpDokter) {
        this.telpDokter = telpDokter;
    }

    /**
     * @return the komisiDokter
     */
    public Float getKomisiDokter() {
        return komisiDokter;
    }

    /**
     * @param komisiDokter the komisiDokter to set
     */
    public void setKomisiDokter(Float komisiDokter) {
        this.komisiDokter = komisiDokter;
    }

    /**
     * @return the statusDokter
     */
    public Character getStatusDokter() {
        return statusDokter;
    }

    /**
     * @param statusDokter the statusDokter to set
     */
    public void setStatusDokter(Character statusDokter) {
        this.statusDokter = statusDokter;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDokter != null ? idDokter.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dokter)) {
            return false;
        }
        Dokter other = (Dokter) object;
        if ((this.idDokter == null && other.idDokter != null) || (this.idDokter != null && !this.idDokter.equals(other.idDokter))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitrisoft.sirus.entity.Dokter[ idDokter=" + idDokter + " ]";
    }
}
