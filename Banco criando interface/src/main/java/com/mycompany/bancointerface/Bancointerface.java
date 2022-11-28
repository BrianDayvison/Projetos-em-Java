package com.mycompany.bancointerface;

import java.util.Scanner;

public class Bancointerface 
{

    public static void main(String[] args) 
    {
       Banco c1 = new Banco(0,false);
       c1.abrirConta("CP");
       c1.setNumConta(1111);
       c1.setDono("brian");
       c1.atual();
       c1.sacar();
       c1.atual();
       
       
       
       
       //Scanner teclado = new Scanner(System.in);
      // String nome = teclado.nextLine();
       //float nota = teclado.nextFloat();
       // System.out.println("Nome: " + nome + "\nnota: " + nota);
    }
}
