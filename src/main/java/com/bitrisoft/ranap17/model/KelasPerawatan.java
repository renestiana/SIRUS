/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitrisoft.ranap17.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Developer
 */
@Entity
public class KelasPerawatan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_kelas")
    private String idKelas;
    @Basic(optional = false)
    @Column(name = "nama_kelas")
    private String namaKelas;
    @Column(name = "tarip_kelas")
    private BigInteger taripKelas;
    @Column(name = "nomor_urut")
    private Integer nomorUrut;
    @Column(name = "kelas_kd_pdp")
    private Character kelasKdPdp;
    
    /**
     * @return the idKelas
     */
    public String getIdKelas() {
        return idKelas;
    }

    /**
     * @param idKelas the idKelas to set
     */
    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }

    /**
     * @return the namaKelas
     */
    public String getNamaKelas() {
        return namaKelas;
    }

    /**
     * @param namaKelas the namaKelas to set
     */
    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    /**
     * @return the taripKelas
     */
    public BigInteger getTaripKelas() {
        return taripKelas;
    }

    /**
     * @param taripKelas the taripKelas to set
     */
    public void setTaripKelas(BigInteger taripKelas) {
        this.taripKelas = taripKelas;
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

    /**
     * @return the kelasKdPdp
     */
    public Character getKelasKdPdp() {
        return kelasKdPdp;
    }

    /**
     * @param kelasKdPdp the kelasKdPdp to set
     */
    public void setKelasKdPdp(Character kelasKdPdp) {
        this.kelasKdPdp = kelasKdPdp;
    }    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKelas != null ? idKelas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KelasPerawatan)) {
            return false;
        }
        KelasPerawatan other = (KelasPerawatan) object;
        if ((this.idKelas == null && other.idKelas != null) || (this.idKelas != null && !this.idKelas.equals(other.idKelas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitrisoft.ranap17.entity.KelasPerawatan[ idKelas=" + idKelas + " ]";
    }
    
}
