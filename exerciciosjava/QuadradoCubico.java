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
public class QuadradoCubico {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número ");
        int num = entrada.nextInt();
        System.out.println("1 Quadrado 2 Cubico");
        int cod = entrada.nextInt();
        switch (cod) {
            case 1:
                num *= num;
                System.out.println("Qudrado: "+ num);
                break;
            case 2:
                num *= num * num;
                System.out.println("Cubico: "+ num);
                break;
            default:
                System.out.println("ERRO");
                break;
        }
        entrada.close();
    }
}
