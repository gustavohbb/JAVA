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
public class AnosMesesEmDias {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escreva quantos anos ");
        int anos = entrada.nextInt();
        System.out.print("Escreva os meses ");
        int meses = entrada.nextInt();
        System.out.print("Esceva os dias ");
        int dias = entrada.nextInt();
        int totalDias = (anos * 365) + (meses * 30) + dias;
        System.out.printf("%s Anos, %s Meses, %s Dias são %s Dias ", anos, meses, dias, totalDias);
        entrada.close();
    }
}
