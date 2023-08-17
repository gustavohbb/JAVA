package alunosporturma;

import java.util.Scanner;

public class AlunosPorTurma {
    public static void main(String[] args) {
          System.out.println("Digite o número de alunos: ");
          Scanner entrada = new Scanner(System.in); 
          int alunos = entrada.nextInt();
          int divisao = alunos / 3;  
          int resto = alunos % 3;
          int t1 = divisao;
          int t2 = divisao;
          int t3 = divisao + resto;
          System.out.println("Turma 1:"+ t1+ "\nTurma 2: "+ t2+ "\nTurma 3: "+ t3 );
    }
    }

