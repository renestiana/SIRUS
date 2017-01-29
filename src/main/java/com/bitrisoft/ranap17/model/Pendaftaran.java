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
public class Pendaftaran implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "no_bill")
    private String noBill;
    @Basic(optional = false)
    @Column(name = "tgl_daftar")
    private long tglDaftar;
    @Column(name = "jenis_rawat")
    private Character jenisRawat;
    @Column(name = "stat_daftar")
    private Character statDaftar;
    @Column(name = "stat_pasien")
    private Character statPasien;
    @Column(name = "id_opr_wkt")
    private String idOprWkt;
    @Column(name = "procdr_masuk")
    private Character procdrMasuk;
    @Column(name = "cara_masuk")
    private Character caraMasuk;
    @Column(name = "ket_crmsk")
    private String ketCrmsk;
    @Column(name = "jam_masuk")
    private String jamMasuk;
    @Column(name = "pg_jawab")
    private String pgJawab;
    @Column(name = "stat_pgjwb")
    private Character statPgjwb;
    @Column(name = "pekerjaan_pgjwb")
    private Character pekerjaanPgjwb;
    @Column(name = "alamat_pgjwb")
    private String alamatPgjwb;
    @Column(name = "ktp_pgjwb")
    private String ktpPgjwb;
    @Column(name = "umur_pgjwb")
    private String umurPgjwb;
    @Column(name = "petugas")
    private String petugas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "resep_rc")
    private Float resepRc;
    @Column(name = "resep_paten")
    private Float resepPaten;
    @Column(name = "resep_discount")
    private Float resepDiscount;
    @Column(name = "diagnosa")
    private String diagnosa;
    @Column(name = "poli_ruang")
    private Character poliRuang;
    @Column(name = "kelas")
    private String kelas;
    @Column(name = "stat_bpjs_asr")
    private Character statBpjsAsr;
    @Column(name = "no_bpjs_asr")
    private String noBpjsAsr;
    @Column(name = "daftar_ke")
    private Integer daftarKe;
    @Column(name = "dfjkp")
    private String dfjkp;
    @JoinColumn(name = "dokter1", referencedColumnName = "id_dokter")
    @ManyToOne(fetch = FetchType.EAGER)
    private Dokter dokter1;
    @JoinColumn(name = "dokter2", referencedColumnName = "id_dokter")
    @ManyToOne(fetch = FetchType.EAGER)
    private Dokter dokter2;
    @JoinColumn(name = "dokter3", referencedColumnName = "id_dokter")
    @ManyToOne(fetch = FetchType.EAGER)
    private Dokter dokter3;
    @JoinColumn(name = "kode_jnsbyr", referencedColumnName = "id_jns_byr")
    @ManyToOne(fetch = FetchType.EAGER)
    private JenisBayar kodeJnsbyr;
    @JoinColumn(name = "kamar", referencedColumnName = "id_kamar")
    @ManyToOne(fetch = FetchType.EAGER)
    private KamarPasien kamar;
    @JoinColumn(name = "no_rm", referencedColumnName = "no_rm")
    @ManyToOne(fetch = FetchType.EAGER)
    private RmPasien noRm;
    @JoinColumn(name = "kode_unit", referencedColumnName = "id_unit")
    @ManyToOne(fetch = FetchType.EAGER)
    private UnitKerja kodeUnit;
    
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
    public long getTglDaftar() {
        return tglDaftar;
    }

    /**
     * @param tglDaftar the tglDaftar to set
     */
    public void setTglDaftar(long tglDaftar) {
        this.tglDaftar = tglDaftar;
    }

    /**
     * @return the jenisRawat
     */
    public Character getJenisRawat() {
        return jenisRawat;
    }

    /**
     * @param jenisRawat the jenisRawat to set
     */
    public void setJenisRawat(Character jenisRawat) {
        this.jenisRawat = jenisRawat;
    }

    /**
     * @return the statDaftar
     */
    public Character getStatDaftar() {
        return statDaftar;
    }

    /**
     * @param statDaftar the statDaftar to set
     */
    public void setStatDaftar(Character statDaftar) {
        this.statDaftar = statDaftar;
    }

    /**
     * @return the statPasien
     */
    public Character getStatPasien() {
        return statPasien;
    }

    /**
     * @param statPasien the statPasien to set
     */
    public void setStatPasien(Character statPasien) {
        this.statPasien = statPasien;
    }

    /**
     * @return the idOprWkt
     */
    public String getIdOprWkt() {
        return idOprWkt;
    }

    /**
     * @param idOprWkt the idOprWkt to set
     */
    public void setIdOprWkt(String idOprWkt) {
        this.idOprWkt = idOprWkt;
    }

    /**
     * @return the procdrMasuk
     */
    public Character getProcdrMasuk() {
        return procdrMasuk;
    }

    /**
     * @param procdrMasuk the procdrMasuk to set
     */
    public void setProcdrMasuk(Character procdrMasuk) {
        this.procdrMasuk = procdrMasuk;
    }

    /**
     * @return the caraMasuk
     */
    public Character getCaraMasuk() {
        return caraMasuk;
    }

    /**
     * @param caraMasuk the caraMasuk to set
     */
    public void setCaraMasuk(Character caraMasuk) {
        this.caraMasuk = caraMasuk;
    }

    /**
     * @return the ketCrmsk
     */
    public String getKetCrmsk() {
        return ketCrmsk;
    }

    /**
     * @param ketCrmsk the ketCrmsk to set
     */
    public void setKetCrmsk(String ketCrmsk) {
        this.ketCrmsk = ketCrmsk;
    }

    /**
     * @return the jamMasuk
     */
    public String getJamMasuk() {
        return jamMasuk;
    }

    /**
     * @param jamMasuk the jamMasuk to set
     */
    public void setJamMasuk(String jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    /**
     * @return the pgJawab
     */
    public String getPgJawab() {
        return pgJawab;
    }

    /**
     * @param pgJawab the pgJawab to set
     */
    public void setPgJawab(String pgJawab) {
        this.pgJawab = pgJawab;
    }

    /**
     * @return the statPgjwb
     */
    public Character getStatPgjwb() {
        return statPgjwb;
    }

    /**
     * @param statPgjwb the statPgjwb to set
     */
    public void setStatPgjwb(Character statPgjwb) {
        this.statPgjwb = statPgjwb;
    }

    /**
     * @return the pekerjaanPgjwb
     */
    public Character getPekerjaanPgjwb() {
        return pekerjaanPgjwb;
    }

    /**
     * @param pekerjaanPgjwb the pekerjaanPgjwb to set
     */
    public void setPekerjaanPgjwb(Character pekerjaanPgjwb) {
        this.pekerjaanPgjwb = pekerjaanPgjwb;
    }

    /**
     * @return the alamatPgjwb
     */
    public String getAlamatPgjwb() {
        return alamatPgjwb;
    }

    /**
     * @param alamatPgjwb the alamatPgjwb to set
     */
    public void setAlamatPgjwb(String alamatPgjwb) {
        this.alamatPgjwb = alamatPgjwb;
    }

    /**
     * @return the ktpPgjwb
     */
    public String getKtpPgjwb() {
        return ktpPgjwb;
    }

    /**
     * @param ktpPgjwb the ktpPgjwb to set
     */
    public void setKtpPgjwb(String ktpPgjwb) {
        this.ktpPgjwb = ktpPgjwb;
    }

    /**
     * @return the umurPgjwb
     */
    public String getUmurPgjwb() {
        return umurPgjwb;
    }

    /**
     * @param umurPgjwb the umurPgjwb to set
     */
    public void setUmurPgjwb(String umurPgjwb) {
        this.umurPgjwb = umurPgjwb;
    }

    /**
     * @return the petugas
     */
    public String getPetugas() {
        return petugas;
    }

    /**
     * @param petugas the petugas to set
     */
    public void setPetugas(String petugas) {
        this.petugas = petugas;
    }

    /**
     * @return the resepRc
     */
    public Float getResepRc() {
        return resepRc;
    }

    /**
     * @param resepRc the resepRc to set
     */
    public void setResepRc(Float resepRc) {
        this.resepRc = resepRc;
    }

    /**
     * @return the resepPaten
     */
    public Float getResepPaten() {
        return resepPaten;
    }

    /**
     * @param resepPaten the resepPaten to set
     */
    public void setResepPaten(Float resepPaten) {
        this.resepPaten = resepPaten;
    }

    /**
     * @return the resepDiscount
     */
    public Float getResepDiscount() {
        return resepDiscount;
    }

    /**
     * @param resepDiscount the resepDiscount to set
     */
    public void setResepDiscount(Float resepDiscount) {
        this.resepDiscount = resepDiscount;
    }

    /**
     * @return the diagnosa
     */
    public String getDiagnosa() {
        return diagnosa;
    }

    /**
     * @param diagnosa the diagnosa to set
     */
    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }

    /**
     * @return the poliRuang
     */
    public Character getPoliRuang() {
        return poliRuang;
    }

    /**
     * @param poliRuang the poliRuang to set
     */
    public void setPoliRuang(Character poliRuang) {
        this.poliRuang = poliRuang;
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
     * @return the statBpjsAsr
     */
    public Character getStatBpjsAsr() {
        return statBpjsAsr;
    }

    /**
     * @param statBpjsAsr the statBpjsAsr to set
     */
    public void setStatBpjsAsr(Character statBpjsAsr) {
        this.statBpjsAsr = statBpjsAsr;
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
     * @return the daftarKe
     */
    public Integer getDaftarKe() {
        return daftarKe;
    }

    /**
     * @param daftarKe the daftarKe to set
     */
    public void setDaftarKe(Integer daftarKe) {
        this.daftarKe = daftarKe;
    }

    /**
     * @return the dfjkp
     */
    public String getDfjkp() {
        return dfjkp;
    }

    /**
     * @param dfjkp the dfjkp to set
     */
    public void setDfjkp(String dfjkp) {
        this.dfjkp = dfjkp;
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
     * @return the kodeJnsbyr
     */
    public JenisBayar getKodeJnsbyr() {
        return kodeJnsbyr;
    }

    /**
     * @param kodeJnsbyr the kodeJnsbyr to set
     */
    public void setKodeJnsbyr(JenisBayar kodeJnsbyr) {
        this.kodeJnsbyr = kodeJnsbyr;
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
        hash += (noBill != null ? noBill.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pendaftaran)) {
            return false;
        }
        Pendaftaran other = (Pendaftaran) object;
        if ((this.noBill == null && other.noBill != null) || (this.noBill != null && !this.noBill.equals(other.noBill))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.bitrisoft.sirus.entity.Pendaftaran[ noBill=" + noBill + " ]";
    }
}
