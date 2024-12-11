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

@Table(name = "tb_estoque")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Estoque {
    @Id
    @GeneratedValue
    private UUID id;

    private String nome;

    private String numeroDeSerie;

    private Date date;
}