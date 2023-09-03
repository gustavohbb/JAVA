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
public class SoDaCampeao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva o número de pontos de cada jogador ");
        int joao = entrada.nextInt();
        int chico = entrada.nextInt();
        int pedro = entrada.nextInt();
        int bola = entrada.nextInt();
        int soma = (chico + pedro + bola) / 2, triploBola = bola * 3;
        int metadePedro = pedro / 2, somaJoaoChico = joao + chico;
        if (joao < soma) {
            System.out.println("Desclassificados");
        } else if (pedro >= triploBola) {
            System.out.println("Desclassificados");
        } else if (chico <= 0) {
            System.out.println("Desclassificados");
        } else if (bola == metadePedro || bola < somaJoaoChico) {
            System.out.println("Classificados");
        } else {
            System.out.println("Desclassificados");
        }
        entrada.close();
    }
}
