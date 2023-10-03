import java.util.Random;
public class Tecnico extends Aluno {
    private int registroProficional;

    public Tecnico(String nome, int idade, String sexo, String curso, int registroProficional) {
        Random matri = new Random();
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setMatricula(matri.nextInt(100000, 200000));
        this.setCurso(curso);
        if (getCurso().equals("Ingles")) {
            this.setValor(230f);
        } else if(getCurso().equals("Espanhol")){
            this.setValor(210f);
        } else {
            this.setValor(350f);
        }
        this.setRegistroProficional(registroProficional);
    }

    public int getRegistroProficional() {
        return registroProficional;
    }

    public void setRegistroProficional(int registroProficional) {
        this.registroProficional = registroProficional;
    }
}
