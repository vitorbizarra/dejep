/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dejep.models;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author titib
 */
@Entity
@Table(name = "escalas")
public class Escala {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "mes")
    private Integer mes;

    @Column(name = "ano")
    private Integer ano;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Diaria> diarias;

    public Integer getId() {
        return id;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void adicionarDiaria(Diaria diaria) {
        diaria.setEscala(this);
        this.diarias.add(diaria);
    }

    public void removerDiaria(Diaria diaria) {
        diaria.setEscala(null);
        this.diarias.remove(diaria);
    }

    public List<Diaria> getDiarias() {
        return this.diarias;
    }
}
