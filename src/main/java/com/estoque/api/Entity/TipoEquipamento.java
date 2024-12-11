package com.estoque.api.Entity;

import java.util.Date;
import java.util.UUID;

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

    private String nomeTipoEquipamento;

    private Date date;
}
