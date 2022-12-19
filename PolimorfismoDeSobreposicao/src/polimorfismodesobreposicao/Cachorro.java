
package polimorfismodesobreposicao;

public class Cachorro extends Mamifero
{
    
    public Cachorro(String corPelo, float pe) 
    {
        super(corPelo, pe);
    }

    @Override
    public void detalhes() 
    {
        System.out.println("\nCACHORRO: ");
        super.detalhes(); 
    }
    
    
}
