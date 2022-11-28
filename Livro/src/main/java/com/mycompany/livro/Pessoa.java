package com.mycompany.livro;
public class Pessoa 
{
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String no, int id, String sx) 
    {
        this.nome = no;
        this.idade = id;
        this.sexo = sx;
    }
    //-----------------------//
   
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String no) 
    {
        this.nome = no;
    }

    public int getIdade() 
    {
        return idade;
    }

    public void setIdade(int id) 
    {
        this.idade = id;
    }

    public String getSexo() 
    {
        return sexo;
    }

    public void setSexo(String sx) 
    {
        this.sexo = sx;
    }
    
    //------------------------------//
    
    public void fazerAniversario()
    {
        this.setIdade(this.getIdade() + 1);
    }
    
    public void dados()
    {
        System.out.println("Nome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo());
    }
}
