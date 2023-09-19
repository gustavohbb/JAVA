public class Lutador {
   private String nome;
   private String nacionalidade;
   private int idade;
   private float altura;
   private float peso;
   private String categoria;
   private int vitorias;
   private int derrotas;
   private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrota, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitoria);
        this.setDerrotas(derrota);
        this.setEmpates(empates);
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.peso < 52.2) {
            categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            categoria = "Leve";
        } else if (this.peso <= 83.9) {
            categoria = "Médio";
        } else if (this.peso <= 120.2) {
            categoria = "Pesado";
        } else {
            categoria = "Inválido";
        }
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float autura) {
        this.altura = autura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void apresentar() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
    }
    public void ganharLuta() {
        if (getCategoria().equals("Inválido")) {
            System.out.println("Não pode lutar");
        } else {
            setVitorias(this.getVitorias() + 1);
        }
    }
    public void perderLuta() {
        if (getCategoria().equals("Inválido")) {
            System.out.println("Não pode lutar");
        } else {
            setDerrotas(this.getDerrotas() + 1);
        }
    }
    public void empatarLuta() {
        if (getCategoria().equals("Inválido")) {
            System.out.println("Não pode lutar");
        } else {
            setEmpates(this.getEmpates() + 1);
        }
    }
    public void status() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }
}