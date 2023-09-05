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
public class LivrosDesconto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de livros comprados ");
        float total;
        int qtdLivros = entrada.nextInt();
        if (qtdLivros >= 10) {
            total = qtdLivros * 8;
            System.out.printf("O total a pagar com a promoção é: R$%s", total);
        } else {
            total = qtdLivros * 12;
            System.out.printf("Total a pagar: R$%s", total);
        }
    }
}
