public class ContaInvestimento extends ContaBancaria {
    public ContaInvestimento(double saldo) {
        super(saldo);
    }

    // Método violando o LSP, pois diminui o saldo.
    @Override
    public void depositar(double valor) {
        saldo -= valor;
    }
}
