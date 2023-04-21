package com.example.demo.repository;

import com.example.demo.entity.VendedorTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends JpaRepository<VendedorTO, Long> {
}
