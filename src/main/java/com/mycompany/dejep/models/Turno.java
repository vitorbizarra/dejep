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
@Table(name = "turnos")
public class Turno {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "turno", cascade = CascadeType.ALL)
    private List<Funcionario> funcionarios;

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
}
