import java.util.Scanner;

public class ExeciciosAvancados {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(crescente());
        System.out.println(pares());
        System.out.println(maior());
        System.out.println(tabuada(n));
        System.out.println(menor());
        System.out.println(somaPares());
        System.out.println(apenasPares());
        System.out.println(media());
        System.out.println(apenasImpares());
        System.out.println(fibonacci());
    }
    public static String crescente() { //Questão 1
        String c = "";
        for (int i = 1; i <= 10; i++) {
            c += i + " ";
        }
        return c;
    }
    public static String pares() { //Questão 2
        String p = "";
        for (int i = 0; i <= 20; i+=2) {
            p += i + " ";
        }
        return p;
    }
    public static int maior() { //Questão 3
        Scanner in = new Scanner(System.in);
        int maior = -9999999;
        for (int i = 0; i <= 200; i++) {
           int n = in.nextInt();
           if (n > maior) {
               maior = n;
           }
           if (n == -1) {
               break;
           }
        }
        return maior;
    }
    public static String tabuada(int n) { //Questão 4
        String tabuada = "";
        for (int i = 1; i <= 10; i++) {
            tabuada += n + " * " + i + " " + n * i + "\n";
        }
        return tabuada;
    }
    public static int menor() { // Questão 5
        Scanner in = new Scanner(System.in);
        int menor = 9999999;
        for (int i = 0; i <= 200; i++) {
            int n = in.nextInt();
            if (n < menor) {
                menor = n;
            }
            if (n == 0) {
                break;
            }
        }
        return menor;
    }
    public static int somaPares() { // Questão 6
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
              soma += i;
            }
        }
        return soma;
    }
    public static String apenasPares() { // Questão 7
        Scanner in = new Scanner(System.in);
        String pares = "";
        for (int i = 0; i < 100; i++) {
            int n = in.nextInt();
            if (n == -1) {
                break;
            }
            if (n % 2 == 0) {
                pares += n + " ";
            }
        }
        return pares;
    }
    public static int media() { // Questão 8
        Scanner in = new Scanner(System.in);
        int media = 0;
        for (int i = 0; i < 100; i++) {
            int n = in.nextInt();
            if (n == -1) {
                media /= i;
                break;
            }
            media += n;
        }
        return media;
    }
    public static String apenasImpares() { // Questão 9
        Scanner in = new Scanner(System.in);
        String impares = "";
        for (int i = 0; i < 100; i++) {
            int n = in.nextInt();
            if (n == -1) {
                break;
            }
            if (n % 2 == 1) {
                impares += n + " ";
            }
        }
        return impares;
    }
    public static String fibonacci() {
        int n = 1;
        int sequencia = 0;
        int aux;
        String fibonacci = "";
        for (int i = 0; i <= 20; i++) {
            fibonacci += sequencia + " ";
            aux = n;
            n = sequencia;
            sequencia += aux;
        }
        return fibonacci;
    }
}
