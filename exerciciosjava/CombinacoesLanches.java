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
public class CombinacoesLanches {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o código do seu lanche e bebida ");
        System.out.println("Bauru 1 / Guaraná 1\nX Galinha 2 / Água 2\nPizza 3 / Vinho 3");
        int lanch = entrada.nextInt(), bebi = entrada.nextInt();
        if (lanch == 1 && bebi == 1) {
            System.out.println("Não pode ser entregue ");
        } else if (lanch == 2 && bebi == 2) {
            System.out.println("Não pode ser entregue ");
        } else if (lanch == 3 && bebi == 1) {
            System.out.println("Não pode ser entregue ");
        } else if (lanch > 3 && bebi > 3) {
            System.out.println("Pedido invalido");
        } else {
            System.out.println("Pedido enviado com sucesso!");
        }
        entrada.close();
    }
}

