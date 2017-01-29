/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitrisoft.ranap17.repository;

import com.bitrisoft.ranap17.model.DaftarRawatInap;
import java.util.List;
/**
 *
 * @author Developer
 */
public interface DaftarRanapRepository {
    public DaftarRawatInap create(DaftarRawatInap daftarRawatInap);
    public void destroy(DaftarRawatInap daftarRawatInap);
    public DaftarRawatInap update(DaftarRawatInap daftarRawatInap);
    public List<DaftarRawatInap> findAll();
    public DaftarRawatInap findById(Long id);
}
