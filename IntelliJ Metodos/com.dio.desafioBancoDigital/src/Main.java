import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int temp = 0;
        final String[] temp1 = {new String[1]};

        System.out.println("Olá! O que posso ajudar hoje? ");
        System.out.println("1 - Abrir Conta");
        System.out.println("2 - Acessar minha conta");
        scan.hasNextInt();
        temp = scan.nextInt();

        if (temp == 1) {
            Set<contaCli> Conta = new HashSet<>() {{
                scan.hasNextLine();
                temp1[0] = String.valueOf(scan.hasNextLine());
                add(new contaCli(scan.hasNextLine();));

            }};

        } if (temp == 2) {
            System.out.println("Digite sua agencia: ");
            scan.hasNextInt();
            temp = scan.nextInt();
        }if (temp == 1) {

        }



        Cliente cliente1 = new Cliente();
        cliente1.setNome("jose");
        Conta cc = new contaCorrente(cliente1);
        cc.depositar(100);
        Conta poupanca = new contaPoupanca(cliente1);
        cc.transferir(100, poupanca);



        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
