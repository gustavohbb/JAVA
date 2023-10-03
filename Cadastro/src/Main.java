import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean infoCorretas = false;
        while (!infoCorretas) {
            System.out.println("Fazer matricula");
            System.out.println("--------------------");
            System.out.println("Digite seu nome:");
            String nome = in.next();
            System.out.println("Digite sua idade: ");
            int idade = in.nextInt();
            System.out.print("Digite o sexo M||F: ");
            String sexo = in.next();
            if (sexo.equals("M")) {
                System.out.println("Correto");
            } else if (sexo.equals("F")) {
                System.out.println("Correto");
            } else {
                System.out.println("ERRO entre com informações corretas");
                continue;
            }
            System.out.println("Tem direito a bolsa S|");
            System.out.println("Selecione o curso desejado:");
            System.out.println("1-Ingles R$230\n2-Espanhol R$210\n3-Desenvolvimento R$350");
            int opc = in.nextInt();
            int valor;
            
        }
    }
}
