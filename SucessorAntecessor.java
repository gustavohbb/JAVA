/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package antecessorsucessor;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author gustavo_borba3
 */
public class SucessorAntecessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite um número");
        Scanner entrada = new Scanner(System.in);
        int numero =entrada.nextInt();
        int s = ++numero;
        int a = --numero - 1;
        System.out.println("O antecessor é: "+ a + " e o sucessor é: "+ s);
    }
    
}
