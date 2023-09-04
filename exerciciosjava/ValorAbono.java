/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valorabono;

import java.util.Scanner;

/**
 *
 * @author gustavo_borba3
 */
public class ValorAbono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite sua idade, salário fixo, sexo e nome:");
        int idade = entrada.nextInt();
        float salario = entrada.nextFloat();
        String sexo = entrada.next();
        String nome = entrada.next();
        if ("M".equals(sexo) && idade >= 30) {
            salario += 100;
            System.out.printf("%s seu salário é R$%s", nome, salario);
        } else if ("M".equals(sexo) && idade < 30) {
            salario += 50;
            System.out.printf("%s seu salário é R$%s", nome, salario);
        } else if ("F".equals(sexo) && idade >= 30) {
            salario += 200;
            System.out.printf("%s seu salário é R$%s", nome, salario);
        } else if ( "F".equals(sexo) && idade < 30) {
            salario += 80;
            System.out.printf("%s seu salário é R$%s", nome, salario);
        } else {
            System.out.println("ERRO");
        }
        entrada.close();
    }
    }
    

