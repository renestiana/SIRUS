/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitrisoft.ranap17.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Developer
 */
@Entity
public class DaftarRawatInap implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "no_bill")
    private String noBill;
    @Column(name = "tgl_daftar")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tglDaftar;
    @Column(name = "tgl_mulai_rwt")
    @Temporal(TemporalType.DATE)
    private Date tglMulaiRwt;
    @Column(name = "jam_mulai_rwt")
    @Temporal(TemporalType.TIME)
    private Date jamMulaiRwt;
    @Column(name = "kelas")
    private String kelas;
    @Column(name = "masuk_dari")
    private String masukDari;
    @Column(name = "pengantar1")
    private String pengantar1;
    @Column(name = "pengantar2")
    private String pengantar2;
    @Column(name = "penerima1")
    private String penerima1;
    @Column(name = "penerima2")
    private String penerima2;
    @Column(name = "operator")
    private String operator;
    @Column(name = "tgl_pulang")
    @Temporal(TemporalType.DATE)
    private Date tglPulang;
    @Column(name = "jam_pulang")
    @Temporal(TemporalType.TIME)
    private Date jamPulang;
    @Column(name = "diagnosa1")
    private String diagnosa1;
    @Column(name = "diagnosa2")
    private String diagnosa2;
    @Column(name = "kode_icdx")
    private String kodeIcdx;
    @Column(name = "status_rawat")
    private Character statusRawat;
    @JoinColumn(name = "dokter1", referencedColumnName = "id_dokter")
    @ManyToOne(fetch = FetchType.EAGER)
    private Dokter dokter1;
    @JoinColumn(name = "dokter2", referencedColumnName = "id_dokter")
    @ManyToOne(fetch = FetchType.EAGER)
    private Dokter dokter2;
    @JoinColumn(name = "dokter3", referencedColumnName = "id_dokter")
    @ManyToOne(fetch = FetchType.EAGER)
    private Dokter dokter3;
    @JoinColumn(name = "kamar", referencedColumnName = "id_kamar")
    @ManyToOne(fetch = FetchType.EAGER)
    private KamarPasien kamar;
    @JoinColumn(name = "no_rm", referencedColumnName = "no_rm")
    @ManyToOne(fetch = FetchType.EAGER)
    private RmPasien noRm;
    
    /**
     * @return the noBill
     */
    public String getNoBill() {
        return noBill;
    }

    /**
     * @param noBill the noBill to set
     */
    public void setNoBill(String noBill) {
        this.noBill = noBill;
    }

    /**
     * @return the tglDaftar
     */
    public Date getTglDaftar() {
        return tglDaftar;
    }

    /**
     * @param tglDaftar the tglDaftar to set
     */
    public void setTglDaftar(Date tglDaftar) {
        this.tglDaftar = tglDaftar;
    }

    /**
     * @return the tglMulaiRwt
     */
    public Date getTglMulaiRwt() {
        return tglMulaiRwt;
    }

    /**
     * @param tglMulaiRwt the tglMulaiRwt to set
     */
    public void setTglMulaiRwt(Date tglMulaiRwt) {
        this.tglMulaiRwt = tglMulaiRwt;
    }

    /**
     * @return the jamMulaiRwt
     */
    public Date getJamMulaiRwt() {
        return jamMulaiRwt;
    }

    /**
     * @param jamMulaiRwt the jamMulaiRwt to set
     */
    public void setJamMulaiRwt(Date jamMulaiRwt) {
        this.jamMulaiRwt = jamMulaiRwt;
    }

    /**
     * @return the kelas
     */
    public String getKelas() {
        return kelas;
    }

    /**
     * @param kelas the kelas to set
     */
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    /**
     * @return the masukDari
     */
    public String getMasukDari() {
        return masukDari;
    }

    /**
     * @param masukDari the masukDari to set
     */
    public void setMasukDari(String masukDari) {
        this.masukDari = masukDari;
    }

    /**
     * @return the pengantar1
     */
    public String getPengantar1() {
        return pengantar1;
    }

    /**
     * @param pengantar1 the pengantar1 to set
     */
    public void setPengantar1(String pengantar1) {
        this.pengantar1 = pengantar1;
    }

    /**
     * @return the pengantar2
     */
    public String getPengantar2() {
        return pengantar2;
    }

    /**
     * @param pengantar2 the pengantar2 to set
     */
    public void setPengantar2(String pengantar2) {
        this.pengantar2 = pengantar2;
    }

    /**
     * @return the penerima1
     */
    public String getPenerima1() {
        return penerima1;
    }

    /**
     * @param penerima1 the penerima1 to set
     */
    public void setPenerima1(String penerima1) {
        this.penerima1 = penerima1;
    }

    /**
     * @return the penerima2
     */
    public String getPenerima2() {
        return penerima2;
    }

    /**
     * @param penerima2 the penerima2 to set
     */
    public void setPenerima2(String penerima2) {
        this.penerima2 = penerima2;
    }

    /**
     * @return the operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator the operator to set
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * @return the tglPulang
     */
    public Date getTglPulang() {
        return tglPulang;
    }

    /**
     * @param tglPulang the tglPulang to set
     */
    public void setTglPulang(Date tglPulang) {
        this.tglPulang = tglPulang;
    }

    /**
     * @return the jamPulang
     */
    public Date getJamPulang() {
        return jamPulang;
    }

    /**
     * @param jamPulang the jamPulang to set
     */
    public void setJamPulang(Date jamPulang) {
        this.jamPulang = jamPulang;
    }

    /**
     * @return the diagnosa1
     */
    public String getDiagnosa1() {
        return diagnosa1;
    }

    /**
     * @param diagnosa1 the diagnosa1 to set
     */
    public void setDiagnosa1(String diagnosa1) {
        this.diagnosa1 = diagnosa1;
    }

    /**
     * @return the diagnosa2
     */
    public String getDiagnosa2() {
        return diagnosa2;
    }

    /**
     * @param diagnosa2 the diagnosa2 to set
     */
    public void setDiagnosa2(String diagnosa2) {
        this.diagnosa2 = diagnosa2;
    }

    /**
     * @return the kodeIcdx
     */
    public String getKodeIcdx() {
        return kodeIcdx;
    }

    /**
     * @param kodeIcdx the kodeIcdx to set
     */
    public void setKodeIcdx(String kodeIcdx) {
        this.kodeIcdx = kodeIcdx;
    }

    /**
     * @return the statusRawat
     */
    public Character getStatusRawat() {
        return statusRawat;
    }

    /**
     * @param statusRawat the statusRawat to set
     */
    public void setStatusRawat(Character statusRawat) {
        this.statusRawat = statusRawat;
    }

    /**
     * @return the dokter1
     */
    public Dokter getDokter1() {
        return dokter1;
    }

    /**
     * @param dokter1 the dokter1 to set
     */
    public void setDokter1(Dokter dokter1) {
        this.dokter1 = dokter1;
    }

    /**
     * @return the dokter2
     */
    public Dokter getDokter2() {
        return dokter2;
    }

    /**
     * @param dokter2 the dokter2 to set
     */
    public void setDokter2(Dokter dokter2) {
        this.dokter2 = dokter2;
    }

    /**
     * @return the dokter3
     */
    public Dokter getDokter3() {
        return dokter3;
    }

    /**
     * @param dokter3 the dokter3 to set
     */
    public void setDokter3(Dokter dokter3) {
        this.dokter3 = dokter3;
    }

    /**
     * @return the kamar
     */
    public KamarPasien getKamar() {
        return kamar;
    }

    /**
     * @param kamar the kamar to set
     */
    public void setKamar(KamarPasien kamar) {
        this.kamar = kamar;
    }

    /**
     * @return the noRm
     */
    public RmPasien getNoRm() {
        return noRm;
    }

    /**
     * @param noRm the noRm to set
     */
    public void setNoRm(RmPasien noRm) {
        this.noRm = noRm;
    }    
    
}
