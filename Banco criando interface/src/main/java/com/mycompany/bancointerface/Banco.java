package com.mycompany.bancointerface;

import java.util.Scanner;

public class Banco 
{
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //metodos logicos

    //Banco() {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
    
    public void atual()
    {
        System.out.println("numero da cont: " + this.getNumConta());
        System.out.println("Tipo conta: " + this.getTipo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());   
        
        
    }
    
    
    public void abrirConta(String t)
    {
        setTipo(t);
        setStatus(true);
        
        if ("CC".equals(t))
        {
            setSaldo(50);
        }
        else if("CP".equals(t))
        {
             saldo = 150;   
        }
    }
    public void fecharConta()
    {
        if(saldo != 0)
        {
            System.out.println("Saldo positivo ou negativado, verifique antes de fechar a conta");              
        }
        else if (saldo == 0)
        {
            setStatus(false);
        }
    }
    public void depositar( )
    {   
        if (status == true)
        {
//modifiqueo o saldo p/ get saldo () + d
            
            System.out.println("Digite o valor do deposito: ");
            Scanner teclado = new Scanner(System.in);
            float d = teclado.nextFloat();
            setSaldo(getSaldo() + d);
        }
        else if (status == false)
        {
            System.out.println("voce nao possui uma conta");
        }
    }
    public void sacar()
    {
        if (status == true && saldo > 0)
        {
            System.out.println("Digite o valor do saque: ");
            Scanner teclado = new Scanner(System.in);
            float sc = teclado.nextFloat();
            saldo = (saldo - sc);
            
        }
    }
    public void pagarMensal()
    {
        int v = 0;
        if (tipo.equals("CC"))
        {
            v = 12;
        }
        else if ("CP".equals(tipo))
        {
            v = 20;
        }
        if (status == true)
        {
            if (saldo <= 0)
            {
                System.out.println("Sua conta esta no cheque especial, fique atento aos juros");
            }
            
          saldo = (saldo - v);
        }
    }
    //metodos especiais
    public Banco(int sa, boolean st) 
    {
        this.saldo = sa;
        this.status = st;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int nC) {
        this.numConta = nC;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tp) {
        this.tipo = tp;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dn) {
        this.dono = dn;
    }

    public float getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(float sa) {
        this.saldo = sa;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    
}
