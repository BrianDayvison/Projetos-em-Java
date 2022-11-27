package com.mycompany.livro;
public class Livros implements Publicação
{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    

    public Livros(String tl, String at, int tp, Pessoa p) 
    {
        this.titulo = tl;
        this.autor = at;
        this.totPaginas = tp;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = p;
    

    }
    public String detalhes() 
    {
        return " titulo: " + titulo + "\n autor: " + autor + "\n totPaginas: " + totPaginas + "\n pagAtual: " + pagAtual + "\n aberto: " + aberto + "\n leitor: " + leitor.getNome();
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

    public boolean getAberto() 
    {
        return aberto;
    }

    public void setAberto(boolean aberto) 
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
//--------------------------------------------//
    @Override
    public void abrir() 
    {
      if(this.aberto==true)
      {
          System.out.println("Ja esta aberto. \nse desaja fechar use a opção fechar");
      }else
        {this.setAberto(true);}
    }
    
    @Override
    public void fechar() 
    {
        if(this.aberto==false)
        {
            System.out.println("Ja esta fechado. \nse deseja abrir use a opeção abrir");
        }else{this.setAberto(false);}
    }

    @Override
    public void folhear(int x) 
    {
        if(x <= this.getTotPaginas() && this.getAberto() == true)
        {
            this.setPagAtual(x);
        }else{System.out.println("impossivel folhear ate " + x +" paginas");}
    }

    @Override
    public void avancarPag() 
    {
        if(this.aberto==true)
        {
            this.pagAtual ++;
        }
    }

    @Override
    public void voltarPag() 
    {
        if(this.aberto==true)
        {
            this.pagAtual --;
        }
    }
    
   
}
