package com.estoque.api.Entity;

import java.util.Date;
import java.util.UUID;

public record TipoEquipamentoDTO(UUID id, String nomeTipoEquipamento, String descricaoTipoEquipamento, Date date) {
}
