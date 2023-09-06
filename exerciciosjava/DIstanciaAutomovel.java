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
public class DIstanciaAutomovel {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        System.out.println("Digite os litos abastecidos e os Km/L ");
       float combustivel = entrada.nextFloat();
       float kmLitro = entrada.nextFloat();
       float distancia = combustivel * kmLitro;
        System.out.println("A distância máxima que pode ser percorrida é Km"+ distancia);
        entrada.close();
    }
}
