/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_java;

import java.util.Scanner;

/**
 *
 * @author gustavo_borba3
 */
public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da base: ");
        float base = entrada.nextFloat();
        System.out.println("Digite o valor da altura: ");
        float altura = entrada.nextFloat();
        float area = (base * altura) / 2;
        System.out.println("A área do triangulo é: "+ area);
        entrada.close();
    }
    
}
