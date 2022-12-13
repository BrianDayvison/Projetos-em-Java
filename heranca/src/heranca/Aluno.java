
package heranca;

public class Aluno extends Pessoa
{
    private int matricula;
    private String curso;
  
    //metodos especiais 
    public void cancelarMatricula()
    {
        System.out.println("Matricula Cancelada!");
        this.setMatricula(0);
    }
    
    //getters e sedders

    public int getMatricula() 
    {
        return matricula;
    }

    public void setMatricula(int matricula) 
    {
        this.matricula = matricula;
    }

    public String getCurso() 
    {
        return curso;
    }

    public void setCurso(String curso) 
    {
        this.curso = curso;
    }
    
    
}
