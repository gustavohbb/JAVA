/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class MaiorMenor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int maior = -9999999;
        int menor = 9999999;
        int n ;
        System.out.println("Digite 10 números ");
        for (int c = 1; c <= 10; c++) {
            n = entrada.nextInt();
            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }
        }
        System.out.printf("O maior número é %s\n",maior);
        System.out.printf("O menor número é %s", menor);
    }
}
