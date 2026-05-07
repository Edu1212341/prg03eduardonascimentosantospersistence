/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
/**
 *
 * @author eduardo
 */
public class CursoSave {
    
    private final static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("gerenciamento_curso");
    private final static EntityManager entityManager = entityManagerFactory.createEntityManager();
    
    public static void main (String [] args){
       Curso curso = new Curso();
       curso.setCargaHoraria(200);
       curso.setDescricao("Curso muito massa");
       curso.setId(1L);
       curso.setNome("Analise e Desenvolvimento de Sistemas");
       curso.setAtivo(true);
       
       entityManager.getTransaction().begin();
       entityManager.persist(curso);
       entityManager.getTransaction().commit();
       
       entityManager.close();
       entityManagerFactory.close();
    }
}
