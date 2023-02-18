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
        Mamifero ca = new Cachorro("preto",22f);
        Cachorro cb = new Cachorro ("cinza", 15f);
     
        ca.detalhes();
        ca.locomover();
        cb.reagir(15,30);
        
    }
    
}
