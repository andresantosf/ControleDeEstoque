package com.estoque.api.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.estoque.api.Entity.TipoEquipamento;
import com.estoque.api.Entity.TipoEquipamentoDTO;
import com.estoque.api.Service.TipoEquipamentoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/tipoEquipamento")
public class TipoEquipamentoController {
    @Autowired
    private TipoEquipamentoService tipoEquipamentoService;

    @PostMapping
    public ResponseEntity<TipoEquipamento> create(
        @RequestParam("nomeTipoEquipamento") String nomeTipoEquipamento,
        @RequestParam("date") Long date
    ){
        TipoEquipamentoDTO tipoEquipamentoDTO = new TipoEquipamentoDTO(null, nomeTipoEquipamento, new Date(date));
        TipoEquipamento newTipoEquipamento = this.tipoEquipamentoService.createTipoEquipamento(tipoEquipamentoDTO);

        return ResponseEntity.ok(newTipoEquipamento);
    }

    
    @GetMapping
    public ResponseEntity<List<TipoEquipamentoDTO>> listAllTipoEquipamento(
        @RequestParam(defaultValue = "0") int page, 
        @RequestParam(defaultValue = "10") int size){
            //
            List<TipoEquipamentoDTO> allTipoEquipamento = this.tipoEquipamentoService.getAllTipoEquipamento(page, size);
            return ResponseEntity.ok(allTipoEquipamento);
    }
}
