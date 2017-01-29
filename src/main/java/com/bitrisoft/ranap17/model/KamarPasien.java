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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Developer
 */
@Entity
public class KamarPasien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_kamar")
    private String idKamar;
    @Basic(optional = false)
    @Column(name = "nama_ruang")
    private String namaRuang;
    @Column(name = "no_ruang")
    private String noRuang;
    @Column(name = "status_kamar")
    private Character statusKamar;
    @Column(name = "lantai")
    private Character lantai;
    @Column(name = "ruang_induk")
    private String ruangInduk;
    @Column(name = "status_ruang")
    private Character statusRuang;
    @Column(name = "keterangan")
    private String keterangan;
    @JoinColumn(name = "kelas", referencedColumnName = "id_kelas")
    @ManyToOne(fetch = FetchType.EAGER)
    private KelasPerawatan kelas;
    
    /**
     * @return the idKamar
     */
    public String getIdKamar() {
        return idKamar;
    }

    /**
     * @param idKamar the idKamar to set
     */
    public void setIdKamar(String idKamar) {
        this.idKamar = idKamar;
    }

    /**
     * @return the namaRuang
     */
    public String getNamaRuang() {
        return namaRuang;
    }

    /**
     * @param namaRuang the namaRuang to set
     */
    public void setNamaRuang(String namaRuang) {
        this.namaRuang = namaRuang;
    }

    /**
     * @return the noRuang
     */
    public String getNoRuang() {
        return noRuang;
    }

    /**
     * @param noRuang the noRuang to set
     */
    public void setNoRuang(String noRuang) {
        this.noRuang = noRuang;
    }

    /**
     * @return the statusKamar
     */
    public Character getStatusKamar() {
        return statusKamar;
    }

    /**
     * @param statusKamar the statusKamar to set
     */
    public void setStatusKamar(Character statusKamar) {
        this.statusKamar = statusKamar;
    }

    /**
     * @return the lantai
     */
    public Character getLantai() {
        return lantai;
    }

    /**
     * @param lantai the lantai to set
     */
    public void setLantai(Character lantai) {
        this.lantai = lantai;
    }

    /**
     * @return the ruangInduk
     */
    public String getRuangInduk() {
        return ruangInduk;
    }

    /**
     * @param ruangInduk the ruangInduk to set
     */
    public void setRuangInduk(String ruangInduk) {
        this.ruangInduk = ruangInduk;
    }

    /**
     * @return the statusRuang
     */
    public Character getStatusRuang() {
        return statusRuang;
    }

    /**
     * @param statusRuang the statusRuang to set
     */
    public void setStatusRuang(Character statusRuang) {
        this.statusRuang = statusRuang;
    }

    /**
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    /**
     * @return the kelas
     */
    public KelasPerawatan getKelas() {
        return kelas;
    }

    /**
     * @param kelas the kelas to set
     */
    public void setKelas(KelasPerawatan kelas) {
        this.kelas = kelas;
    }    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKamar != null ? idKamar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KamarPasien)) {
            return false;
        }
        KamarPasien other = (KamarPasien) object;
        if ((this.idKamar == null && other.idKamar != null) || (this.idKamar != null && !this.idKamar.equals(other.idKamar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitrisoft.sirus.entity.KamarPasien[ idKamar=" + idKamar + " ]";
    }
}
