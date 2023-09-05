/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex;

import java.util.Scanner;

/**
 *
 * @author gustavo_borba3
 */
public class TrocaDeValores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt(), b = entrada.nextInt();
        System.out.printf("A: %s  B: %s\n",a, b);
        int troca = a;
        a = b;
        b = troca;
        System.out.printf("A: %s  B: %s",a, b);
    }
}
