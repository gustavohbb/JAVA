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
public class SomaAte {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int n, s = 0;
       String resp;
       do {
           System.out.print("Digite um número ");
           n = entrada.nextInt();
           s += n;
           System.out.print("Quer somar mais um número? (S/N) ");
           resp = entrada.next();
       } while ("S".equals(resp));
        System.out.println("A soma é "+ s);
        entrada.close();
    }
}
