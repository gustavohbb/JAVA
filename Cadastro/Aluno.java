public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    private float valor;

    public void pagarMensalidade() {
        System.out.printf("Mensalidade paga no valor de R$%s", this.getValor());
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
