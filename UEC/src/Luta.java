import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }

    public void lutar() {
        Random gerador = new Random();
        if (this.isAprovada()) {
            this.desafiado.apresentar();
            System.out.println("====================");
            this.desafiante.apresentar();
            int vencedor = gerador.nextInt(3);
            this.setRounds(gerador.nextInt(1, 13));
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    System.out.printf("Em %s rounds", this.getRounds());
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.printf("Desafiante %s ganhou!", this.getDesafiante().getNome());
                    System.out.printf("Em %s rounds", this.getRounds());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.printf("Desafiado %s ganhou!", this.getDesafiado().getNome());
                    System.out.printf("Em %s rounds", this.getRounds());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
}
