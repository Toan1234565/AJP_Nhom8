/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.qltv.btljava.controller;

import com.btl.qltv.btljava.entity.NguoiMuonEntity;
import com.btl.qltv.btljava.service.NguoiMuonService;
import dto.request.NguoiMuonRequest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nguyentoan
 */
@RestController
public class NguoiMuonController {
    @Autowired
    private NguoiMuonService nguoimuonSV;
    
    @GetMapping("/nguoimuon")
    public List<NguoiMuonEntity> getAllNguoi(){
        return nguoimuonSV.getAllNguoi();
    }
    
    @PostMapping("/Them")
    NguoiMuonEntity Them(@RequestBody NguoiMuonRequest request){
       return nguoimuonSV.createrRequest(request);
    }   
}
