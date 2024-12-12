package com.estoque.api.Entity;

import java.util.List;

public record TipoEquipamentoPageDTO(List<TipoEquipamentoDTO> tipoEquipamento, long totalElements, int totalPages) {
}
