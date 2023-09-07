/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joptionpane;

/**
 *
 * @author gustavo_borba3
 */
public class Fibonacci {

    public static void main(String[] args) {
        int sequencia = 0;
        int n = 1;
        int aux;
        for (int i = 1; i <= 20; i++) {
            System.out.print(" "+ sequencia);
            aux = n;
            n = sequencia;
            sequencia += aux;
            
        }
    }
}
