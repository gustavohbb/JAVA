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
public class ValorHora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite as horas trabalhadas ");
        float hrMensais = entrada.nextFloat();
        System.out.println("Digite o salário mensal ");
        float salarioMensal = entrada.nextFloat();
        float valorHora = salarioMensal / hrMensais;
        System.out.printf("O valor por hora é de R$ %s", valorHora);
        entrada.close();
    }
}
