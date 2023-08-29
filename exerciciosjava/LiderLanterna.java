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
public class LiderLanterna {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor de pontos do líder ");
        int lider = entrada.nextInt();
        System.out.print("Digite o valor de pontos do lanterna ");
        int lanterna = entrada.nextInt();
        int vitoriasLant = (lider - lanterna) / 3;
        System.out.printf("Vitórias necessarias para alcançar o líder %s", vitoriasLant);
        entrada.close();
    }
}
