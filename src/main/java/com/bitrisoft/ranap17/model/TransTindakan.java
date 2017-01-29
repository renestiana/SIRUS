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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Developer
 */
@Entity
public class TransTindakan implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_trans")
    private Long idTrans;
    @Column(name = "tgl_pdp")
    private BigInteger tglPdp;
    @Column(name = "no_bukti")
    private String noBukti;
    @Column(name = "qty_pdp")
    private Integer qtyPdp;
    @Column(name = "dokter_pdp")
    private String dokterPdp;
    @Column(name = "harga_satuan")
    private BigInteger hargaSatuan;
    @Column(name = "harga_total")
    private BigInteger hargaTotal;
    @Column(name = "id_opr")
    private String idOpr;
    @Column(name = "jns_pdok")
    private Character jnsPdok;
    @Column(name = "npshg")
    private Character npshg;
    @Column(name = "komisi_dokrp")
    private BigInteger komisiDokrp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "komisi_dokp")
    private Float komisiDokp;
    @Column(name = "hrgsat_user")
    private BigInteger hrgsatUser;
    @Column(name = "hrgtot_user")
    private BigInteger hrgtotUser;
    @Column(name = "keterangan")
    private String keterangan;
    @JoinColumn(name = "kode_pdp", referencedColumnName = "kode_pdp")
    @ManyToOne(fetch = FetchType.EAGER)
    private KodeTarif kodePdp;
    @JoinColumn(name = "no_bill", referencedColumnName = "no_bill")
    @ManyToOne(fetch = FetchType.EAGER)
    private Pendaftaran noBill;
    @JoinColumn(name = "no_rm", referencedColumnName = "no_rm")
    @ManyToOne(fetch = FetchType.EAGER)
    private RmPasien noRm;
    @JoinColumn(name = "kode_unit", referencedColumnName = "id_unit")
    @ManyToOne(fetch = FetchType.EAGER)
    private UnitKerja kodeUnit;
    
    public TransTindakan(){}
}
