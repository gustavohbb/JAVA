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
public class MenuSomaMulti {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        System.out.println("Digite dois números ");
        int n1 = entrada.nextInt(), n2 = entrada.nextInt();
        System.out.println("Digite 1 Soma 2 Multiplicação 3 Finalizar");
        int cod = entrada.nextInt();
        switch (cod) {
            case 1:
                n1 += n2;
                System.out.println("Soma "+ n1);
                break;
            case 2:
                n1 *= n2;
                System.out.println("Multiplicação "+ n1);
                break;
            case 3:
                break;
        }
        entrada.close();
    }
}
