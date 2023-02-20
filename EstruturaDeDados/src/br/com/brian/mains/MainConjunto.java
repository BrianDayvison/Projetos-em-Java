package br.com.brian.mains;

import br.com.brian.classes.Conjunto;
import java.util.LinkedList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brian
 */
public class MainConjunto {

    public static void main(String[] args) {
        
       Conjunto conjunto = new Conjunto();
        conjunto.adiciona("Andreia");
        conjunto.adiciona("Anderson");
        System.out.println(conjunto);

        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);
        
        conjunto.remove("Mauricio");
        System.out.println(conjunto);
    }
}
        
       
    
    

