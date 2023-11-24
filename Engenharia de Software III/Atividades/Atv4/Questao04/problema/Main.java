public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaInvestimento(1000);
        conta.depositar(500); // Parece violar o LSP, pois o saldo deveria aumentar, mas na verdade diminui.
        System.out.println("Saldo: " + conta.getSaldo()); // Saída: Saldo: 500
    }
}
