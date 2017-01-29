/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitrisoft.ranap17.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Developer
 */
@Entity
public class UnitKerja {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_unit")
    private String idUnit;
    @Basic(optional = false)
    @Column(name = "nama_unit")
    private String namaUnit;
    @Column(name = "unit_khusus")
    private String unitKhusus;
    @Column(name = "kode_faktur")
    private String kodeFaktur;
    @Column(name = "lebar_no_faktur")
    private Integer lebarNoFaktur;
    @Column(name = "pk_unit_lain")
    private Character pkUnitLain;
    @Column(name = "modul_khusus")
    private String modulKhusus;
    @Column(name = "nama_singkat")
    private String namaSingkat;
    @Column(name = "kode_akun")
    private String kodeAkun;
    
    /**
     * @return the idUnit
     */
    public String getIdUnit() {
        return idUnit;
    }

    /**
     * @param idUnit the idUnit to set
     */
    public void setIdUnit(String idUnit) {
        this.idUnit = idUnit;
    }

    /**
     * @return the namaUnit
     */
    public String getNamaUnit() {
        return namaUnit;
    }

    /**
     * @param namaUnit the namaUnit to set
     */
    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    /**
     * @return the unitKhusus
     */
    public String getUnitKhusus() {
        return unitKhusus;
    }

    /**
     * @param unitKhusus the unitKhusus to set
     */
    public void setUnitKhusus(String unitKhusus) {
        this.unitKhusus = unitKhusus;
    }

    /**
     * @return the kodeFaktur
     */
    public String getKodeFaktur() {
        return kodeFaktur;
    }

    /**
     * @param kodeFaktur the kodeFaktur to set
     */
    public void setKodeFaktur(String kodeFaktur) {
        this.kodeFaktur = kodeFaktur;
    }

    /**
     * @return the lebarNoFaktur
     */
    public Integer getLebarNoFaktur() {
        return lebarNoFaktur;
    }

    /**
     * @param lebarNoFaktur the lebarNoFaktur to set
     */
    public void setLebarNoFaktur(Integer lebarNoFaktur) {
        this.lebarNoFaktur = lebarNoFaktur;
    }

    /**
     * @return the pkUnitLain
     */
    public Character getPkUnitLain() {
        return pkUnitLain;
    }

    /**
     * @param pkUnitLain the pkUnitLain to set
     */
    public void setPkUnitLain(Character pkUnitLain) {
        this.pkUnitLain = pkUnitLain;
    }

    /**
     * @return the modulKhusus
     */
    public String getModulKhusus() {
        return modulKhusus;
    }

    /**
     * @param modulKhusus the modulKhusus to set
     */
    public void setModulKhusus(String modulKhusus) {
        this.modulKhusus = modulKhusus;
    }

    /**
     * @return the namaSingkat
     */
    public String getNamaSingkat() {
        return namaSingkat;
    }

    /**
     * @param namaSingkat the namaSingkat to set
     */
    public void setNamaSingkat(String namaSingkat) {
        this.namaSingkat = namaSingkat;
    }

    /**
     * @return the kodeAkun
     */
    public String getKodeAkun() {
        return kodeAkun;
    }

    /**
     * @param kodeAkun the kodeAkun to set
     */
    public void setKodeAkun(String kodeAkun) {
        this.kodeAkun = kodeAkun;
    }    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnit != null ? idUnit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitKerja)) {
            return false;
        }
        UnitKerja other = (UnitKerja) object;
        if ((this.idUnit == null && other.idUnit != null) || (this.idUnit != null && !this.idUnit.equals(other.idUnit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitrisoft.sirus.entity.UnitKerja[ idUnit=" + idUnit + " ]";
    }
}
