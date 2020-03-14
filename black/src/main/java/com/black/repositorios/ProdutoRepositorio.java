package com.black.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.black.modelos.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {

}
