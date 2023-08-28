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
public class TurnosEscola {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu turno (M/V/N) ");
        String turno = entrada.next();
        if ("M".equals(turno)) {
            System.out.println("Bom dia!!");
        } else {
            if ("V".equals(turno)) {
                System.out.println("Boa tarde!!");
            } else {
                if ("N".equals(turno)) {
                    System.out.println("Boa Noite!!");
                } else {
                    System.out.println("Erro valor inválido");
                }
            }
        }
        entrada.close();
    }
}
