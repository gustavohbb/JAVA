/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaquadrado;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class AreaQuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da base do quadrado:");
        float base = entrada.nextFloat();
        float altura = base;
        float area = (float) base * altura;
        System.out.println("A área do quadrado é de: "+area);
    }
    
}
