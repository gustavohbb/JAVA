public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotalPaginas(totalPaginas);
        this.setAberto(false);
        this.setPaginaAtual(0);
        this.setLeitor(leitor);
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" +
                "titulo " + this.getTitulo() +
                ", autor " + this.getAutor() +
                ", totalPaginas " + this.getTotalPaginas() +
                ", paginaAtual " + this.getPaginaAtual() +
                ", aberto " + this.isAberto() +
                ", leitor " + leitor.getNome() +
                " de " + leitor.getIdade() + " anos" +
                '}';
    }

    @Override
    public void abrir() {
        this.setAberto(true);
        this.setPaginaAtual(1);
    }

    @Override
    public void fechar() {
        if (this.isAberto()) {
            this.setAberto(false);
            this.setPaginaAtual(0);
        }
    }

    @Override
    public void folhear(int pagina) {
        if (this.isAberto()) {
            if (pagina <= this.getTotalPaginas()) {
                this.setPaginaAtual(pagina);
            }
        }
    }

    @Override
    public void avancarPagina() {
        if (this.isAberto()) {
            if (this.getPaginaAtual() < this.getTotalPaginas()) {
                this.setPaginaAtual(getPaginaAtual() + 1);
            } else {
                System.out.println("Ultima pagina");
            }
        }
    }

    @Override
    public void voltarPagina() {
        if (this.isAberto()) {
            if (this.getPaginaAtual() > 1) {
                this.setPaginaAtual(getPaginaAtual() - 1);
            } else {
                System.out.println("Primeira pagina");
            }
        }
    }
}
