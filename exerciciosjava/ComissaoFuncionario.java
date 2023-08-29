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
public class ComissaoFuncionario {

    public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
         System.out.print("Digite a indentificação ");
         String nome = entrada.nextLine();
         System.out.print("Digite o código da peça ");
         int cod = entrada.nextInt();
         System.out.print("Digite o preço ");
         float preco = entrada.nextFloat();
         System.out.print("Quantidade vendida ");
         int qtd =entrada.nextInt();
         float valorTotal = preco * qtd;
         float comissao = (valorTotal * 5) / 100;
         System.out.printf("Vendido por %s código %s preço %s quantidade %s valor total %s comissão %s", nome, cod, preco, qtd, valorTotal, comissao);
         entrada.close();
    }
}
