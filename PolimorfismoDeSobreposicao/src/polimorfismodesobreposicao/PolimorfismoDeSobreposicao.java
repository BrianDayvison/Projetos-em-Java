package polimorfismodesobreposicao;
public class PolimorfismoDeSobreposicao 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Mamifero m = new Mamifero("marrom",6.2f);
        Ave a = new Ave("vermelho", 5.2f);
        
        m.detalhes();
        a.detalhes();
    }
    
}
