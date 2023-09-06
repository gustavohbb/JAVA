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
public class PublicoFut {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o público do jogo ");
        int publico = entrada.nextInt();
        float popular = ((publico / 100) * 10) * 5;
        float geral = ((publico / 100) * 50) * 10;
        float arqui = ((publico / 100) * 30) * 20;
        float cadeira = ((publico / 100) * 10) * 30;
        float renda = popular + geral + arqui + cadeira;
        System.out.println("A renda do jogo é de R$"+ renda);
        entrada.close();
    }
}
