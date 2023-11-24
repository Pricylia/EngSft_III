public class Conta {
    private double saldo;
    private String numeroConta;
    private Cliente cliente;

    public Conta(String numeroConta, double saldoInicial, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo -= valor;
    }

    // Outros métodos relevantes...

    // Getters para acessar os dados do cliente, se necessário
    public String getNomeCliente() {
        return cliente.getNome();
    }

    public String getCpfCliente() {
        return cliente.getCpf();
    }

    public String getEnderecoCliente() {
        return cliente.getEndereco();
    }
}
