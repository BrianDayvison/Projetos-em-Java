package com.mycompany.livro;
public class Livros 
{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private int aberto;
    private Pessoa leitor;

    public Livros(int totPaginas, int pagAtual, int aberto) 
    {
        this.totPaginas = 0;
        this.pagAtual = 0;
        this.aberto = 0;
    }
    public void detalhes()
    {
        System.out.println("Titulo: " + this.getTitulo() + "\nAutor: " + this.getAutor() + "\nTotal de Paginas: " + this.totPaginas);
        System.out.println("\nPagina Atual:" + this.getPagAtual() + "\nAberto: " + this.getAberto() );
        System.out.println("\nLeitor: " + this.getLeitor());
        
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public String getAutor() 
    {
        return autor;
    }

    public void setAutor(String autor) 
    {
        this.autor = autor;
    }

    public int getTotPaginas() 
    {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) 
    {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() 
    {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) 
    {
        this.pagAtual = pagAtual;
    }

    public int getAberto() 
    {
        return aberto;
    }

    public void setAberto(int aberto) 
    {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() 
    {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) 
    {
        this.leitor = leitor;
    }
    
   
}
