
package polimorfismodesobreposicao;

public class Ave extends Animal
{
    private String corPena;

    public Ave(String corPena, float pe) 
    {
        this.corPena = corPena;
        this.setPeso(pe);
    }

    public void detalhes ()
    {
        System.out.println("Cor do pelo é:" + this.getCorPena()+ " e o peso é : " + this.getPeso());
    }
    
    
    public String getCorPena() 
    {
        return corPena;
    }

    public void setCorPena(String corPena) 
    {
        this.corPena = corPena;
    }
    
      
   public void fazerNinho()
   {
       System.out.println("Ninho Feito!");
   } 
    
    
    @Override
    public void locomover() 
    {
        System.out.println("Voando");
    }

    @Override
    public void alimenta() 
    {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() 
    {
        System.out.println("Som de ave");
    }
    
}
