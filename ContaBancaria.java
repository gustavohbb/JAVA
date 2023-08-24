/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java;

import java.util.Scanner;

/**
 *
 * @author gustavo_borba3
 */
public class ContaBancaria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float conta = 0f;
        System.out.printf("O saldo atual é %s Digite o valor depositado ", conta);
        float deposito = entrada.nextFloat();
        conta = deposito;
        System.out.println("O saldo atual é: " + conta);
        System.out.println("Digite o valor a ser retirado: ");
        float retirada = entrada.nextFloat();
        conta = conta - retirada;
        System.out.println("O saldo atual é: " + conta);
        entrada.close();
    }
}
