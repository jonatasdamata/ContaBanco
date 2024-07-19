import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*TODO: Importar a classe Scanner
                Exibiri as mensagens para os nossos usuários
                Obter pela Scanner os valores digitados no terminal
                Exibir a mensagem final (Conta criada)
        */

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da Conta: ");
        String numeroConta = scanner.nextLine();

        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o nome do Cliente: ");
        String cliente = scanner.nextLine();

        System.out.println("Digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        String saldoFormatado = String.format(".%2f", saldo);

        System.out.println("Olá, " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " e seu saldo R$"+ saldoFormatado + ", já está disponível para saque!");

    }
}
