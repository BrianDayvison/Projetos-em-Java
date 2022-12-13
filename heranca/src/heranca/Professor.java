
package heranca;

public class Professor extends Pessoa
{
    private String especialidade;
    private float salario;
    
    //metodos especiais
    public void receberAumento(float sold)
    {
        this.setSalario(this.getSalario() + sold);
    }
    
    //getters e sedders

    public String getEspecialidade() 
    {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) 
    {
        this.especialidade = especialidade;
    }

    public float getSalario() 
    {
        return salario;
    }

    public void setSalario(float salario) 
    {
        this.salario = salario;
    }
    
    
    
}
