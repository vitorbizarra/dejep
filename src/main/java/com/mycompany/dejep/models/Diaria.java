/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dejep.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author titib
 */
@Entity
@Table(name = "diarias")
public class Diaria {

    @Id
    @Column(name = "id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Escala escala;

    @ManyToOne(cascade = CascadeType.ALL)
    private Funcionario functionario;

    @Column(name = "data")
    private String data;

    public Integer getId() {
        return id;
    }

    public Escala getEscala() {
        return escala;
    }

    public void setEscala(Escala escala) {
        this.escala = escala;
    }

    public Funcionario getFunctionario() {
        return functionario;
    }

    public void setFunctionario(Funcionario functionario) {
        this.functionario = functionario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
