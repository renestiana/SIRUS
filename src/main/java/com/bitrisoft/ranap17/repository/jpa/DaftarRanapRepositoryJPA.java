/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitrisoft.ranap17.repository.jpa;

import com.bitrisoft.ranap17.model.DaftarRawatInap;
import com.bitrisoft.ranap17.repository.DaftarRanapRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Developer
 */
@Repository("daftarRanapRepository")
public class DaftarRanapRepositoryJPA implements DaftarRanapRepository {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public DaftarRawatInap create(DaftarRawatInap daftarRawatInap) {
        if (daftarRawatInap.getNoBill()==null) {
            this.em.persist(daftarRawatInap);
        } else {
            return null;
        }
        return daftarRawatInap;
    }

    @Override
    public void destroy(DaftarRawatInap daftarRawatInap) {
        if (this.em.contains(daftarRawatInap)) {
            daftarRawatInap = this.em.merge(daftarRawatInap);
        }
        this.em.remove(daftarRawatInap);
    }

    @Override
    public DaftarRawatInap update(DaftarRawatInap daftarRawatInap) {
        DaftarRawatInap entity = this.em.find(DaftarRawatInap.class, daftarRawatInap.getNoBill());
		if(entity != null) {
			entity.setTglMulaiRwt(daftarRawatInap.getTglMulaiRwt());
			entity.setJamMulaiRwt(daftarRawatInap.getJamMulaiRwt());
                        entity.setKamar(daftarRawatInap.getKamar());
                        entity.setKelas(daftarRawatInap.getKelas());
                        entity.setMasukDari(daftarRawatInap.getMasukDari());
                        entity.setDokter1(daftarRawatInap.getDokter1()); // Dokter Rawat Bersama1
                        entity.setDokter2(daftarRawatInap.getDokter2()); // Dokter Rawat Bersama2
                        entity.setDokter3(daftarRawatInap.getDokter3()); // Dokter Rawat Bersama3
                        entity.setDiagnosa1(daftarRawatInap.getDiagnosa1());
                        entity.setDiagnosa2(daftarRawatInap.getDiagnosa1());
                        entity.setKodeIcdx(daftarRawatInap.getKodeIcdx());
                        
			this.em.flush();
		}
		
		return entity;
    }

    @Override
    public List<DaftarRawatInap> findAll() {
        return this.em.createQuery("from DaftarRawatInap", DaftarRawatInap.class).getResultList();
    }

    @Override
    public DaftarRawatInap findById(Long id) {
        if(id != null)
            return this.em.find(DaftarRawatInap.class, id);
		
        return null;
    }
    
}
