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
public class RmPasien implements Serializable {

    /**
     * @return the noRm
     */
    public String getNoRm() {
        return noRm;
    }

    /**
     * @param noRm the noRm to set
     */
    public void setNoRm(String noRm) {
        this.noRm = noRm;
    }

    /**
     * @return the namaPasien
     */
    public String getNamaPasien() {
        return namaPasien;
    }

    /**
     * @param namaPasien the namaPasien to set
     */
    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    /**
     * @return the tglLahir
     */
    public BigInteger getTglLahir() {
        return tglLahir;
    }

    /**
     * @param tglLahir the tglLahir to set
     */
    public void setTglLahir(BigInteger tglLahir) {
        this.tglLahir = tglLahir;
    }

    /**
     * @return the jenisKelamin
     */
    public Character getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * @param jenisKelamin the jenisKelamin to set
     */
    public void setJenisKelamin(Character jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    /**
     * @return the statusDaftar
     */
    public Character getStatusDaftar() {
        return statusDaftar;
    }

    /**
     * @param statusDaftar the statusDaftar to set
     */
    public void setStatusDaftar(Character statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    /**
     * @return the statusPasien
     */
    public Character getStatusPasien() {
        return statusPasien;
    }

    /**
     * @param statusPasien the statusPasien to set
     */
    public void setStatusPasien(Character statusPasien) {
        this.statusPasien = statusPasien;
    }

    /**
     * @return the namaSui
     */
    public String getNamaSui() {
        return namaSui;
    }

    /**
     * @param namaSui the namaSui to set
     */
    public void setNamaSui(String namaSui) {
        this.namaSui = namaSui;
    }

    /**
     * @return the namaAyah
     */
    public String getNamaAyah() {
        return namaAyah;
    }

    /**
     * @param namaAyah the namaAyah to set
     */
    public void setNamaAyah(String namaAyah) {
        this.namaAyah = namaAyah;
    }

    /**
     * @return the namaIbu
     */
    public String getNamaIbu() {
        return namaIbu;
    }

    /**
     * @param namaIbu the namaIbu to set
     */
    public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
    }

    /**
     * @return the pekerjaan
     */
    public Character getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(Character pekerjaan) {
        this.pekerjaan = pekerjaan;
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
     * @return the rtw
     */
    public String getRtw() {
        return rtw;
    }

    /**
     * @param rtw the rtw to set
     */
    public void setRtw(String rtw) {
        this.rtw = rtw;
    }

    /**
     * @return the kelurahan
     */
    public String getKelurahan() {
        return kelurahan;
    }

    /**
     * @param kelurahan the kelurahan to set
     */
    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    /**
     * @return the kecamatan
     */
    public String getKecamatan() {
        return kecamatan;
    }

    /**
     * @param kecamatan the kecamatan to set
     */
    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
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
     * @return the kodePos
     */
    public String getKodePos() {
        return kodePos;
    }

    /**
     * @param kodePos the kodePos to set
     */
    public void setKodePos(String kodePos) {
        this.kodePos = kodePos;
    }

    /**
     * @return the rmAktf
     */
    public Character getRmAktf() {
        return rmAktf;
    }

    /**
     * @param rmAktf the rmAktf to set
     */
    public void setRmAktf(Character rmAktf) {
        this.rmAktf = rmAktf;
    }

    /**
     * @return the jenisRm
     */
    public Character getJenisRm() {
        return jenisRm;
    }

    /**
     * @param jenisRm the jenisRm to set
     */
    public void setJenisRm(Character jenisRm) {
        this.jenisRm = jenisRm;
    }

    /**
     * @return the telepon
     */
    public String getTelepon() {
        return telepon;
    }

    /**
     * @param telepon the telepon to set
     */
    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    /**
     * @return the kodeCust
     */
    public String getKodeCust() {
        return kodeCust;
    }

    /**
     * @param kodeCust the kodeCust to set
     */
    public void setKodeCust(String kodeCust) {
        this.kodeCust = kodeCust;
    }

    /**
     * @return the golDarah
     */
    public String getGolDarah() {
        return golDarah;
    }

    /**
     * @param golDarah the golDarah to set
     */
    public void setGolDarah(String golDarah) {
        this.golDarah = golDarah;
    }

    /**
     * @return the agama
     */
    public Character getAgama() {
        return agama;
    }

    /**
     * @param agama the agama to set
     */
    public void setAgama(Character agama) {
        this.agama = agama;
    }

    /**
     * @return the tglRm
     */
    public BigInteger getTglRm() {
        return tglRm;
    }

    /**
     * @param tglRm the tglRm to set
     */
    public void setTglRm(BigInteger tglRm) {
        this.tglRm = tglRm;
    }

    /**
     * @return the statusBayar
     */
    public Character getStatusBayar() {
        return statusBayar;
    }

    /**
     * @param statusBayar the statusBayar to set
     */
    public void setStatusBayar(Character statusBayar) {
        this.statusBayar = statusBayar;
    }

    /**
     * @return the nik
     */
    public String getNik() {
        return nik;
    }

    /**
     * @param nik the nik to set
     */
    public void setNik(String nik) {
        this.nik = nik;
    }

    /**
     * @return the noBpjsAsr
     */
    public String getNoBpjsAsr() {
        return noBpjsAsr;
    }

    /**
     * @param noBpjsAsr the noBpjsAsr to set
     */
    public void setNoBpjsAsr(String noBpjsAsr) {
        this.noBpjsAsr = noBpjsAsr;
    }

    /**
     * @return the ketPekerjaan
     */
    public String getKetPekerjaan() {
        return ketPekerjaan;
    }

    /**
     * @param ketPekerjaan the ketPekerjaan to set
     */
    public void setKetPekerjaan(String ketPekerjaan) {
        this.ketPekerjaan = ketPekerjaan;
    }

    /**
     * @return the ketPjawab
     */
    public String getKetPjawab() {
        return ketPjawab;
    }

    /**
     * @param ketPjawab the ketPjawab to set
     */
    public void setKetPjawab(String ketPjawab) {
        this.ketPjawab = ketPjawab;
    }

    /**
     * @return the kodeJnsByr
     */
    public JenisBayar getKodeJnsByr() {
        return kodeJnsByr;
    }

    /**
     * @param kodeJnsByr the kodeJnsByr to set
     */
    public void setKodeJnsByr(JenisBayar kodeJnsByr) {
        this.kodeJnsByr = kodeJnsByr;
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "no_rm")
    private String noRm;
    @Basic(optional = false)
    @Column(name = "nama_pasien")
    private String namaPasien;
    @Column(name = "tgl_lahir")
    private BigInteger tglLahir;
    @Column(name = "jenis_kelamin")
    private Character jenisKelamin;
    @Column(name = "status_daftar")
    private Character statusDaftar;
    @Column(name = "status_pasien")
    private Character statusPasien;
    @Column(name = "nama_sui")
    private String namaSui;
    @Column(name = "nama_ayah")
    private String namaAyah;
    @Column(name = "nama_ibu")
    private String namaIbu;
    @Column(name = "pekerjaan")
    private Character pekerjaan;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "rtw")
    private String rtw;
    @Column(name = "kelurahan")
    private String kelurahan;
    @Column(name = "kecamatan")
    private String kecamatan;
    @Column(name = "kota")
    private String kota;
    @Column(name = "kode_pos")
    private String kodePos;
    @Column(name = "rm_aktf")
    private Character rmAktf;
    @Column(name = "jenis_rm")
    private Character jenisRm;
    @Column(name = "telepon")
    private String telepon;
    @Column(name = "kode_cust")
    private String kodeCust;
    @Column(name = "gol_darah")
    private String golDarah;
    @Column(name = "agama")
    private Character agama;
    @Column(name = "tgl_rm")
    private BigInteger tglRm;
    @Column(name = "status_bayar")
    private Character statusBayar;
    @Column(name = "nik")
    private String nik;
    @Column(name = "no_bpjs_asr")
    private String noBpjsAsr;
    @Column(name = "ket_pekerjaan")
    private String ketPekerjaan;
    @Column(name = "ket_pjawab")
    private String ketPjawab;
    @JoinColumn(name = "kode_jns_byr", referencedColumnName = "id_jns_byr")
    @ManyToOne(fetch = FetchType.EAGER)
    private JenisBayar kodeJnsByr;
}
