
package polimorfismodesobreposicao;
public class Reptil extends Animal 
{
    private String corEscamas;

    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
    
    
    
    @Override
    public void locomover() 
    {
        System.out.println("Rastejando");
    }

    @Override
    public void alimenta() 
    {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() 
    {
        System.out.println("Som de reptil");
    }
    
}
