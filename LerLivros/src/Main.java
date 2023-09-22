// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pessoa[] p1 = new Pessoa[2];
        p1[0] = new Pessoa("Gustavo", 18, "M");
        Livro[] livros = new Livro[3];
        livros[0] = new Livro("Harry Potter 1", "J.K Rowling",
                232, p1[0]);
        livros[0].abrir();
        livros[0].voltarPagina();
        livros[0].folhear(45);
        livros[0].avancarPagina();
        livros[0].fechar();
        System.out.println(livros[0].detalhes());
    }
}