package com.estoque.api.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estoque.api.Entity.TipoEquipamento;

public interface TipoEquipamentoRepository extends JpaRepository<TipoEquipamento, UUID>{
    
}
