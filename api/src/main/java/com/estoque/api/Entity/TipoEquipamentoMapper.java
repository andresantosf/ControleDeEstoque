package com.estoque.api.Entity;


import org.springframework.stereotype.Component;

@Component
public class TipoEquipamentoMapper {

  public TipoEquipamentoDTO toDTO(TipoEquipamento tipoEquipamento) {
    if (tipoEquipamento == null) {
      return null;
    }

    return new TipoEquipamentoDTO(tipoEquipamento.getId(), tipoEquipamento.getNomeTipoEquipamento(), tipoEquipamento.getDescricaoTipoEquipamento(), tipoEquipamento.getDate());
  }

  public TipoEquipamento toEntity(TipoEquipamentoDTO tipoEquipamentoDTO) {
    if (tipoEquipamentoDTO == null) {
      return null;
    }

    TipoEquipamento tipoEquipamento = new TipoEquipamento();
    if (tipoEquipamentoDTO.id() != null) {
      tipoEquipamento.setId(tipoEquipamentoDTO.id());
    }

    tipoEquipamento.setNomeTipoEquipamento(tipoEquipamentoDTO.nomeTipoEquipamento());
    tipoEquipamento.setDescricaoTipoEquipamento(tipoEquipamentoDTO.descricaoTipoEquipamento());

    return tipoEquipamento;
  }

}
