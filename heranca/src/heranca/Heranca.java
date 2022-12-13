package heranca;
public class Heranca 
{

    public static void main(String[] args) 
    {
        
      Pessoa P1 = new Pessoa();
      Aluno P2 = new Aluno();
      Professor P3 = new Professor();
      Funcionario P4 = new Funcionario();
      
      P1.setNome("wesley");
      P1.setIdade(22);
      P1.setSexo("Masculino");
      P1.fazerAniversario();
      
      P2.setNome("Brian");
      P2.setIdade(26);
      P2.setSexo("Masculino");
      P2.setMatricula(4602);
      P2.setCurso("Engenharia de Software");
      //P2.cancelarMatricula();
      
      P3.setNome("Carlos");
      P3.setEspecialidade("POO");
      P3.setSexo("masculino");
      P3.setIdade(35);
      P3.setSalario(4500);
      P3.receberAumento(500);
     
        
        //System.out.println(P2.toString());
        //System.out.println(P2.getCurso() + "\n" + P2.getMatricula());
        System.out.println(P3.toString());
        System.out.println(P3.getEspecialidade() +"\n"+ P3.getSalario() );
    }
    
}
