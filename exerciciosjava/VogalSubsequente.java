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
public class VogalSubsequente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite uma vogal maíuscula ");
        String vogal = entrada.next();
        switch (vogal) {
            case "A":
                System.out.println("E");
                break;
             case "E":
                System.out.println("I");
                break;
             case "I":
                System.out.println("O");
                break;
             case "O":
                System.out.println("U");
                break;
             case "U":
                System.out.println("Não tem subsequente");
                break;
             default:
                 System.out.println("Erro");
                 break;
        }
        entrada.close();
    }
}
