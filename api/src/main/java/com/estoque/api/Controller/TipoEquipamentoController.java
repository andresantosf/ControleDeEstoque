package com.estoque.api.Controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.estoque.api.Entity.TipoEquipamento;
import com.estoque.api.Entity.TipoEquipamentoDTO;
import com.estoque.api.Entity.TipoEquipamentoPageDTO;
import com.estoque.api.Service.TipoEquipamentoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api/tipoEquipamento")
public class TipoEquipamentoController {
    @Autowired
    private TipoEquipamentoService tipoEquipamentoService;

    @PostMapping
    public ResponseEntity<TipoEquipamento> create(
        @RequestBody TipoEquipamentoDTO tipoEquipamento
    ){
        TipoEquipamentoDTO tipoEquipamentoDTO = new TipoEquipamentoDTO(
            null, 
            tipoEquipamento.nomeTipoEquipamento(),
            tipoEquipamento.descricaoTipoEquipamento(), 
            new Date());
        TipoEquipamento newTipoEquipamento = this.tipoEquipamentoService.createTipoEquipamento(tipoEquipamentoDTO);

        return ResponseEntity.ok(newTipoEquipamento);
    }
        
    @GetMapping("/{id}")
    public TipoEquipamentoDTO findById(@PathVariable UUID id) {
        return this.tipoEquipamentoService.findById(id);
    }

    @PutMapping("/{id}")
    public TipoEquipamentoDTO update(@PathVariable UUID id, @RequestBody TipoEquipamentoDTO tipoEquipamento) {
        return this.tipoEquipamentoService.update(id, tipoEquipamento);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable UUID id) {
        this.tipoEquipamentoService.deleteTipoEquipamento(id);
    }

    
    @GetMapping
    public ResponseEntity<TipoEquipamentoPageDTO> listAllTipoEquipamento(
        @RequestParam(defaultValue = "0") int page, 
        @RequestParam(defaultValue = "10") int size){
            //
            TipoEquipamentoPageDTO allTipoEquipamento = this.tipoEquipamentoService.getAllTipoEquipamento(page, size);
            return ResponseEntity.ok(allTipoEquipamento);
    }
}
