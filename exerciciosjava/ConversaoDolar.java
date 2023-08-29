/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class ConversaoDolar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a cotação do Dólar ");
        float cotacao = entrada.nextFloat();
        System.out.print("Digite um valor em Dólares ");
        float dolar = entrada.nextFloat();
        float real = dolar * cotacao;
        System.out.printf("O valor em Reais é %s", real);
        entrada.close();
    }
}