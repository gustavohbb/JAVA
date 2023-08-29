/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class OperacoesAritimeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite dois valores ");
        int v1 = entrada.nextInt(), v2 = entrada.nextInt();
        int soma = v1 + v2;
        int sub = v1 - v2;
        int multi = v1 * v2;
        int div = v1 / v2;
        int rest = v1 % v2;
        System.out.printf("O resultado de %s + %s é: %s\n", v1, v2, soma);
        System.out.printf("O resultado de %s - %s é %s\n", v1, v2, sub);
        System.out.printf("O resultado de %s * %s é %s\n", v1, v2, multi);
        System.out.printf("O resultado de %s / %s é %s\n", v1, v2, div);
        System.out.printf("E resto da divisao é %s", rest);
        entrada.close();
    }

}
