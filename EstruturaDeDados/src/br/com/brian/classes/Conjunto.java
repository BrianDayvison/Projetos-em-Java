/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.brian.classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author brian
 */
public class Conjunto{
    
    private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
    
    public Conjunto() {
        for(int i = 0; i < 26; i++) {
            tabela.add(new LinkedList<String>());
        }
    }
    
    private int calculaIndiceDaTabela(String palavra) {
        return palavra.toLowerCase().charAt(0) % 26;
    }
    
    private boolean contem(String palavra) {
        int indice = calculaIndiceDaTabela(palavra);
        return tabela.get(indice).contains(palavra);
    }
    
    public void adiciona(String palavra) {
        if(!contem(palavra)) {
            int indice = calculaIndiceDaTabela(palavra);
            List<String> lista = tabela.get(indice);
            lista.add(palavra);
        }
    }
    
    public void remove(String palavra) {
        if(contem(palavra)) {
        int indice = calculaIndiceDaTabela(palavra);
        List<String> lista = tabela.get(indice);
        lista.remove(palavra);
        }
    }
    @Override
    public String toString() {
        return tabela.toString();
    }
}

