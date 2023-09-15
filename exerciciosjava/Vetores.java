import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        paresMImparesS();
        inverterArray();
        divisiveisPor();
        NumerosPrimos();
    }

    public static String maiorIndice() {
        Scanner in = new Scanner(System.in);
        int[] v = new int[8];
        int maior = -9999999;
        int indice = 0;
        for (int i = 0; i < v.length; i++) {
            v[i] = in.nextInt();
            if (v[i] > maior) {
                maior = v[i];
                indice = i;
            }
        }
        String resposta = "Maior: " + maior + " Indice: " + indice;
        return resposta;
    }

    public static int somaVetores() {
        Scanner in = new Scanner(System.in);
        int v[] = new int[10];
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            v[i] = in.nextInt();
            soma += v[i];
        }
        return soma;
    }

    public static void NumerosPrimos() {
        Scanner in = new Scanner(System.in);
        int[] v = new int[5];
        System.out.println("Digite 5 números:");
        // Preencha o array com os números fornecidos pelo usuário
        for (int i = 0; i < v.length; i++) {
            v[i] = in.nextInt();
        }
        // Verifique se cada número é primo e imprima os primos
        for (int i = 0; i < v.length; i++) {
            boolean ehPrimo = true;
            // Um número primo é divisível apenas por 1 e por ele mesmo
            // Portanto, verifique se ele é divisível por algum número entre 2 e a raiz quadrada dele
            if (v[i] <= 1) {
                ehPrimo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(v[i]); j++) {
                    if (v[i] % j == 0) {
                        ehPrimo = false;
                        break; // Se for divisível por algum número, não é primo, então saia do loop
                    }
                }
            }
            // Se ehPrimo ainda for verdadeiro, o número é primo, então imprima-o
            if (ehPrimo) {
                System.out.println(v[i]);
            }
        }
    }

    public static void divisiveisPor() {
        Scanner in = new Scanner(System.in);
        int[] v = new int[10];
        System.out.println("Digite um número");
        int numDiv = in.nextInt();
        for (int i = 0; i < v.length; i++) {
            System.out.println("Digite o valor pro vetor");
            v[i] = in.nextInt();
            if (v[i] % numDiv == 0) {
                System.out.println(v[i] + " ");
            }
        }
    }
    public static void inverterArray() {
        Scanner in = new Scanner(System.in);
        int[] v = new int[5];
        int numPosicoes = v.length - 1;
        int aux;
        for (int i = 0; i < v.length; i++) {
            v[i] = in.nextInt();
        }
        for (int i = 0; i < numPosicoes / 2; i++) {
            aux = v[i];
            v[i] = v[numPosicoes - i];
            v[numPosicoes - i] = aux;
        }
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
    public static void paresMImparesS() {
        Scanner in = new Scanner(System.in);
        int[] v = new int[10];
        int paresMulti = 1, imparesSoma = 0;
        System.out.println("Informe 10 números");
        for (int i = 0; i < v.length; i++) {
            v[i] = in.nextInt();
            if (v[i] % 2 == 0) {
                paresMulti *= v[i];
            } else {
                imparesSoma += v[i];
            }
        }
        System.out.printf("Multiplicação pares: %s  Soma impares: %s", paresMulti, imparesSoma);
    }
}