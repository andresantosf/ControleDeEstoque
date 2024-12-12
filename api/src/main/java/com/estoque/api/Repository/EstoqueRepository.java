package com.estoque.api.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estoque.api.Entity.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, UUID>{
    
}
