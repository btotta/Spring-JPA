package com.example.demo.repository;

import com.example.demo.entity.ProdutoTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoTO, Long> {
}
