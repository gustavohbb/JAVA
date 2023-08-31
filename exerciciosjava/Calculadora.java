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
public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite dois números e a operação desejada ");
        int n1 = entrada.nextInt(), n2 = entrada.nextInt();
        String opr = entrada.next();
        switch (opr) {
            case "+":
                int soma = n1 + n2;
                System.out.printf("A soma de %s + %s é %s", n1, n2, soma);
                break;
            case "-":
                int sub = n1 - n2;
                System.out.printf("A subtração de %s - %s é %s", n1, n2, sub);
                break;
            case "/":
                int div = n1 / n2;
                System.out.printf("A divisão de %s / %s é %s", n1, n2, div);
                break;
            case "*":
                int multi = n1 * n2;
                System.out.printf("A multiplicação de %s * %s é %s", n1, n2, multi);
                break;
            default:
                System.out.println("Operação inválida");
                break;        
        }
        entrada.close();
    }

}
