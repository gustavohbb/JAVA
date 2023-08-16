/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sabosabido;

import java.util.Scanner;

/**
 *
 * @author gustavo_borba3
 */
public class SaboSabido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite um número");
        Scanner entrada = new Scanner(System.in);
        int numero =entrada.nextInt();
        int a = numero - 1;
        int s = numero + 1;
        System.out.println("O antecessor é: "+ a + " e o sucessor é: "+ s);
    }
    
}
