package com.mycompany.ufe_relacionamentoclasses;

import java.util.Random;

public class Luta 
{
    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //metodos publicos
    
    public void marcarLuta(Lutador l1, Lutador l2 )
    {
      if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2)
      {
          this.setAprovada(true);
          this.setDesafiado(l1);
          this.setDesafiante(l2);
      } else
        { 
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
      
      
    }
    public void lutar()
    {
        if (aprovada)
        {
            System.out.println("DESAFIADO");
            this.desafiado.apresentar();
            System.out.println("DESAFIANTE");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);//0,1,2
            switch(vencedor)
            {
                case 0://empate
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("A luta empatou");
                    
                    break;
                case 1: //desafiante vence
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    System.out.println("O Vencedor é: " + this.desafiante.getNome());
                    break;
                case 2: //desafiado vence
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("O Vencedor é: " + this.desafiado.getNome());
                    break;
            }
        }else{System.out.println("/n A Luta não pode acontecer ");}
    }
    
    //metodos especial construct

    public Luta() 
    {
        this.rounds = 0;
        this.aprovada = false;
    }
    
    //metodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador ds) {
        this.desafiante = ds;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
    
}
