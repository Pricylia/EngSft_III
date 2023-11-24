public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaInvestimento(1000);
        conta.depositar(500);
        System.out.println("Saldo: " + conta.getSaldo()); // Saída: Saldo: 1500
    }
}
