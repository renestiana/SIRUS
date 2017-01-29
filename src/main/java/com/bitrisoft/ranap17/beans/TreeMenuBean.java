/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitrisoft.ranap17.beans;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

/**
 *
 * @author Developer
 */
@ManagedBean(name="treeMenuBean")
@ViewScoped
public class TreeMenuBean implements Serializable {
     
    private TreeNode root;
     
    @PostConstruct
    public void init() {
        root = new DefaultTreeNode("Root", null);
        TreeNode node0 = new DefaultTreeNode("PENDATAAN", root);
        TreeNode node1 = new DefaultTreeNode("LAPORAN", root);
        TreeNode node2 = new DefaultTreeNode("DATA INDUK", root);
        TreeNode node3 = new DefaultTreeNode("MANAJEMEN", root);
        TreeNode node4 = new DefaultTreeNode("ALAT BANTU", root);
         
        TreeNode node00 = new DefaultTreeNode("file","PENDAFTARAN", node0);
        TreeNode node01 = new DefaultTreeNode("KEUANGAN", node0);
        TreeNode node02 = new DefaultTreeNode("UNIT KASIR", node0);
        TreeNode node03 = new DefaultTreeNode("PELAYANAN PERAWATAN", node0);
        TreeNode node04 = new DefaultTreeNode("PELAYANAN PENUNJANG", node0);
        TreeNode node05 = new DefaultTreeNode("FARMASI DAN LOGISTIK", node0);
        TreeNode node06 = new DefaultTreeNode("REKAM MEDIS", node0);
        TreeNode node07 = new DefaultTreeNode("ACCOUNTING", node0);
        TreeNode node08 = new DefaultTreeNode("KEPEGAWAIAN", node0);
        TreeNode node09 = new DefaultTreeNode("PELAYANAN UMUM", node0);
        
        // UNTUK SUB MENU KEUANGAN
        TreeNode node011 = new DefaultTreeNode("TRANSAKSI KASIR", node01);
        TreeNode node012 = new DefaultTreeNode("PELAYANAN PIUTANG", node01);
        TreeNode node013 = new DefaultTreeNode("PELAYANAN HUTANG", node01);
        TreeNode node014 = new DefaultTreeNode("TARIF PELAYANAN", node01);
        
        // UNTUK SUB MENU KEUANGAN => TRANSAKSI KASIR
        TreeNode node0111 = new DefaultTreeNode("REKAP TINDAKAN", node011);
        TreeNode node0112 = new DefaultTreeNode("CETAK ULANG FAKTUR", node011);
        TreeNode node0113 = new DefaultTreeNode("BELUM DITUTUP", node011);
        
        // UNTUK SUB MENU PELAYANAN PERAWATAN
        TreeNode node031 = new DefaultTreeNode("UNIT GAWAT DARURAT", node03);
        TreeNode node032 = new DefaultTreeNode("POLIKLINIK/RAWAT JALAN", node03);
        TreeNode node033 = new DefaultTreeNode("TINDAKAN RAWAT INAP", node03);
        TreeNode node034 = new DefaultTreeNode("KAMAR OPERASI", node03);
        TreeNode node035 = new DefaultTreeNode("KAMAR BERSALIN", node03);
        TreeNode node036 = new DefaultTreeNode("HEMODIALISA", node03);
        TreeNode node037 = new DefaultTreeNode("REHAB MEDIK/KETERAPIAN", node03);
        TreeNode node038 = new DefaultTreeNode("RAWAT INTENSI/REANIMASI", node03);
        
        // UNTUK SUB MENU PELAYANAN PERAWATAN => RAWAT JALAN
        TreeNode node0321 = new DefaultTreeNode("POLI UMUM", node032);
        TreeNode node0322 = new DefaultTreeNode("POLI GIGI", node032);
        TreeNode node0323 = new DefaultTreeNode("POLI SPECIALIS", node032);
        
        // UNTUK SUB MENU PELAYANAN PENUNJANG
        TreeNode node041 = new DefaultTreeNode("RADIOLOGI", node04);
        TreeNode node042 = new DefaultTreeNode("LABORATORIUM", node04);
        TreeNode node043 = new DefaultTreeNode("TRANSFUSI DARAH", node04);
        
        // UNTUK SUB MENU FARMASI DAN LOGISTIK
        TreeNode node051 = new DefaultTreeNode("FARMASI", node05);
        TreeNode node052 = new DefaultTreeNode("LOGISTIK", node05);
        TreeNode node053 = new DefaultTreeNode("INFORMASI OBAT", node05);
        
        // UNTUK SUB MENU FARMASI DAN LOGISTIK => FARMASI
        TreeNode node0511 = new DefaultTreeNode("PELAYANAN RESEP", node051);
        TreeNode node0512 = new DefaultTreeNode("PEMBELIAN", node051);
        TreeNode node0513 = new DefaultTreeNode("ORDER SUPPLIER", node051);
        TreeNode node0514 = new DefaultTreeNode("RETUR PENJUALAN", node051);
        TreeNode node0515 = new DefaultTreeNode("RETUR PEMBELIAN", node051);
        TreeNode node0516 = new DefaultTreeNode("STOCK OPNAME", node051);
        TreeNode node0517 = new DefaultTreeNode("MUTASI ANTAR GUDANG", node051);
        TreeNode node0518 = new DefaultTreeNode("DEVISIASI STOCK", node051);
        
        TreeNode node05161 = new DefaultTreeNode("HITUNG STOCK", node0516);
        TreeNode node05162 = new DefaultTreeNode("PROSES OPNAME", node0516);
        
        TreeNode node0521 = new DefaultTreeNode("PEMAKAIAN STOCK", node052);
        TreeNode node0522 = new DefaultTreeNode("PEMBELIAN", node052);
        TreeNode node0523 = new DefaultTreeNode("RETURN SUPPLIER", node052);
        TreeNode node0524 = new DefaultTreeNode("STOCK OPNAME", node052);
        TreeNode node0525 = new DefaultTreeNode("MUTASI ANTAR GUDANG", node052);
        TreeNode node0526 = new DefaultTreeNode("DEVISIASI STOCK", node052);
        
        TreeNode node05241 = new DefaultTreeNode("HITUNG STOCK", node0524);
        TreeNode node05242 = new DefaultTreeNode("PROSES OPNAME", node0524);
        
        TreeNode node061 = new DefaultTreeNode("DATA PASIEN", node06);
        TreeNode node062 = new DefaultTreeNode("ISI DATA REKAM MEDIS", node06);
        TreeNode node063 = new DefaultTreeNode("STATUS PASIEN PULANG", node06);
        TreeNode node064 = new DefaultTreeNode("RIWAYAT PASIEN", node06);
        
        TreeNode node071 = new DefaultTreeNode("JURNAL UMUM", node07);
        TreeNode node072 = new DefaultTreeNode("JURNAL TRANSAKSI", node07);
        TreeNode node073 = new DefaultTreeNode("NERACA AWAL", node07);
        
        TreeNode node081 = new DefaultTreeNode("DATA PEGAWAI", node08);
        TreeNode node082 = new DefaultTreeNode("KEGIATAN PEGAWAI", node08);
        TreeNode node083 = new DefaultTreeNode("JADWAL KERJA", node08);
        TreeNode node084 = new DefaultTreeNode("PENGATURAN CUTI", node08);
        
        TreeNode node091 = new DefaultTreeNode("PELAYANAN GIZI", node09);
        TreeNode node092 = new DefaultTreeNode("MEDICAL CHECKUP", node09);
        TreeNode node093 = new DefaultTreeNode("AMBULANCE", node09);
        TreeNode node094 = new DefaultTreeNode("BINATU DAN STERILISASI", node09);
        TreeNode node095 = new DefaultTreeNode("KAMAR JENASAH", node09);
        TreeNode node096 = new DefaultTreeNode("PEMELIHARAAN SARANA MEDIK", node09);
        
        
                
         
//        node1.getChildren().add(new DefaultTreeNode("Node 1.1"));
//        node00.getChildren().add(new DefaultTreeNode("Node 0.0.0"));
//        node00.getChildren().add(new DefaultTreeNode("Node 0.0.1"));
//        node01.getChildren().add(new DefaultTreeNode("Node 0.1.0"));
//        node10.getChildren().add(new DefaultTreeNode("Node 1.0.0"));
//        root.getChildren().add(new DefaultTreeNode("Node 2"));
    }
 
    public TreeNode getRoot() {
        return root;
    }
}    
