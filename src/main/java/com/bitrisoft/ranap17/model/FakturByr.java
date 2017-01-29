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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Developer
 */
public class FakturByr implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_faktur")
    private Long idFaktur;
    @Basic(optional = false)
    @Column(name = "tgl_faktur")
    private long tglFaktur;
    @Column(name = "tgl_keluar")
    private String tglKeluar;
    @Column(name = "sub_tagihan")
    private BigInteger subTagihan;
    @Column(name = "potongan")
    private BigInteger potongan;
    @Column(name = "tagihan")
    private BigInteger tagihan;
    @Column(name = "krdt_piutang")
    private BigInteger krdtPiutang;
    @Column(name = "sisa_tagihan")
    private BigInteger sisaTagihan;
    @Column(name = "stat_lunas")
    private Character statLunas;
    @Column(name = "cara_bayar")
    private Character caraBayar;
    @Column(name = "shift")
    private Character shift;
    @Column(name = "no_bukti")
    private String noBukti;
    @Column(name = "stat_tdk_byr")
    private Character statTdkByr;
    @Column(name = "dpst_kembali")
    private BigInteger dpstKembali;
    @Column(name = "bayar_bpjs")
    private BigInteger bayarBpjs;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "adm_ri")
    private Float admRi;
    @Column(name = "adm_rj_ri")
    private BigInteger admRjRi;
    @Column(name = "titipan")
    private BigInteger titipan;
    @Column(name = "byr_penjamin")
    private BigInteger byrPenjamin;
    @Column(name = "byr_sendiri")
    private BigInteger byrSendiri;
    @Column(name = "byr_cash")
    private BigInteger byrCash;
    @Column(name = "byr_card")
    private BigInteger byrCard;
    @Column(name = "bayar")
    private BigInteger bayar;
    @Column(name = "kembali")
    private BigInteger kembali;
    @Column(name = "no_kasir")
    private Character noKasir;
    @Column(name = "lama_rawat")
    private Integer lamaRawat;
    @Column(name = "nota_untuk")
    private String notaUntuk;
    @Column(name = "fbksr")
    private String fbksr;
    @Column(name = "checking_mnj")
    private Character checkingMnj;
    @Column(name = "id_opr")
    private String idOpr;
    @Column(name = "cetak_um")
    private Character cetakUm;
    @JoinColumn(name = "kode_jnsbyr", referencedColumnName = "id_jns_byr")
    @ManyToOne(fetch = FetchType.EAGER)
    private JenisBayar kodeJnsbyr;
    @JoinColumn(name = "no_bill", referencedColumnName = "no_bill")
    @ManyToOne(fetch = FetchType.EAGER)
    private Pendaftaran noBill;

    /**
     * @return the idFaktur
     */
    public Long getIdFaktur() {
        return idFaktur;
    }

    /**
     * @param idFaktur the idFaktur to set
     */
    public void setIdFaktur(Long idFaktur) {
        this.idFaktur = idFaktur;
    }

    /**
     * @return the tglFaktur
     */
    public long getTglFaktur() {
        return tglFaktur;
    }

    /**
     * @param tglFaktur the tglFaktur to set
     */
    public void setTglFaktur(long tglFaktur) {
        this.tglFaktur = tglFaktur;
    }

    /**
     * @return the tglKeluar
     */
    public String getTglKeluar() {
        return tglKeluar;
    }

    /**
     * @param tglKeluar the tglKeluar to set
     */
    public void setTglKeluar(String tglKeluar) {
        this.tglKeluar = tglKeluar;
    }

    /**
     * @return the subTagihan
     */
    public BigInteger getSubTagihan() {
        return subTagihan;
    }

    /**
     * @param subTagihan the subTagihan to set
     */
    public void setSubTagihan(BigInteger subTagihan) {
        this.subTagihan = subTagihan;
    }

    /**
     * @return the potongan
     */
    public BigInteger getPotongan() {
        return potongan;
    }

    /**
     * @param potongan the potongan to set
     */
    public void setPotongan(BigInteger potongan) {
        this.potongan = potongan;
    }

    /**
     * @return the tagihan
     */
    public BigInteger getTagihan() {
        return tagihan;
    }

    /**
     * @param tagihan the tagihan to set
     */
    public void setTagihan(BigInteger tagihan) {
        this.tagihan = tagihan;
    }

    /**
     * @return the krdtPiutang
     */
    public BigInteger getKrdtPiutang() {
        return krdtPiutang;
    }

    /**
     * @param krdtPiutang the krdtPiutang to set
     */
    public void setKrdtPiutang(BigInteger krdtPiutang) {
        this.krdtPiutang = krdtPiutang;
    }

    /**
     * @return the sisaTagihan
     */
    public BigInteger getSisaTagihan() {
        return sisaTagihan;
    }

    /**
     * @param sisaTagihan the sisaTagihan to set
     */
    public void setSisaTagihan(BigInteger sisaTagihan) {
        this.sisaTagihan = sisaTagihan;
    }

    /**
     * @return the statLunas
     */
    public Character getStatLunas() {
        return statLunas;
    }

    /**
     * @param statLunas the statLunas to set
     */
    public void setStatLunas(Character statLunas) {
        this.statLunas = statLunas;
    }

    /**
     * @return the caraBayar
     */
    public Character getCaraBayar() {
        return caraBayar;
    }

    /**
     * @param caraBayar the caraBayar to set
     */
    public void setCaraBayar(Character caraBayar) {
        this.caraBayar = caraBayar;
    }

    /**
     * @return the shift
     */
    public Character getShift() {
        return shift;
    }

    /**
     * @param shift the shift to set
     */
    public void setShift(Character shift) {
        this.shift = shift;
    }

    /**
     * @return the noBukti
     */
    public String getNoBukti() {
        return noBukti;
    }

    /**
     * @param noBukti the noBukti to set
     */
    public void setNoBukti(String noBukti) {
        this.noBukti = noBukti;
    }

    /**
     * @return the statTdkByr
     */
    public Character getStatTdkByr() {
        return statTdkByr;
    }

    /**
     * @param statTdkByr the statTdkByr to set
     */
    public void setStatTdkByr(Character statTdkByr) {
        this.statTdkByr = statTdkByr;
    }

    /**
     * @return the dpstKembali
     */
    public BigInteger getDpstKembali() {
        return dpstKembali;
    }

    /**
     * @param dpstKembali the dpstKembali to set
     */
    public void setDpstKembali(BigInteger dpstKembali) {
        this.dpstKembali = dpstKembali;
    }

    /**
     * @return the bayarBpjs
     */
    public BigInteger getBayarBpjs() {
        return bayarBpjs;
    }

    /**
     * @param bayarBpjs the bayarBpjs to set
     */
    public void setBayarBpjs(BigInteger bayarBpjs) {
        this.bayarBpjs = bayarBpjs;
    }

    /**
     * @return the admRi
     */
    public Float getAdmRi() {
        return admRi;
    }

    /**
     * @param admRi the admRi to set
     */
    public void setAdmRi(Float admRi) {
        this.admRi = admRi;
    }

    /**
     * @return the admRjRi
     */
    public BigInteger getAdmRjRi() {
        return admRjRi;
    }

    /**
     * @param admRjRi the admRjRi to set
     */
    public void setAdmRjRi(BigInteger admRjRi) {
        this.admRjRi = admRjRi;
    }

    /**
     * @return the titipan
     */
    public BigInteger getTitipan() {
        return titipan;
    }

    /**
     * @param titipan the titipan to set
     */
    public void setTitipan(BigInteger titipan) {
        this.titipan = titipan;
    }

    /**
     * @return the byrPenjamin
     */
    public BigInteger getByrPenjamin() {
        return byrPenjamin;
    }

    /**
     * @param byrPenjamin the byrPenjamin to set
     */
    public void setByrPenjamin(BigInteger byrPenjamin) {
        this.byrPenjamin = byrPenjamin;
    }

    /**
     * @return the byrSendiri
     */
    public BigInteger getByrSendiri() {
        return byrSendiri;
    }

    /**
     * @param byrSendiri the byrSendiri to set
     */
    public void setByrSendiri(BigInteger byrSendiri) {
        this.byrSendiri = byrSendiri;
    }

    /**
     * @return the byrCash
     */
    public BigInteger getByrCash() {
        return byrCash;
    }

    /**
     * @param byrCash the byrCash to set
     */
    public void setByrCash(BigInteger byrCash) {
        this.byrCash = byrCash;
    }

    /**
     * @return the byrCard
     */
    public BigInteger getByrCard() {
        return byrCard;
    }

    /**
     * @param byrCard the byrCard to set
     */
    public void setByrCard(BigInteger byrCard) {
        this.byrCard = byrCard;
    }

    /**
     * @return the bayar
     */
    public BigInteger getBayar() {
        return bayar;
    }

    /**
     * @param bayar the bayar to set
     */
    public void setBayar(BigInteger bayar) {
        this.bayar = bayar;
    }

    /**
     * @return the kembali
     */
    public BigInteger getKembali() {
        return kembali;
    }

    /**
     * @param kembali the kembali to set
     */
    public void setKembali(BigInteger kembali) {
        this.kembali = kembali;
    }

    /**
     * @return the noKasir
     */
    public Character getNoKasir() {
        return noKasir;
    }

    /**
     * @param noKasir the noKasir to set
     */
    public void setNoKasir(Character noKasir) {
        this.noKasir = noKasir;
    }

    /**
     * @return the lamaRawat
     */
    public Integer getLamaRawat() {
        return lamaRawat;
    }

    /**
     * @param lamaRawat the lamaRawat to set
     */
    public void setLamaRawat(Integer lamaRawat) {
        this.lamaRawat = lamaRawat;
    }

    /**
     * @return the notaUntuk
     */
    public String getNotaUntuk() {
        return notaUntuk;
    }

    /**
     * @param notaUntuk the notaUntuk to set
     */
    public void setNotaUntuk(String notaUntuk) {
        this.notaUntuk = notaUntuk;
    }

    /**
     * @return the fbksr
     */
    public String getFbksr() {
        return fbksr;
    }

    /**
     * @param fbksr the fbksr to set
     */
    public void setFbksr(String fbksr) {
        this.fbksr = fbksr;
    }

    /**
     * @return the checkingMnj
     */
    public Character getCheckingMnj() {
        return checkingMnj;
    }

    /**
     * @param checkingMnj the checkingMnj to set
     */
    public void setCheckingMnj(Character checkingMnj) {
        this.checkingMnj = checkingMnj;
    }

    /**
     * @return the idOpr
     */
    public String getIdOpr() {
        return idOpr;
    }

    /**
     * @param idOpr the idOpr to set
     */
    public void setIdOpr(String idOpr) {
        this.idOpr = idOpr;
    }

    /**
     * @return the cetakUm
     */
    public Character getCetakUm() {
        return cetakUm;
    }

    /**
     * @param cetakUm the cetakUm to set
     */
    public void setCetakUm(Character cetakUm) {
        this.cetakUm = cetakUm;
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
     * @return the noBill
     */
    public Pendaftaran getNoBill() {
        return noBill;
    }

    /**
     * @param noBill the noBill to set
     */
    public void setNoBill(Pendaftaran noBill) {
        this.noBill = noBill;
    }
}
