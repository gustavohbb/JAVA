/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios_java;

/**
 *
 * @author gustavo_borba3
 */
public class Vetores {

    public static void main(String[] args) {
         String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
         int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int c =0; c<mes.length; c++){
            System.out.println(mes[c]+ " "+ tot[c]+ " dias");
        } 
    }
}
