import java.util.Scanner;

public class MaisExercicios {

    public static void main(String[] args) {
        questao14();
//        questao13();
//        questao12();
//        inferiorSuperior();
//        arrecadadoMultas();
//        pessoasMedias();
//        mediaDosAlunos();
//        zeEChico();
//        aoQuadradoCubo();
//        nomeQuantidade();
//        mediaPonderada();
    }

    public static void mediaPonderada() {
        Scanner in = new Scanner(System.in);
        int pesos, quantidadeNotas;
        float notas, mediap = 0, multiNotas = 0;
        System.out.println("Digite a quantidade de provas feitas");
        quantidadeNotas = in.nextInt();
        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.printf("O peso da %sº prova é ", i);
            pesos = in.nextInt();
            System.out.print("A nota dessa avaliação ");
            notas = in.nextFloat();
            multiNotas += pesos * notas;
            mediap += pesos;
        }
        mediap = multiNotas / mediap;
        System.out.println("A média das provas é " + mediap);
    }

    public static void nomeQuantidade() {
        Scanner in = new Scanner(System.in);
        String nomes = "";
        int opc, cont = 0;
        do {
            nomes += in.next() + " ";
            System.out.println("DESEJA PARAR SIM 0 NÂO 1 ");
            opc = in.nextInt();
            cont++;
        } while (opc != 0);
        System.out.println(nomes);
        System.out.println("Nomes inseridos " + cont);
    }

    public static void restoDaDivisao() {
        Scanner in = new Scanner(System.in);
        int n;
        int resto;
        for (; ; ) {
            System.out.println("Insira o número");
            n = in.nextInt();
            if (n == 0) {
                break;
            }
            resto = n % 4;
            System.out.println("Resto: " + resto);
        }
    }

    public static void aoQuadradoCubo() {
        Scanner in = new Scanner(System.in);
        int numero, quadrado, cubo;
        numero = in.nextInt();
        for (int i = 1; i <= numero; i++) {
            quadrado = i * i;
            cubo = i * i * i;
            System.out.printf("%s %s %s\n", i, quadrado, cubo);
        }
    }

    public static void zeEChico() {
        float ze = 1.10f, chico = 1.50f;
        int anos = 0;
        while (ze <= chico) {
            ze += 0.03f;
            chico += 0.02f;
            anos++;
        }
        System.out.printf("Zé após %s anos ficou com %s metros e chico %s metros", anos, ze, chico);
    }

    public static void mediaDosAlunos() {
        Scanner in = new Scanner(System.in);
        int quantidadeDeAlunos = 0, codigoAluno;
        float mediaAluno, mediaDaTurma = 0, nta1, nta2, nta3;
        System.out.println("Digite o código do aluno (0 para encerar)");
        codigoAluno = in.nextInt();
        while (codigoAluno != 0) {
            System.out.println("Primeira nota do aluno " + codigoAluno);
            nta1 = in.nextFloat();
            System.out.println("Segunda nota do aluno " + codigoAluno);
            nta2 = in.nextFloat();
            System.out.println("Terceira nota do aluno " + codigoAluno);
            nta3 = in.nextFloat();
            mediaAluno = (nta1 + nta2 + nta3) / 3;
            System.out.println("A média do aluno é: " + mediaAluno);
            mediaDaTurma += mediaAluno;
            quantidadeDeAlunos++;
            System.out.println("Digite o código do aluno (0 para encerar)");
            codigoAluno = in.nextInt();
        }
        mediaDaTurma = mediaDaTurma / quantidadeDeAlunos;
        System.out.println("Média da turma: " + mediaDaTurma);
    }

    public static void pessoasMedias() {
        Scanner in = new Scanner(System.in);
        int idade, qtdPessoas50 = 0, qtdPessoasAltura = 0, qtdPessoasPeso = 0, porcentagem40Kilos;
        float altura, mediaAltura = 0, peso;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Escreva idade, altura e peso dad pessoas");
            idade = in.nextInt();
            altura = in.nextFloat();
            peso = in.nextFloat();
            if (idade > 50) {
                qtdPessoas50 += 1;
            }
            if (idade >= 10 && idade <= 20) {
                mediaAltura += altura;
                qtdPessoasAltura += 1;
            }
            if (peso < 40) {
                qtdPessoasPeso += 1;
            }
            if (idade <= 0 || altura < 1.00 || peso < 15) {
                System.out.println("ERRO");
                break;
            }
        }
        System.out.println("Quantidade de pessoas com mais de 50 anos " + qtdPessoas50);
        mediaAltura /= qtdPessoasAltura;
        System.out.println("A média de altura de pessoas entre 10 e 20 anos é " + mediaAltura);
        porcentagem40Kilos = qtdPessoasPeso * 10;
        System.out.printf("Porcentagem de pessoas com menos de 40 quilos %s ", porcentagem40Kilos);
    }

    public static void arrecadadoMultas() {
        Scanner in = new Scanner(System.in);
        int codigoCarteira, numeroDeMultas, maiorArrecadador = 0;
        float valorMulta, totalArrecadado = 0, maiorValor = Float.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o código da carteira 4 digitos: ");
            codigoCarteira = in.nextInt();
            System.out.println("Digite o número de multas: ");
            numeroDeMultas = in.nextInt();
            System.out.println("Digite o valor da multa: ");
            valorMulta = in.nextFloat();
            valorMulta = numeroDeMultas * valorMulta;
            if (valorMulta > maiorValor) {
                maiorValor = valorMulta;
                maiorArrecadador = codigoCarteira;
            }
            totalArrecadado += valorMulta;
        }
        System.out.println("Total arrecadado: " + totalArrecadado);
        System.out.println("Maior arrecadador: " + maiorArrecadador + " Valor: " + maiorValor);
    }

    public static void inferiorSuperior() {
        Scanner in = new Scanner(System.in);
        String pares = "";
        int inferior, superior, soma = 0;
        System.out.println("Digite um valor minimo e um maximo");
        inferior = in.nextInt();
        superior = in.nextInt();
        for (; inferior <= superior; inferior++) {
            if (inferior % 2 == 0) {
                pares += inferior + " ";
            }
            soma += inferior;
        }
        System.out.println("Os pares até o número informado é " + pares);
        System.out.println("E a soma dos números é " + soma);
    }

    public static void questao12() {
        Scanner in = new Scanner(System.in);
        int n;
        int produtoPares = 1, somatorioImpares = 0;
        int qtdPares = 0, qtdImpares = 0;
        for (; ; ) {
            n = in.nextInt();
            if (n < 0) {
                System.out.println("Número invalido digite outro");
                continue;
            } else if (n == 0) {
                break;
            } else if (n % 2 == 0) {
                produtoPares *= n;
                qtdPares++;
            } else {
                somatorioImpares += n;
                qtdImpares++;
            }
        }
        System.out.printf("Produto Pares: %s | Quantidade de números pares: %s\n", produtoPares, qtdPares);
        System.out.printf("Somatorio Impares: %s | Quantidade de números impares: %s1", somatorioImpares, qtdImpares);
    }

    public static void questao13() {
        Scanner in = new Scanner(System.in);
        String sexo;
        float salario, mediaSalarioHomens = 0, mediaSalrioMulheres = 0, mediaTotal = 0;
        int idade, homemMaisVelho = Integer.MIN_VALUE, mulherMaisNova = Integer.MAX_VALUE;
        int qtdHomens = 0, qtdMulheres = 0, qtdTotal = 0;
        for (; ; ) {
            sexo = in.next();
            if (sexo.equals("F") || sexo.equals("M")) {
                idade = in.nextInt();
                if (idade == 0) {
                    break;
                }
                salario = in.nextFloat();
                if (sexo.equals("M")) {
                    mediaSalarioHomens += salario;
                    qtdHomens++;
                    if (idade > homemMaisVelho) {
                        homemMaisVelho = idade;
                    }
                } else {
                    mediaSalrioMulheres += salario;
                    qtdMulheres++;
                    if (idade < mulherMaisNova) {
                        mulherMaisNova = idade;
                    }
                }
                mediaTotal += salario;
                qtdTotal++;
            } else {
                System.out.println("SEXO INVALIDO");
                continue;
            }
        }
        mediaSalarioHomens = mediaSalarioHomens / qtdHomens;
        mediaSalrioMulheres = mediaSalrioMulheres / qtdMulheres;
        mediaTotal = mediaTotal / qtdTotal;
        System.out.printf("Média salario homens: %s | Média salario mulheres: %s\n", mediaSalarioHomens, mediaSalrioMulheres);
        System.out.printf("Média salario total: %s\n", mediaTotal);
        System.out.printf("Homen mais velho: %s | Mulher mais nova: %S", homemMaisVelho, mulherMaisNova);
    }

    public static void questao14() {
        Scanner in = new Scanner(System.in);
        int votosJoao = 0, votosMaria = 0, votosPedro = 0, votosMarcos = 0;
        int votosNulo = 0, votosEmBranco = 0, codigoVoto;
        boolean controle = true;
        while (controle) {
            System.out.println("Digite o código");
            System.out.println("1- João\n" +
                    "\n" +
                    "2- Maria\n" +
                    "\n" +
                    "3- Pedro\n" +
                    "\n" +
                    "4- Marcos\n" +
                    "\n" +
                    "5- Nulo\n" +
                    "\n" +
                    "6- Em branco");
            codigoVoto = in.nextInt();
            switch (codigoVoto) {
                case 1:
                    votosJoao++;
                    break;
                case 2:
                    votosMaria++;
                    break;
                case 3:
                    votosPedro++;
                    break;
                case 4:
                    votosMarcos++;
                    break;
                case 5:
                    votosNulo++;
                    break;
                case 6:
                    votosEmBranco++;
                    break;
                default:
                    System.out.println("Código inválido");
                    controle = false;
                    break;
            }
        }
        System.out.println("João: " + votosJoao);
        System.out.println("Maria: " + votosMaria);
        System.out.println("Pedro: " + votosPedro);
        System.out.println("Marcos: " + votosMarcos);
        System.out.println("Nulos: " + votosNulo);
        System.out.println("Branco: " + votosEmBranco);
    }
}