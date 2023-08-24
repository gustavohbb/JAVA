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
public class ValorReajuste {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o saldo para reajuste ");
        float saldo = entrada.nextFloat();
        System.out.println("Escreva um valor em porcentagem ");
        float reajuste = entrada.nextFloat();
        float valorReaj = (saldo * reajuste) / 100;
        saldo = saldo + valorReaj;
        System.out.printf("O valor de reajuste foi de %s e o saldo total é %s", valorReaj, saldo);
        entrada.close();
    }
}
