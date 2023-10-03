import java.util.Scanner;  // Importação da classe Scanner para entrada de dados

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // Criação de um objeto Scanner para entrada de dados
        Bolsista Bolsista;  // Declaração de uma variável Bolsista (não inicializada)
        Tecnico Tecnico;    // Declaração de uma variável Tecnico (não inicializada)
        boolean infoCorretas = false;  // Declaração de uma variável booleana para controlar o loop

        while (!infoCorretas) {  // Início de um loop que continuará até todas as informações estarem corretas
            System.out.println("Fazer matricula");  // Exibe uma mensagem
            System.out.println("--------------------");  // Exibe uma linha divisória
            System.out.println("Digite seu nome:");  // Solicita o nome do usuário
            String nome = in.next();  // Lê o nome fornecido pelo usuário
            System.out.println("Digite sua idade: ");  // Solicita a idade do usuário
            int idade = in.nextInt();  // Lê a idade fornecida pelo usuário
            System.out.print("Digite o sexo M||F: ");  // Solicita o sexo do usuário
            String sexo = in.next();  // Lê o sexo fornecido pelo usuário

            if (sexo.equals("M")) {  // Verifica se o sexo é "M"
                System.out.println("Correto");  // Exibe "Correto"
            } else if (sexo.equals("F")) {  // Verifica se o sexo é "F"
                System.out.println("Correto");  // Exibe "Correto"
            } else {
                System.out.println("ERRO entre com informações corretas");  // Se o sexo não for "M" ou "F", exibe uma mensagem de erro
                continue;  // Continua o loop para coletar informações corretas
            }

            String curso = "";  // Declaração de uma variável para armazenar o curso selecionado
            String opcaoBT = "";  // Declaração de uma variável para armazenar a opção Bolsista/Técnico

            do {
                System.out.println("Selecione o curso desejado:");  // Solicita a seleção de um curso
                System.out.println("1-Ingles R$230\n2-Espanhol R$210\n3-Desenvolvimento R$350");  // Exibe opções de cursos
                int opc = in.nextInt();  // Lê a opção selecionada pelo usuário
                curso = opcaoCurso(opc);  // Chama a função opcaoCurso para obter o nome do curso

                System.out.println("Bolsista ou Tecnico B|T");  // Solicita a seleção entre ser Bolsista ou Técnico
                opcaoBT = in.next();  // Lê a opção selecionada pelo usuário

                if (opcaoBT.equals("B")) {  // Se a opção for "B" (Bolsista)
                    System.out.print("Digite o valor da bolsa de 100|10: ");  // Solicita o valor da bolsa
                    int bolsa = in.nextInt();  // Lê o valor da bolsa
                    Bolsista = new Bolsista(nome, idade, sexo, curso, bolsa);  // Cria um objeto Bolsista com as informações fornecidas
                } else if (opcaoBT.equals("T")) {  // Se a opção for "T" (Técnico)
                    System.out.print("Digite seu registro profissional: ");  // Solicita o registro profissional
                    int registroProfissional = in.nextInt();  // Lê o registro profissional
                    Tecnico = new Tecnico(nome, idade, sexo, curso, registroProfissional);  // Cria um objeto Técnico com as informações fornecidas
                } else {
                    opcaoBT = " ";  // Se a opção não for "B" nem "T", define opcaoBT como uma string vazia
                    System.out.println("ERRO entre com informações corretas");  // Exibe uma mensagem de erro
                }
            } while (curso.equals(" ") || opcaoBT.equals(" "));  // Continua o loop se curso ou opcaoBT forem strings vazias

            infoCorretas = true;  // Define infoCorretas como true para sair do loop
            System.out.println("Parabens matricula realizada");  // Exibe uma mensagem de conclusão da matrícula
        }
    }

    public static String opcaoCurso(int opc) {
        String curso = "";  // Declaração de uma variável para armazenar o nome do curso

        switch (opc) {
            case 1:
                curso = "Ingles";  // Se a opção for 1, define curso como "Ingles"
                break;
            case 2:
                curso = "Espanhol";  // Se a opção for 2, define curso como "Espanhol"
                break;
            case 3:
                curso = "Desenvolvimento";  // Se a opção for 3, define curso como "Desenvolvimento"
                break;
            default:
                System.out.println("ERRO");  // Se a opção não for 1, 2 ou 3, exibe uma mensagem de erro
                curso = " ";  // Define curso como uma string vazia
                break;
        }

        return curso;  // Retorna o nome do curso
    }
}


