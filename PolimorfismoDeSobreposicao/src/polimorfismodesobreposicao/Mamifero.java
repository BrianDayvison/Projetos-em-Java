
package polimorfismodesobreposicao;

public abstract class Mamifero extends Animal 
{

   public Mamifero(String corPelo, float pe)  
    {
        this.corPelo = corPelo;
        this.setPeso(pe);
    }
    
    public void detalhes()
    {
        System.out.println("Cor do pelo é " + this.getCorPelo() + " e o peso é " + this.getPeso());
    }
//atributos    
    private String corPelo;

//getters e setters
    public String getCorPelo() 
    {
        return corPelo;
    }

    public void setCorPelo(String corPelo) 
    {
        this.corPelo = corPelo;
    }
    
    
    //metodos abstratos
    @Override
    public void locomover() 
    {
        System.out.println("Correndo");
    }

    @Override
    public void alimenta() 
    {
        System.out.println("Mamando");
    }

    @Override
    public  void emitirSom() 
    {
        System.out.println("Som de mamifero");
    }
    
}
