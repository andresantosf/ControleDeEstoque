package com.estoque.api.Entity;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "tb_tipo_equipamento")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TipoEquipamento {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "nome_tipo_equipamento")
    private String nomeTipoEquipamento;

    @Column(name = "descricao_tipo_equipamento")
    private String descricaoTipoEquipamento;
    
    private Date date;
}
