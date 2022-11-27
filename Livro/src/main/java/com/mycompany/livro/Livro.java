package com.mycompany.livro;
public class Livro 
{

    public static void main(String[] args) 
    {
        Pessoa P[] = new Pessoa[3];
        P[0] = new Pessoa ("Brian",26,"Masculino");
        P[1] = new Pessoa ("Wesley",22, "Masculino");
        
        Livros L[] = new Livros [3];
        L[1] = new Livros ("narnia", "CS", 300, P[0]);
        System.out.println(L[1].detalhes());
        
        
       
        
        
    }
}
