/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dejep.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author titib
 */
@Entity
@Table(name = "turnos")
public class Turno implements Comparable<Turno> {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "turno", cascade = CascadeType.ALL)
    private List<Funcionario> funcionarios;

    public Turno() {
        this.funcionarios = new ArrayList<>();
    }

    public Turno(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
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

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionario.setTurno(this);
        this.funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario functionario) {
        functionario.setTurno(null);
        this.funcionarios.remove(functionario);
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }
    
    public int compareTo(Turno other) {
        return this.nome.compareTo(other.getNome());
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
