package polimorfismodesobreposicao;
public class PolimorfismoDeSobreposicao 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        //Mamifero m = new Mamifero("marrom",6.2f);
        Ave a = new Ave("vermelho", 5.2f);
        Canguru c = new Canguru ("amarelo",30f);
        Cachorro ca = new Cachorro("preto",22f);
        
     
        ca.detalhes();
        ca.locomover();
        ca.reagir(15,30);
        
    }
    
}
