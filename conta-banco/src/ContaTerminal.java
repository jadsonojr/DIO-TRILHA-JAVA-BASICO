import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // "Variáveis para armazenar dados da conta"
        int numeroAgencia;
        String nomeCliente;
        int numeroConta;
        double saldoConta;

        // Criando o Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Solicitando e armazenando dados da conta
        System.out.println("Por favor, digite o número da agência:");
        numeroAgencia = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.println("Por favor, digite o nome do cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.println("Por favor, digite o saldo da conta:");
        saldoConta = scanner.nextDouble();

        // Fechando o Scanner
        scanner.close();

        // Apresentando o resumo da conta
        String mensagemResumo = gerarMensagemResumo(numeroAgencia, nomeCliente, numeroConta, saldoConta);
        System.out.println(mensagemResumo);
    }

    private static String gerarMensagemResumo(int numeroAgencia, String nomeCliente, int numeroConta, double saldoConta) {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + numeroAgencia +
                ", conta " + numeroConta + " e seu saldo de R$" + saldoConta + " já está disponível para saque.";
    }
}
    