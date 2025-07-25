import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o numero da sua Conta:");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o seu Nome: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o seu Saldo:");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para o saque!", nomeCliente, agencia, numero, saldo);
    }
}