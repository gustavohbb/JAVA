/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaaluno;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class CalculoMediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite cada nota: ");
        int nota1 = scanner.nextInt();
        
        int nota2 = scanner.nextInt();
        
        int nota3 = scanner.nextInt();
        
        int soma = nota1 + nota2 + nota3;
        
         double media = (double) soma / 3;
         
        System.out.println("A média das notas é: " + media);
        }
       
      
    }

    
    

