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
public class ValorDesconto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        float produto = entrada.nextFloat();
        System.out.print("Digite a porcentagem de desconto: ");
        float desconto = entrada.nextFloat();
        float valorDesconto = produto * (desconto / 100);
        produto = produto - valorDesconto;
        System.out.printf("O valor de desconto é %s e o valor do produto com desconto %s R$", valorDesconto, produto);
        entrada.close();
    }
}
