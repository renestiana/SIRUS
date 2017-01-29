/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitrisoft.ranap17.service.jpa;

import com.bitrisoft.ranap17.model.DaftarRawatInap;
import com.bitrisoft.ranap17.repository.DaftarRanapRepository;
import com.bitrisoft.ranap17.service.DaftarRanapService;
import com.google.common.collect.Lists;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Developer
 */
@Service("daftarRanapService")
public class DaftarRanapServiceJPA implements DaftarRanapService {
    
    @Autowired
    private DaftarRanapRepository daftarRanapRepository;
    
    @Override
    @Transactional
    public DaftarRawatInap create(DaftarRawatInap daftarRawatInap) {
        return this.daftarRanapRepository.create(daftarRawatInap);
    }

    @Override
    @Transactional
    public void destroy(DaftarRawatInap daftarRawatInap) throws Exception {
        if (daftarRawatInap.getNoBill()==null) {
            throw new Exception("No Bill is null");
        }
        this.daftarRanapRepository.destroy(daftarRawatInap);
    }

    @Override
    @Transactional
    public DaftarRawatInap update(DaftarRawatInap daftarRawatInap) {
       return this.daftarRanapRepository.update(daftarRawatInap);
    }

    @Override
    @Transactional
    public List<DaftarRawatInap> findAll() {
        return Lists.newArrayList(this.daftarRanapRepository.findAll());
    }

    @Override
    @Transactional
    public DaftarRawatInap findById(Long id) {
        return this.daftarRanapRepository.findById(id);
    }
    
}
