import java.util.Scanner;
import java.util.Locale;
public class BankAccount {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        // criando uma conta bancária
        String accountNumber;
        int agence;
        String name;
        double balance;
        public void createAccount() {
            System.out.println("Digite o numero da conta: ");
            accountNumber = sc.next();

            System.out.println("Digite o numero da agencia: ");
            agence = sc.nextInt();

            System.out.println("Digite o nome do titular: ");
            name = sc.next();

            System.out.println("Digite o saldo da conta: ");
            balance = sc.nextDouble();

    }

    public void cashOut() {
        double amount = 0;

        System.out.println("Digite o valor a ser sacado: ");
        amount = sc.nextDouble();

        balance = balance - amount;
    }

    public void cashIn() {
        double amount = 0;

        System.out.println("Digite o valor a ser depositado: ");
        amount = sc.nextDouble();

        balance = balance + amount;
    }

    public void showAccount() {
        System.out.println("Conta: " + accountNumber);
        System.out.println("Agencia: " + agence);
        System.out.println("Titular: " + name);
        System.out.println("Saldo: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.createAccount();
        account.cashIn();
        account.cashOut();
        account.showAccount();
    }
}
