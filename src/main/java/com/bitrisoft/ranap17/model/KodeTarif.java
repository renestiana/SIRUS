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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Developer
 */
@Entity
public class KodeTarif implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "kode_pdp")
    private String kodePdp;
    @Column(name = "nama_singkat")
    private String namaSingkat;
    @Column(name = "nama_panjang")
    private String namaPanjang;
    @Column(name = "harga_pendapatan")
    private BigInteger hargaPendapatan;
    @Column(name = "stat_qty")
    private Character statQty;
    @Column(name = "stat_dok")
    private Character statDok;
    @Column(name = "pdppr")
    private Integer pdppr;
    @Column(name = "stat_hrg_umkls")
    private Character statHrgUmkls;
    @Column(name = "level")
    private Character level;
    @Column(name = "pdprk")
    private String pdprk;
    @Column(name = "unit_tdk_sub")
    private Character unitTdkSub;
    @Column(name = "keterangan")
    private String keterangan;
    @Column(name = "nama_cetak")
    private String namaCetak;
    @Column(name = "komisi_dokrp")
    private BigInteger komisiDokrp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "komisi_dokp")
    private Float komisiDokp;
    @Column(name = "jns_pdp_dok")
    private Character jnsPdpDok;
    @JoinColumn(name = "kode_unit", referencedColumnName = "id_unit")
    @ManyToOne(fetch = FetchType.EAGER)
    private UnitKerja kodeUnit;
    
    public KodeTarif(){}
    /**
     * @return the kodePdp
     */
    public String getKodePdp() {
        return kodePdp;
    }

    /**
     * @param kodePdp the kodePdp to set
     */
    public void setKodePdp(String kodePdp) {
        this.kodePdp = kodePdp;
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
     * @return the namaPanjang
     */
    public String getNamaPanjang() {
        return namaPanjang;
    }

    /**
     * @param namaPanjang the namaPanjang to set
     */
    public void setNamaPanjang(String namaPanjang) {
        this.namaPanjang = namaPanjang;
    }

    /**
     * @return the hargaPendapatan
     */
    public BigInteger getHargaPendapatan() {
        return hargaPendapatan;
    }

    /**
     * @param hargaPendapatan the hargaPendapatan to set
     */
    public void setHargaPendapatan(BigInteger hargaPendapatan) {
        this.hargaPendapatan = hargaPendapatan;
    }

    /**
     * @return the statQty
     */
    public Character getStatQty() {
        return statQty;
    }

    /**
     * @param statQty the statQty to set
     */
    public void setStatQty(Character statQty) {
        this.statQty = statQty;
    }

    /**
     * @return the statDok
     */
    public Character getStatDok() {
        return statDok;
    }

    /**
     * @param statDok the statDok to set
     */
    public void setStatDok(Character statDok) {
        this.statDok = statDok;
    }

    /**
     * @return the pdppr
     */
    public Integer getPdppr() {
        return pdppr;
    }

    /**
     * @param pdppr the pdppr to set
     */
    public void setPdppr(Integer pdppr) {
        this.pdppr = pdppr;
    }

    /**
     * @return the statHrgUmkls
     */
    public Character getStatHrgUmkls() {
        return statHrgUmkls;
    }

    /**
     * @param statHrgUmkls the statHrgUmkls to set
     */
    public void setStatHrgUmkls(Character statHrgUmkls) {
        this.statHrgUmkls = statHrgUmkls;
    }

    /**
     * @return the level
     */
    public Character getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(Character level) {
        this.level = level;
    }

    /**
     * @return the pdprk
     */
    public String getPdprk() {
        return pdprk;
    }

    /**
     * @param pdprk the pdprk to set
     */
    public void setPdprk(String pdprk) {
        this.pdprk = pdprk;
    }

    /**
     * @return the unitTdkSub
     */
    public Character getUnitTdkSub() {
        return unitTdkSub;
    }

    /**
     * @param unitTdkSub the unitTdkSub to set
     */
    public void setUnitTdkSub(Character unitTdkSub) {
        this.unitTdkSub = unitTdkSub;
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
     * @return the namaCetak
     */
    public String getNamaCetak() {
        return namaCetak;
    }

    /**
     * @param namaCetak the namaCetak to set
     */
    public void setNamaCetak(String namaCetak) {
        this.namaCetak = namaCetak;
    }

    /**
     * @return the komisiDokrp
     */
    public BigInteger getKomisiDokrp() {
        return komisiDokrp;
    }

    /**
     * @param komisiDokrp the komisiDokrp to set
     */
    public void setKomisiDokrp(BigInteger komisiDokrp) {
        this.komisiDokrp = komisiDokrp;
    }

    /**
     * @return the komisiDokp
     */
    public Float getKomisiDokp() {
        return komisiDokp;
    }

    /**
     * @param komisiDokp the komisiDokp to set
     */
    public void setKomisiDokp(Float komisiDokp) {
        this.komisiDokp = komisiDokp;
    }

    /**
     * @return the jnsPdpDok
     */
    public Character getJnsPdpDok() {
        return jnsPdpDok;
    }

    /**
     * @param jnsPdpDok the jnsPdpDok to set
     */
    public void setJnsPdpDok(Character jnsPdpDok) {
        this.jnsPdpDok = jnsPdpDok;
    }

    /**
     * @return the kodeUnit
     */
    public UnitKerja getKodeUnit() {
        return kodeUnit;
    }

    /**
     * @param kodeUnit the kodeUnit to set
     */
    public void setKodeUnit(UnitKerja kodeUnit) {
        this.kodeUnit = kodeUnit;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kodePdp != null ? kodePdp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KodeTarif)) {
            return false;
        }
        KodeTarif other = (KodeTarif) object;
        if ((this.kodePdp == null && other.kodePdp != null) || (this.kodePdp != null && !this.kodePdp.equals(other.kodePdp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitrisoft.ranap17.entity.KodeTarif[ kodePdp=" + kodePdp + " ]";
    }
}
