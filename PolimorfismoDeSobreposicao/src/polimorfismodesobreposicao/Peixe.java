
package polimorfismodesobreposicao;

public class Peixe extends Animal
{
    private String corEscamas;

    public String getCorEscamas() 
    {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) 
    {
        this.corEscamas = corEscamas;
    }
    
    
    
    @Override
    public void locomover() 
    {
        System.out.println("Nadando");
    }

    @Override
    public void alimenta() 
    {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() 
    {
        System.out.println("Peixe não emite som");
    }
    
    
}
