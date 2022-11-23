package com.mycompany.ufe_relacionamentoclasses;
public class Lutador implements apresentacaoLutador
{
    //atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //metodo construtor
    
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) 
    {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    
    
    
    
    //metodos publicos sem construct
    public String getNacionalidade() 
    {
        return nacionalidade;
    }

    public void setNacionalidade(String na) 
    {
        this.nacionalidade = na;
    }
    

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String no) 
    {
        this.nome = no;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) 
    {
        this.idade = i;
    }

    public float getAltura() 
    {
        return altura;
    }

    public void setAltura(float al) 
    {
        this.altura = al;
    }

    public float getPeso() 
    {
        return peso;
    }

    public void setPeso(float pe) 
    {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() 
    {
        return categoria;
    }

    private void setCategoria() 
    {
        if(this.getPeso() < 52.2)
        {
            this.categoria = "invalido";
        }
        else if (this.getPeso()<= 70)
        {
            this.categoria = "leve";
        }
        else if (this.getPeso()<= 83.9)
        {
            this.categoria = "medio";
        }
        else if (this.getPeso()<= 120)
        {
            this.categoria = "pesado";
        } 
        else{ this.categoria = "invalido";}
    }

    public int getVitorias() 
    {
        return vitorias;
    }

    public void setVitorias(int vi) 
    {
        this.vitorias = vi;
    }

    public int getDerrotas() 
    {
        return derrotas;
    }

    public void setDerrotas(int d) 
    {
        this.derrotas = d;
    }

    public int getEmpates() 
    {
        return empates;
    }

    public void setEmpates(int em) 
    {
        this.empates = em;
    }

    //metodos especiais
    @Override
    public void apresentar() 
    {
        System.out.println("----------------------------------------------------------------");  
        System.out.println("CHEGOU A HORA DE APRESENTARMOS O LUTADOR:" + this.getNome());
        System.out.println("Diretamente de: " + this.getNacionalidade());
        System.out.println("Com : " + this.getIdade()+ " anos e " + this.getAltura() + " altura");
        System.out.println("Pesando :" + this.getPeso() + "KG");
        System.out.println(this.getVitorias() + " Vitorias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
        System.out.println("Categoria: " + this.getCategoria());
        
    }

    @Override
    public void ganharLuta() 
    {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() 
    {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() 
    {
        this.empates = this.empates + 1;
    }
    
    
    
}
