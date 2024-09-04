import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String name = "Clark Kent";
        String typeAccount = "Corrente";
        double balance = 1599.99;
        int option = 0;

        System.out.println("*************************************");
        System.out.println("Nome do cliente: " + name);
        System.out.println("Tipo conta: " + typeAccount);
        System.out.println("Saldo atual: " + balance);
        System.out.println("*************************************\n");

        String menu = """
                ** Digite sua opção **
                1 - Consultar Saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                \n""";

        Scanner reading = new Scanner(System.in);

        while(option != 4){
            System.out.println(menu);
            option = reading.nextInt();

            if(option == 1){
                System.out.println("O saldo atualizado é: " + balance + ".");
            } else if (option == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double value = reading.nextDouble();
                if (value > balance) {
                    System.out.println("\nNão há saldo para realizar a transferência!");
                } else{
                    balance -= value;
                    System.out.printf("\nSeu saldo atual: " + balance + ".");
                }
            } else if (option == 3) {
                System.out.printf("Valor a receber/depositar?\n");
                double value = reading.nextDouble();
                balance += value;
                System.out.println("Novo saldo: " + balance + ".");
            } else if (option != 4) {
                System.out.println("Opção inválida!!\n");
            }

        }
    }
}
