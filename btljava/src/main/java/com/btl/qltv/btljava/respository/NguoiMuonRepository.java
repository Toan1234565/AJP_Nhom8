/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.qltv.btljava.respository;

/**
 *
 * @author nguyentoan
 */


import com.btl.qltv.btljava.entity.NguoiMuonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguoiMuonRepository extends JpaRepository<NguoiMuonEntity, String> {
}

