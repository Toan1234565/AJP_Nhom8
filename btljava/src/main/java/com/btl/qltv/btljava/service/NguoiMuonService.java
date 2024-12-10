/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.qltv.btljava.service;

import com.btl.qltv.btljava.respository.NguoiMuonRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.btl.qltv.btljava.entity.NguoiMuonEntity;
import dto.request.NguoiMuonRequest;

import java.util.List;
/**
 *
 * @author nguyentoan
 */
@Service
public class NguoiMuonService {
    @Autowired
    private NguoiMuonRepository Muon;
    
    public List<NguoiMuonEntity> getAllNguoi(){
        return Muon.findAll();
    }
    
   public NguoiMuonEntity createrRequest(NguoiMuonRequest request){
       NguoiMuonEntity entity = new NguoiMuonEntity();
       
       entity.setMaSV(request.MaSV);
       entity.setTenSV(request.TenLop);
       entity.setTenLop(request.TenLop);
       entity.setSoDienThoai(request.SoDienThoai);
       
       return Muon.save(entity);
   }
    
}
