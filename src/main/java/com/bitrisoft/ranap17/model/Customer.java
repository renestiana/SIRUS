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
 * @author Reni
 */
@Entity
public class Customer implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_customer")
    private String idCustomer;
    @Basic(optional = false)
    @Column(name =  "nama_customer")
    private String namaCustomer;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "stat_akt")
    private String statAkt;
    @Column(name = "piu_rj")
    private String piuRj;
    @Column(name = "piu_ri")
    private String piuRi;
    @Column(name = "kota")
    private String kota;
    @Column(name = "stat_ri_rj")
    private String statRiRj;
    @Column(name = "uang_muka")
    private BigInteger uangMuka;
    @Column(name = "cspfr")
    private Float cspfr;
    @Column(name = "cspfb")
    private Float cspfb;
    @Column(name = "cspfp")
    private Float cspfp;
    @Column(name = "csdsr")
    private Float csdsr;
    @Column(name = "cspr1")
    private Float cspr1;
    @Column(name = "cspr2")
    private Float cspr2;
    @Column(name = "cspr3")
    private Float cspr3;
    @Column(name = "profit_kredit")
    private Float profitKredit;
    @Column(name = "point_belanja")
    private Float pointBelanja;
    @Column(name = "stat_asuransi")
    private String statAsuransi;
    @Column(name = "stat_anggota")
    private String statAnggota;
    @Column(name = "jum_anggota")
    private Integer jumAnggota;
    @Column(name = "racik_jalan")
    private Float racikJalan;
    @Column(name = "racik2_jalan")
    private Float racik2Jalan;
    @Column(name = "racik3_jalan")
    private Float racik3Jalan;
    @Column(name = "bebas_jalan")
    private Float bebasJalan;
    @Column(name = "paten_jalan")
    private Float patenJalan;
    @Column(name = "jenis_laporan")
    private String jenisLaporan;

    /**
     * @return the idCustomer
     */
    public String getIdCustomer() {
        return idCustomer;
    }

    /**
     * @param idCustomer the idCustomer to set
     */
    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    /**
     * @return the namaCustomer
     */
    public String getNamaCustomer() {
        return namaCustomer;
    }

    /**
     * @param namaCustomer the namaCustomer to set
     */
    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the statAkt
     */
    public String getStatAkt() {
        return statAkt;
    }

    /**
     * @param statAkt the statAkt to set
     */
    public void setStatAkt(String statAkt) {
        this.statAkt = statAkt;
    }

    /**
     * @return the piuRj
     */
    public String getPiuRj() {
        return piuRj;
    }

    /**
     * @param piuRj the piuRj to set
     */
    public void setPiuRj(String piuRj) {
        this.piuRj = piuRj;
    }

    /**
     * @return the piuRi
     */
    public String getPiuRi() {
        return piuRi;
    }

    /**
     * @param piuRi the piuRi to set
     */
    public void setPiuRi(String piuRi) {
        this.piuRi = piuRi;
    }

    /**
     * @return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    /**
     * @return the statRiRj
     */
    public String getStatRiRj() {
        return statRiRj;
    }

    /**
     * @param statRiRj the statRiRj to set
     */
    public void setStatRiRj(String statRiRj) {
        this.statRiRj = statRiRj;
    }

    /**
     * @return the uangMuka
     */
    public BigInteger getUangMuka() {
        return uangMuka;
    }

    /**
     * @param uangMuka the uangMuka to set
     */
    public void setUangMuka(BigInteger uangMuka) {
        this.uangMuka = uangMuka;
    }

    /**
     * @return the cspfr
     */
    public Float getCspfr() {
        return cspfr;
    }

    /**
     * @param cspfr the cspfr to set
     */
    public void setCspfr(Float cspfr) {
        this.cspfr = cspfr;
    }

    /**
     * @return the cspfb
     */
    public Float getCspfb() {
        return cspfb;
    }

    /**
     * @param cspfb the cspfb to set
     */
    public void setCspfb(Float cspfb) {
        this.cspfb = cspfb;
    }

    /**
     * @return the cspfp
     */
    public Float getCspfp() {
        return cspfp;
    }

    /**
     * @param cspfp the cspfp to set
     */
    public void setCspfp(Float cspfp) {
        this.cspfp = cspfp;
    }

    /**
     * @return the csdsr
     */
    public Float getCsdsr() {
        return csdsr;
    }

    /**
     * @param csdsr the csdsr to set
     */
    public void setCsdsr(Float csdsr) {
        this.csdsr = csdsr;
    }

    /**
     * @return the cspr1
     */
    public Float getCspr1() {
        return cspr1;
    }

    /**
     * @param cspr1 the cspr1 to set
     */
    public void setCspr1(Float cspr1) {
        this.cspr1 = cspr1;
    }

    /**
     * @return the cspr2
     */
    public Float getCspr2() {
        return cspr2;
    }

    /**
     * @param cspr2 the cspr2 to set
     */
    public void setCspr2(Float cspr2) {
        this.cspr2 = cspr2;
    }

    /**
     * @return the cspr3
     */
    public Float getCspr3() {
        return cspr3;
    }

    /**
     * @param cspr3 the cspr3 to set
     */
    public void setCspr3(Float cspr3) {
        this.cspr3 = cspr3;
    }

    /**
     * @return the profitKredit
     */
    public Float getProfitKredit() {
        return profitKredit;
    }

    /**
     * @param profitKredit the profitKredit to set
     */
    public void setProfitKredit(Float profitKredit) {
        this.profitKredit = profitKredit;
    }

    /**
     * @return the pointBelanja
     */
    public Float getPointBelanja() {
        return pointBelanja;
    }

    /**
     * @param pointBelanja the pointBelanja to set
     */
    public void setPointBelanja(Float pointBelanja) {
        this.pointBelanja = pointBelanja;
    }

    /**
     * @return the statAsuransi
     */
    public String getStatAsuransi() {
        return statAsuransi;
    }

    /**
     * @param statAsuransi the statAsuransi to set
     */
    public void setStatAsuransi(String statAsuransi) {
        this.statAsuransi = statAsuransi;
    }

    /**
     * @return the statAnggota
     */
    public String getStatAnggota() {
        return statAnggota;
    }

    /**
     * @param statAnggota the statAnggota to set
     */
    public void setStatAnggota(String statAnggota) {
        this.statAnggota = statAnggota;
    }

    /**
     * @return the jumAnggota
     */
    public Integer getJumAnggota() {
        return jumAnggota;
    }

    /**
     * @param jumAnggota the jumAnggota to set
     */
    public void setJumAnggota(Integer jumAnggota) {
        this.jumAnggota = jumAnggota;
    }

    /**
     * @return the racikJalan
     */
    public Float getRacikJalan() {
        return racikJalan;
    }

    /**
     * @param racikJalan the racikJalan to set
     */
    public void setRacikJalan(Float racikJalan) {
        this.racikJalan = racikJalan;
    }

    /**
     * @return the racik2Jalan
     */
    public Float getRacik2Jalan() {
        return racik2Jalan;
    }

    /**
     * @param racik2Jalan the racik2Jalan to set
     */
    public void setRacik2Jalan(Float racik2Jalan) {
        this.racik2Jalan = racik2Jalan;
    }

    /**
     * @return the racik3Jalan
     */
    public Float getRacik3Jalan() {
        return racik3Jalan;
    }

    /**
     * @param racik3Jalan the racik3Jalan to set
     */
    public void setRacik3Jalan(Float racik3Jalan) {
        this.racik3Jalan = racik3Jalan;
    }

    /**
     * @return the bebasJalan
     */
    public Float getBebasJalan() {
        return bebasJalan;
    }

    /**
     * @param bebasJalan the bebasJalan to set
     */
    public void setBebasJalan(Float bebasJalan) {
        this.bebasJalan = bebasJalan;
    }

    /**
     * @return the patenJalan
     */
    public Float getPatenJalan() {
        return patenJalan;
    }

    /**
     * @param patenJalan the patenJalan to set
     */
    public void setPatenJalan(Float patenJalan) {
        this.patenJalan = patenJalan;
    }

    /**
     * @return the jenisLaporan
     */
    public String getJenisLaporan() {
        return jenisLaporan;
    }

    /**
     * @param jenisLaporan the jenisLaporan to set
     */
    public void setJenisLaporan(String jenisLaporan) {
        this.jenisLaporan = jenisLaporan;
    }
    
    
    
}
