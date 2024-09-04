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
                """;

        Scanner reading = new Scanner(System.in);

        while(option != 4){
            System.out.println(menu);
            option = reading.nextInt();

        }




    }
}
