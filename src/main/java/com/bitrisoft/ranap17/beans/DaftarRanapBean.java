/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitrisoft.ranap17.beans;

import com.bitrisoft.ranap17.model.DaftarRawatInap;
import com.bitrisoft.ranap17.service.DaftarRanapService;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 *
 * @author Developer
 */
@ManagedBean
@RequestScoped
public class DaftarRanapBean extends SpringBeanAutowiringSupport {

    /**
     * @param aNobill the nobill to set
     */
    public static void setNobill(String aNobill) {
        nobill = aNobill;
    }
    
    @Autowired
    private DaftarRanapService daftarRanapService;
    
    // Entity Handlers
    private List<DaftarRawatInap> items;
    private DaftarRawatInap item = new DaftarRawatInap();
    private static String nobill = "";
    
    public void save() {
            if(this.nobill != null) {
                this.item.setNoBill(this.nobill);
                this.daftarRanapService.update(this.item);
                this.setNobill("");
            }
            else {
                this.daftarRanapService.create(this.item);
            }

            this.item = new DaftarRawatInap();
	}
	
	public void destroy(DaftarRawatInap daftarRanap) {
            try {
                    this.daftarRanapService.destroy(daftarRanap);
            } catch (Exception e) {
                    e.printStackTrace();
            }
	}
	
	public List<DaftarRawatInap> getItems() {
		return this.daftarRanapService.findAll();
	}
	public void setItems(List<DaftarRawatInap> items) {
		this.items = items;
	}
	public DaftarRawatInap getItem() {
		return this.item;
	}
	
	public void setItem(DaftarRawatInap daftarRanap) {
            this.item = daftarRanap;
            this.setNobill(daftarRanap.getNoBill());
	}
	
        public String Masuk() {
            return "PasienMasuk_New";
        }
	
}
