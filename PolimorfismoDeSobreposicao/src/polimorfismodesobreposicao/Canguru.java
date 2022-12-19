
package polimorfismodesobreposicao;

public final class Canguru extends Mamifero
{
    public Canguru(String corPelo, float pe) 
    {
        super(corPelo, pe);
    }

    public void usarBolsa()
    {
        System.out.println("Usando a Bolsa");
    }
    
    
    @Override
    public final void detalhes() 
    {
        System.out.println("\nCANGURU:");
        System.out.println("Cor do pelo é " + this.getCorPelo() + " e o peso é  " + this.getPeso());
            
    }

    @Override
    public final void locomover() 
    {
        System.out.println("pulando");
    }    
 
}
