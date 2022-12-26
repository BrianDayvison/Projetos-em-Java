
package polimorfismodesobreposicao;

public class Cachorro extends Mamifero
{
    
    public Cachorro(String corPelo, float pe) 
    {
        super(corPelo, pe);
    }
    
    public void reagir(String frase)
    {
        if (frase.equals("ola") || frase.equals("toma comida"))
        {
            System.out.println("Abanar o rabo");
        }
        else
        {
            System.out.println("ronsar");
        }
    }
    public void reagir(int hora, int min)
    {
        if(hora < 12)
        {
            System.out.println("abanar o rabo");
        }
        else if(hora >= 18)
        {
            System.out.println("ignorar");
        }else
        {
            System.out.println("abanar e latir");
        }
    }
    public void reagir(boolean dono)
    {
        if (dono) 
        {
            System.out.println("abanar");
        } 
        else 
        {
            System.out.println("rosnar e latir");
        }
    }
    
    
    @Override
    public void detalhes() 
    {
        System.out.println("\nCACHORRO: ");
        super.detalhes(); 
    }
    
    
}
