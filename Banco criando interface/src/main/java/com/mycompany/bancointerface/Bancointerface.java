package com.mycompany.bancointerface;
public class Bancointerface 
{

    public static void main(String[] args) 
    {
       Banco c1 = new Banco(0,false);
       c1.abrirConta("CP");
       c1.setNumConta(1111);
       c1.setDono("brian");
       c1.depositar(30);
       c1.atual();
       c1.sacar(40);
       c1.atual();
    }
}
