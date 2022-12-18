package polimorfismodesobreposicao;
public abstract class Animal 
{
    protected float peso;
    protected int idade, membros;
    
    public abstract void locomover();
    public abstract void alimenta();
    public abstract void emitirSom();

    public float getPeso() 
    {
        return peso;
    }
    
    public void setPeso(float p)
    {
        this.peso = p;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) 
    {
        this.idade = idade;
    }

    public int getMembros() 
    {
        return membros;
    }

    public void setMembros(int membros) 
    {
        this.membros = membros;
    }
    
    
    
}
