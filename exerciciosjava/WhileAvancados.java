import java.util.Scanner;

public class WhileAvancados {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str  = "hello";
        System.out.println(ateImpares(n));
        System.out.println(menorNumero());
        System.out.println(loginSenha());
        System.out.println(maiorNumero());
        System.out.println(atePares(n));
        System.out.println(inverterString(str));
        System.out.println(somaInteiros());
        System.out.println(idadeMedia());
        System.out.println(pares());
        System.out.println(ateNumero(n));
    }

    public static int idadeMedia() { // Questão 1
        Scanner in = new Scanner(System.in);
        boolean termino = false;
        int idade = 0;
        int media = 0;
        int contagem = 0;
        while (!termino) {
            System.out.print("Digite uma idade ");
            contagem++;
            media += idade;
            idade = in.nextInt();
            if (idade == -1) {
                media /= contagem;
                termino = true;
            }
        }
        return media;
    }

    public static String pares() { // Questão 2
        String pares = "";
        int i = 1;
        while (i <= 50) {
            i++;
            if (i % 2 == 0) {
                pares += i + " ";
            }
        }
        return pares;
    }

    public static String ateNumero(int numero) { // Questão 3
        int i = 0;
        String sequencia = "";
        while (i < numero) {
            i++;
            sequencia += i + " ";
        }
        return sequencia;
    }

    public static int somaInteiros() { // Questão 4
        Scanner in = new Scanner(System.in);
        int i = 0;
        int soma = 0;
        while (i < 100) {
            i++;
            soma += in.nextInt();
            System.out.print("0 Encerar 1 continuar ");
            int controle = in.nextInt();
            if (controle == 0) {
                break;
            }
        }
        return soma;
    }
    public static String inverterString(String str) { // Questão 5
        char[] chars = str.toCharArray();
        int numchars = chars.length -1;
        int i = 0;
        while (i < numchars / 2) {
            char temp = chars[i];
            chars[i] = chars[numchars -i];
            chars[numchars -i] = temp;
            i++;
        }
        return new String(chars);
    }
    public static String atePares(int n) { // Questão 6
        String pares = "";
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                pares += i + " ";
            }
            ++i;
        }
        return pares;
    }
    public static int maiorNumero() { // Quetão 7
        Scanner in = new Scanner(System.in);
        int i = 0;
        int maior = -9999999;
        int num = 0;
        while (i <= 100) {
            num = in.nextInt();
            if (num == -1) {
                break;
            }
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }
    public static String loginSenha() { // Quetão 8
        Scanner in = new Scanner(System.in);
        System.out.print("Digite sua nova senha ");
        String senha = in.nextLine();
        String confirmar = "";
        boolean correta = false;
        while (!correta) {
            System.out.println("Entre com sua senha");
            confirmar = in.nextLine();
            if (confirmar.equals(senha)) {
                System.out.println("Senha correta");
                correta = true;
            } else {
                System.out.println("Senha incorreta tente novamente");
            }
        }
        return senha;
    }
    public static int menorNumero() { // Quetão 9
        Scanner in = new Scanner(System.in);
        int i = 0;
        int menor = 9999999;
        int num = 0;
        while (i <= 100) {
            num = in.nextInt();
            if (num == 0) {
                break;
            }
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }
    public static String ateImpares(int n) { // Questão 10
        String impares = "";
        int i = 1;
        while (i <= n) {
            if (i % 2 == 1) {
                impares += i + " ";
            }
            ++i;
        }
        return impares;
    }
}