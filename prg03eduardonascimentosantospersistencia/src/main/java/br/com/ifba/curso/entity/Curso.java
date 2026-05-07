/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;

/**
 *
 * @author eduardo
 */


// izem ao Hibernate como criar a tabela
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 *
 * @author eduardo
 */
/*5 lines*/
@Entity //  vai virar uma tabela 
@Table (name = "cursos")
public class Curso {
    
    @Id //Chave Primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  vai gerar o ID 
    private Long id;
    
    @Column (name = "nome", nullable = false)
    private String nome;
    
    @Column (name = "descricao_curso", nullable = false)
    private String descricao;
    
    @Column (name = "carga_horaria", nullable = false)
    private int cargaHoraria;
    
    @Column (name = "ativo", nullable = false)
    private boolean ativo;

    
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}