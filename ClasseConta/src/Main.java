import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         ContaBanco conta = new ContaBanco();
         System.out.println("Deseja abrir uma nova conta? S|N");
         String opicao = in.nextLine();
         if (opicao.equals("S")) {
             conta.abrirConta();
         } else if (opicao.equals("N")) {
             System.out.println("Okay");
         } else {
             System.out.println("Erro digite uma opção valída");
         }
         while (conta.isStatus()) {
             System.out.println("1-Depositar\n2-Sacar\n3-Mensalidade\n4-Informações\n5-Fechar conta");
             int opc = in.nextInt();
             switch (opc) {
                 case 1:
                     System.out.print("Digigite um valor a ser depositado");
                     float valor = in.nextFloat();
                     conta.depositar(valor);
                     break;
                 case 2:
                     System.out.print("Valor para saque");
                     float saque = in.nextFloat();
                     conta.sacar(saque);
                     break;
                 case 3:
                     System.out.println("   Mensalidade   ");
                     conta.pagarMensal();
                     break;
                 case 4:
                     conta.infomacoesConta();
                     break;
                 case 5:
                     System.out.println("Deseja fechar sua conta? S|N ");
                     String decisao = in.next();
                     if (decisao.equals("N")) {
                         break;
                     } else if (decisao.equals("S")) {
                         conta.fecharConta();
                         break;
                     } else {
                         System.out.println("Opção inválida");
                         break;
                     }
                 default:
                     System.out.println("ERRO");
                     break;
             }
         }
        }
    }
