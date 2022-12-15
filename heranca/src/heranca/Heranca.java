package heranca;
public class Heranca 
{

    public static void main(String[] args) 
    {
      Aluno P2 = new Aluno();
      Professor P3 = new Professor();
      Funcionario P4 = new Funcionario();
      
      P2.setNome("Brian");
      P2.setIdade(26);
      P2.setSexo("Masculino");
      P2.setMatricula(4602);
      P2.setCurso("Engenharia de Software");
      //P2.cancelarMatricula();
      //P2.pagarMensalidade();
      
      P3.setNome("Carlos");
      P3.setEspecialidade("POO");
      P3.setSexo("masculino");
      P3.setIdade(35);
      //P3.setSalario(4500);
      //P3.receberAumento(500);
     
      Bolsista B[] = new Bolsista[3];
      B[0] = new Bolsista();
      B[0].setNome("Marcos");
      B[0].setMatricula(7418);
      B[0].setIdade(26);
      B[0].setCurso("Engenharia Eletrica");
      B[0].setSexo("Masculino");
     // B[0].renovarBolsa();
     // B[0].pagarMensalidade();
      //B[0].cancelarMatricula();
      
        //System.out.println(B[0].getCurso());
        
        //System.out.println(P2.toString());
        //System.out.println(P2.getCurso() + "\n" + P2.getMatricula());
        //System.out.println(P3.toString());
        //System.out.println(P3.getEspecialidade() +"\n"+ P3.getSalario() );
    }
    
}
