import java.util.Random;

public class Bolsista extends Aluno {
    private int bolsa;

    public void renovarBolsa() {
        System.out.print("Bolsa Renovada");
    }

    public Bolsista(String nome, int idade, String sexo, String curso, int bolsa) {
        this.setBolsa(bolsa);
        Random matri = new Random();
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setMatricula(matri.nextInt(100000, 200000));
        this.setCurso(curso);
        if (getCurso().equals("Ingles")) {
            this.setValor(230f);
        } else if (getCurso().equals("Espanhol")) {
            this.setValor(210f);
        } else {
            this.setValor(350f);
        }
        setBolsa(bolsa);
    }

    @Override
    public void pagarMensalidade() {
        float valorDesconto = (this.getValor() / 100) * this.getBolsa();
        System.out.printf("Mensalidade paga no valor de %s", valorDesconto);
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
