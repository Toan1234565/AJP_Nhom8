package com.btl.qltv.btljava.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btl.qltv.btljava.entity.Books;

public interface BookRepository extends JpaRepository<Books, String> {

}
