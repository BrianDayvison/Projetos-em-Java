package br.com.brian.classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author brian
 */
public class Pilha {
    
    private List<String> nomes = new LinkedList<String>();

    public void insere(String nome) {
        nomes.add(nome);    
    }
    

    public String remove() {
        return nomes.remove(nomes.size()-1);
    }

    public boolean vazia() {
    return nomes.size() == 0;
    }
    
    @Override
    public String toString() {
        return nomes.toString();
    }

}
