import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do cliente: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double cashback = 0;

        // Cálculo do cashback com base na idade e valor da compra
        if (idade >= 21) {
            if (valorCompra < 1000) {
                cashback = valorCompra * 0.05;
            } else {
                cashback = valorCompra * 0.07;
            }
        } else {
            if (valorCompra < 1000) {
                cashback = valorCompra * 0.07;
            } else {
                cashback = valorCompra * 0.10;
            }
        }

        // Saída de dados
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Cliente: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Cashback: R$ %.2f%n", cashback);
        System.out.println("-----------------------------------------------------------------------");

        scanner.close();
    }
}
