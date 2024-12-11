package com.estoque.api.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.estoque.api.Entity.TipoEquipamento;
import com.estoque.api.Entity.TipoEquipamentoDTO;
import com.estoque.api.Repository.TipoEquipamentoRepository;

@Service
public class TipoEquipamentoService {

    @Autowired
    private TipoEquipamentoRepository repository;
    
    public TipoEquipamento createTipoEquipamento(TipoEquipamentoDTO data){
        TipoEquipamento newTipoEquipamento = new TipoEquipamento();

        newTipoEquipamento.setNomeTipoEquipamento(data.nomeTipoEquipamento());
        newTipoEquipamento.setDate(data.date());

        repository.save(newTipoEquipamento);
        return newTipoEquipamento;
    }
    
    public List<TipoEquipamentoDTO> getAllTipoEquipamento(int page, int size){
        PageRequest pageable = PageRequest.of(page, size);
        Page<TipoEquipamento> tipoEquipamentoPage = this.repository.findAll(pageable);

        return tipoEquipamentoPage.map(tipoEquipamento -> new TipoEquipamentoDTO(
            tipoEquipamento.getId(), 
            tipoEquipamento.getNomeTipoEquipamento(), 
            tipoEquipamento.getDate())).toList();
    }
}
