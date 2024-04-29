import java.util.Locale;
import java.util.Scanner;

public class SuaConta {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite número da Conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Digite uma Agencia: ");
        String agencia = sc.next();
        System.out.print("Digite seu Nome: ");
        String nomeCliente = sc.next();
        sc.next();
        System.out.print("Valor do Deposito: ");
        double depositoInicial = sc.nextDouble();

        System.out.print("Olá " + nomeCliente
                + ", Obrigado por criar uma conta em nosso banco, sua agência é: "
                + agencia + " conta " + numeroConta + " e seu saldo " + depositoInicial
                + " já está disponível para saque");

        sc.close();
    }
}
