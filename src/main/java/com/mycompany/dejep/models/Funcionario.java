/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dejep.models;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "rg")
    private String rg;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "turno_id")
    private Turno turno;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<Ferias> ferias;

    public Funcionario() {
    }

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
    
    @Override
    public String toString(){
        return nome;
    }

    public List<Ferias> getFerias() {
        return this.ferias;
    }
}
