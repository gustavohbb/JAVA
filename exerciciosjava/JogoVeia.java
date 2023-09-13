package jogoveia;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class JogoVeia {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] v = new int[3][3];
        System.out.println("Digite seu name ");
        String nome1 = entrada.nextLine();
        System.out.println("Digite seu name 2 ");
        String nome2 = entrada.nextLine();
        boolean controle = true;
        while (controle) {
            System.out.print("Digite a posição desejada" + nome1);
            int p = entrada.nextInt();
            switch (p) {
                case 1:
                    v[0][0] = 2;
                    break;
                case 2:
                    v[0][1] = 2;
                    break;
                case 3:
                    v[0][2] = 2;
                    break;
                case 4:
                    v[1][0] = 2;
                    break;
                case 5:
                    v[1][1] = 2;
                    break;
                case 6:
                    v[1][2] = 2;
                    break;
                case 7:
                    v[2][0] = 2;
                    break;
                case 8:
                    v[2][1] = 2;
                    break;
                case 9:
                    v[2][2] = 2;
                    break;
            }
            if (v[0][0] == 2 && v[0][1] == 2 && v[0][2] == 2 || v[1][0] == 2 && v[1][1] == 2 && v[1][2] == 2 || v[2][0] == 2 && v[2][1] == 2 && v[2][2] == 2) {
                System.out.println("Ganhou " + nome1);
                controle = false;
                break;
            }else if (v[0][0] == 2 && v[1][0] == 2 && v[2][0] == 2 || v[0][1] == 2 && v[1][1] == 2 && v[2][1] == 2 || v[0][2] == 2 && v[1][2] == 2 && v[2][2] == 2) {
                System.out.println("Ganhou " + nome1);
                controle = false;
                break;
            } else if (v[0][0] == 2 && v[1][1] == 2 && v[2][2] == 2 || v[2][0] == 2 && v[1][1] == 2 && v[0][2] == 2) {
                System.out.println("Ganhou " + nome1);
                controle = false;
                break;
            }
            System.out.print("Digite a posição desejada" + nome2);
            int p2 = entrada.nextInt();
            switch (p2) {
                case 1:
                    v[0][0] = 1;
                    break;
                case 2:
                    v[0][1] = 1;
                    break;
                case 3:
                    v[0][2] = 1;
                    break;
                case 4:
                    v[1][0] = 1;
                    break;
                case 5:
                    v[1][1] = 1;
                    break;
                case 6:
                    v[1][2] = 1;
                    break;
                case 7:
                    v[2][0] = 1;
                    break;
                case 8:
                    v[2][1] = 1;
                    break;
                case 9:
                    v[2][2] = 1;
                    break;
            }
            if (v[0][0] == 0 && v[0][1] == 1 && v[0][2] == 1 || v[1][0] == 1 && v[1][1] == 1 && v[1][2] == 1 || v[2][0] == 1 && v[2][1] == 1 && v[2][2] == 1) {
                System.out.println("Ganhou " + nome2);
                controle = false;
                break;
            }else if (v[0][0] == 1 && v[1][0] == 1 && v[2][0] == 1 || v[0][1] == 1 && v[1][1] == 1 && v[2][1] == 1 || v[0][2] == 1 && v[1][2] == 1 && v[2][2] == 1) {
                System.out.println("Ganhou " + nome2);
                controle = false;
                break;
            } else if (v[0][0] == 1 && v[1][1] == 1 && v[2][2] == 1 || v[2][0] == 1 && v[1][1] == 1 && v[0][2] == 1) {
                System.out.println("Ganhou " + nome2);
                controle = false;
                break;
            }
        }
    }
}

