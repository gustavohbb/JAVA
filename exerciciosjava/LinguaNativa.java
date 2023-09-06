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
public class LinguaNativa {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        System.out.println("1 Brasileiro\n2 Alemão\n3 Inglês\n4 Italiano\n5 Espanhol\n6 Francês");
        int cod = entrada.nextInt();
        switch (cod) {
            case 1:
                System.out.println("Portugues");
                break;
            case 2:
                System.out.println("Alemão");
                break;
            case 3:
                System.out.println("Inglês");
                break;
            case 4:
                System.out.println("Italiano");
                break;
            case 5:
                System.out.println("Espanhol");
                break;
            case 6:
                System.out.println("Francês");
                break;
            default:
                System.out.println("Não pode ser verificado");
                break;
        }
        entrada.close();
    }
}
