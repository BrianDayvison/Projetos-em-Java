package heranca;


abstract class Pessoa 
{
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniversario()
    {
        this.setIdade(this.getIdade() + 1);
       
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String n)
    {
        this.nome = n;
               
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) 
    {
        this.idade = id;
    }

    public String getSexo() 
    {
        return sexo;
    }

    public void setSexo(String sx) 
    {
        this.sexo = sx;
    }

    @Override
    public String toString() 
    {
        return "Dados:\n" + "nome: " + nome + ", idade: " + idade + ", sexo: " + sexo + '}' + "\n-----------------------" ;
        
    }
    
    
}

