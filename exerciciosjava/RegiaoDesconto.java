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
public class RegiaoDesconto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o preço do produto ");
        float preco = entrada.nextFloat();
        System.out.println("""
                           1 - regi\u00e3o norte com desconto de 5%, 
                           2 - regi\u00e3o sul com desconto de 15%, 
                           3 - regi\u00e3o sudeste com desconto de 7%, 
                           4 - regi\u00e3o nordeste com desconto de 12% e 
                           5 - regi\u00e3o centro-oeste com desconto de 20%. """);
        int cod = entrada.nextInt();
        float desconto;
        switch (cod) {
            case 1:
                desconto = (preco / 100) * 5;
                preco += desconto;
                System.out.printf("Seu produto custa: R$%s desconto R$%s", preco, desconto);
                break;
            case 2:
                desconto = (preco / 100) * 15;
                preco += desconto;
                System.out.printf("Seu produto custa: R$%s desconto R$%s", preco, desconto);
                break;
            case 3:
                desconto = (preco / 100) * 7;
                preco += desconto;
                System.out.printf("Seu produto custa: R$%s desconto R$%s", preco, desconto);
                break;
            case 4:
                desconto = (preco / 100) * 12;
                preco += desconto;
                System.out.printf("Seu produto custa: R$%s desconto R$%s", preco, desconto);
                break;
            case 5:
                desconto = (preco / 100) * 20;
                preco += desconto;
                System.out.printf("Seu produto custa: R$%s desconto R$%s", preco, desconto);
                break;
            default:
                System.out.println("Produto importado");
                break;
        }
        entrada.close();
    }
}