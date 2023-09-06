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
public class ConversorMedida {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um valor em metros ");
        float medida = entrada.nextFloat();
        System.out.println("1 centímetros 2 decímetros 3 qulômetros 4 polegadas");
        int cod = entrada.nextInt();
        switch (cod) {
            case 1:
                medida *= 100;
                System.out.println("Centímetros "+ medida);
                break;
            case 2:
                medida *= 10;
                System.out.println("Decímetros "+ medida);
                break;
            case 3:
                medida /= 1000;
                System.out.println("Quilômetros "+ medida);
                break;
            case 4:
                medida *= 39.3701;
                System.out.println("Polegadas "+ medida);
                break;
            default:
                System.out.println("Código inválido");
                break;
        }
        entrada.close();
    }
}
