/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.locomotiva.checklist.classes;

/**
 *
 * @author brian
 */
public class Maquinista {
    
    private String nome;
    private int matricula;

    public Maquinista(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "\n-------------------"+"\nMaquinista: " + this.getNome() +"\nMatricula: " + this.getMatricula();  
    }
    
    
}
