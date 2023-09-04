import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        float total;
        Scanner entrada = new Scanner(System.in);
        System.out.println("""
                LANCHE  /\t CÓDIGO  /\t VALOR
                Cachorro Quente\t101/\t1,20
                Bauru Simples\t102/\t1,30
                Bauru Com Ovo\t103/\t1,50
                Hambúrger    \t104/\t1,20
                Cheeseburger\t105/\t1,30
                Refrigerante\t106/\t1,00
                """);
        int cod = entrada.nextInt();
        System.out.print("Quantidade: ");
        int qtd = entrada.nextInt();
        switch (cod) {
            case 101:
                total = qtd * 1.20f;
                System.out.printf("Cachorros Quentes pedidos: %s Total a pagar: R$%s", qtd, total);
                break;
            case 102:
                total = qtd * 1.30f;
                System.out.printf("Bauru Simples pedidos: %s Total a pagar: R$%s", qtd, total);
                break;
            case 103:
                total = qtd * 1.50f;
                System.out.printf("Bauru com Ovo pedidos: %s Total a pagar: R$%s", qtd, total);
                break;
            case 104:
                total = qtd * 1.20f;
                System.out.printf("Hambúrger pedidos: %s Total a pagar: R$%s", qtd, total);
                break;
            case 105:
                total = qtd * 1.30f;
                System.out.printf("CheeseBurger pedidos: %s Total a pagar: R$%s", qtd, total);
                break;
            default:
                System.out.println("ERRO Código inválido");
                break;
        }
        entrada.close();
    }
    }