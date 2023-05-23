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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author titib
 */
@Entity
@Table(name = "funcionarios")
public class Funcionario {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "rg")
    private String rg;

    @OneToOne(cascade = CascadeType.ALL)
    private Turno turno;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<Ferias> ferias;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public void adicionarFerias(Ferias ferias) {
        ferias.setFuncionario(this);
        this.ferias.add(ferias);
    }

    public void removerFerias(Ferias ferias) {
        ferias.setFuncionario(null);
        this.ferias.remove(ferias);
    }

    public List<Ferias> getFerias() {
        return this.ferias;
    }
}
