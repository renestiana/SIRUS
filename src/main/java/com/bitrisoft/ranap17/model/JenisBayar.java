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
public class JenisBayar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_jns_byr")
    private String idJnsByr;
    @Basic(optional = false)
    @Column(name = "nama_jns_byr")
    private String namaJnsByr;
    @Column(name = "stat_jns_byr")
    private Character statJnsByr;
    @Column(name = "nomor_urut")
    private Integer nomorUrut;
    /**
     * @return the idJnsByr
     */
    public String getIdJnsByr() {
        return idJnsByr;
    }

    /**
     * @param idJnsByr the idJnsByr to set
     */
    public void setIdJnsByr(String idJnsByr) {
        this.idJnsByr = idJnsByr;
    }

    /**
     * @return the namaJnsByr
     */
    public String getNamaJnsByr() {
        return namaJnsByr;
    }

    /**
     * @param namaJnsByr the namaJnsByr to set
     */
    public void setNamaJnsByr(String namaJnsByr) {
        this.namaJnsByr = namaJnsByr;
    }

    /**
     * @return the statJnsByr
     */
    public Character getStatJnsByr() {
        return statJnsByr;
    }

    /**
     * @param statJnsByr the statJnsByr to set
     */
    public void setStatJnsByr(Character statJnsByr) {
        this.statJnsByr = statJnsByr;
    }

    /**
     * @return the nomorUrut
     */
    public Integer getNomorUrut() {
        return nomorUrut;
    }

    /**
     * @param nomorUrut the nomorUrut to set
     */
    public void setNomorUrut(Integer nomorUrut) {
        this.nomorUrut = nomorUrut;
    }        
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJnsByr != null ? idJnsByr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JenisBayar)) {
            return false;
        }
        JenisBayar other = (JenisBayar) object;
        if ((this.idJnsByr == null && other.idJnsByr != null) || (this.idJnsByr != null && !this.idJnsByr.equals(other.idJnsByr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitrisoft.sirus.entity.JenisBayar[ idJnsByr=" + idJnsByr + " ]";
    }
}
