
package heranca;

public final class Bolsista extends Aluno
{
    private float bolsa;
    
    public void renovarBolsa()
    {
        System.out.println("Renovando bolsa do Aluno Bolsista: " + this.getNome());
    }
    
    @Override
    public final void pagarMensalidade()
    {
        System.out.println(this.getNome() + " é bolsista, pagamento facilitado");
    }
}
