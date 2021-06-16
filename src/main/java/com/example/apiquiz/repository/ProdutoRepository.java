package com.example.apiquiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiquiz.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	Produto findById(long id);
}
