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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Reni
 */
@Entity
public class DokterPoli implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable=false)
    private String id;
    @JoinColumn(name = "kode_poli", referencedColumnName = "id_poli")
    @ManyToOne(fetch = FetchType.EAGER)
    private DaftarPoli kode_poli;    
    @Column(name = "sub_poli")
    private String subPoli;    
    @JoinColumn(name = "kode_dokter", referencedColumnName = "id_dokter")
    @ManyToOne(fetch = FetchType.EAGER)
    private Dokter kode_dokter;    
    @Column(name = "jam_pagi_mulai")
    @Temporal(TemporalType.TIME)
    private String jamPagiMulai;    
    @Column(name = "jam_pagi_selesai")
    @Temporal(TemporalType.TIME)
    private String jamPagiSelesai;    
    @Column(name = "jam_sore_mulai")
    @Temporal(TemporalType.TIME)
    private String jamSoreMulai;    
    @Column(name = "jam_sore_selesai")
    @Temporal(TemporalType.TIME)
    private String jamSoreSelesai;        
    @Column(name = "senin_pagi")
    private String seninPagi;    
    @Column(name = "senin_sore")
    private String seninSore;    
    @Column(name = "selasa_pagi")
    private String selasaPagi;    
    @Column(name = "selasa_sore")
    private String selasaSore;        
    @Column(name = "rabu_pagi")
    private String rabuPagi;    
    @Column(name = "rabu_sore")
    private String rabuSore;    
    @Column(name = "kamis_pagi")
    private String kamisPagi;    
    @Column(name = "kamis_sore")
    private String kamisSore;        
    @Column(name = "jumat_pagi")
    private String jumatPagi;    
    @Column(name = "jumat_sore")
    private String jumatSore;    
    @Column(name = "sabtu_pagi")
    private String sabtuPagi;    
    @Column(name = "sabtu_sore")
    private String sabtuSore;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the kode_poli
     */
    public DaftarPoli getKode_poli() {
        return kode_poli;
    }

    /**
     * @param kode_poli the kode_poli to set
     */
    public void setKode_poli(DaftarPoli kode_poli) {
        this.kode_poli = kode_poli;
    }

    /**
     * @return the subPoli
     */
    public String getSubPoli() {
        return subPoli;
    }

    /**
     * @param subPoli the subPoli to set
     */
    public void setSubPoli(String subPoli) {
        this.subPoli = subPoli;
    }

    /**
     * @return the kode_dokter
     */
    public Dokter getKode_dokter() {
        return kode_dokter;
    }

    /**
     * @param kode_dokter the kode_dokter to set
     */
    public void setKode_dokter(Dokter kode_dokter) {
        this.kode_dokter = kode_dokter;
    }

    /**
     * @return the jamPagiMulai
     */
    public String getJamPagiMulai() {
        return jamPagiMulai;
    }

    /**
     * @param jamPagiMulai the jamPagiMulai to set
     */
    public void setJamPagiMulai(String jamPagiMulai) {
        this.jamPagiMulai = jamPagiMulai;
    }

    /**
     * @return the jamPagiSelesai
     */
    public String getJamPagiSelesai() {
        return jamPagiSelesai;
    }

    /**
     * @param jamPagiSelesai the jamPagiSelesai to set
     */
    public void setJamPagiSelesai(String jamPagiSelesai) {
        this.jamPagiSelesai = jamPagiSelesai;
    }

    /**
     * @return the jamSoreMulai
     */
    public String getJamSoreMulai() {
        return jamSoreMulai;
    }

    /**
     * @param jamSoreMulai the jamSoreMulai to set
     */
    public void setJamSoreMulai(String jamSoreMulai) {
        this.jamSoreMulai = jamSoreMulai;
    }

    /**
     * @return the jamSoreSelesai
     */
    public String getJamSoreSelesai() {
        return jamSoreSelesai;
    }

    /**
     * @param jamSoreSelesai the jamSoreSelesai to set
     */
    public void setJamSoreSelesai(String jamSoreSelesai) {
        this.jamSoreSelesai = jamSoreSelesai;
    }

    /**
     * @return the seninPagi
     */
    public String getSeninPagi() {
        return seninPagi;
    }

    /**
     * @param seninPagi the seninPagi to set
     */
    public void setSeninPagi(String seninPagi) {
        this.seninPagi = seninPagi;
    }

    /**
     * @return the seninSore
     */
    public String getSeninSore() {
        return seninSore;
    }

    /**
     * @param seninSore the seninSore to set
     */
    public void setSeninSore(String seninSore) {
        this.seninSore = seninSore;
    }

    /**
     * @return the selasaPagi
     */
    public String getSelasaPagi() {
        return selasaPagi;
    }

    /**
     * @param selasaPagi the selasaPagi to set
     */
    public void setSelasaPagi(String selasaPagi) {
        this.selasaPagi = selasaPagi;
    }

    /**
     * @return the selasaSore
     */
    public String getSelasaSore() {
        return selasaSore;
    }

    /**
     * @param selasaSore the selasaSore to set
     */
    public void setSelasaSore(String selasaSore) {
        this.selasaSore = selasaSore;
    }

    /**
     * @return the rabuPagi
     */
    public String getRabuPagi() {
        return rabuPagi;
    }

    /**
     * @param rabuPagi the rabuPagi to set
     */
    public void setRabuPagi(String rabuPagi) {
        this.rabuPagi = rabuPagi;
    }

    /**
     * @return the rabuSore
     */
    public String getRabuSore() {
        return rabuSore;
    }

    /**
     * @param rabuSore the rabuSore to set
     */
    public void setRabuSore(String rabuSore) {
        this.rabuSore = rabuSore;
    }

    /**
     * @return the kamisPagi
     */
    public String getKamisPagi() {
        return kamisPagi;
    }

    /**
     * @param kamisPagi the kamisPagi to set
     */
    public void setKamisPagi(String kamisPagi) {
        this.kamisPagi = kamisPagi;
    }

    /**
     * @return the kamisSore
     */
    public String getKamisSore() {
        return kamisSore;
    }

    /**
     * @param kamisSore the kamisSore to set
     */
    public void setKamisSore(String kamisSore) {
        this.kamisSore = kamisSore;
    }

    /**
     * @return the jumatPagi
     */
    public String getJumatPagi() {
        return jumatPagi;
    }

    /**
     * @param jumatPagi the jumatPagi to set
     */
    public void setJumatPagi(String jumatPagi) {
        this.jumatPagi = jumatPagi;
    }

    /**
     * @return the jumatSore
     */
    public String getJumatSore() {
        return jumatSore;
    }

    /**
     * @param jumatSore the jumatSore to set
     */
    public void setJumatSore(String jumatSore) {
        this.jumatSore = jumatSore;
    }

    /**
     * @return the sabtuPagi
     */
    public String getSabtuPagi() {
        return sabtuPagi;
    }

    /**
     * @param sabtuPagi the sabtuPagi to set
     */
    public void setSabtuPagi(String sabtuPagi) {
        this.sabtuPagi = sabtuPagi;
    }

    /**
     * @return the sabtuSore
     */
    public String getSabtuSore() {
        return sabtuSore;
    }

    /**
     * @param sabtuSore the sabtuSore to set
     */
    public void setSabtuSore(String sabtuSore) {
        this.sabtuSore = sabtuSore;
    }

    
}
