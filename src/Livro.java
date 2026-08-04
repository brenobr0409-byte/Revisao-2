// Ana Carolina

public class Livro {
    String titulo;
    String autor;
    String isbn;
    boolean disponivel;

    // Método para emprestar o livro
    void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro \"" + titulo + "\" emprestado com sucesso!");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está emprestado.");
        }
    }

    // Método para devolver o livro
    void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro \"" + titulo + "\" devolvido com sucesso!");
        } else {
            System.out.println("O livro \"" + titulo + "\" já se encontra disponível.");
        }
    }

    // Método para exibir o estado atual do livro
    void exibir() {
        System.out.println("--- Dados do Livro ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        System.out.println("----------------------");
    }

    // Método principal para testar o sistema
    public static void main(String[] args) {
        Livro meuLivro = new Livro();
        meuLivro.titulo = "Java para Iniciantes";
        meuLivro.autor = "Programador";
        meuLivro.isbn = "978-85-1234-567-8";
        meuLivro.disponivel = true; // Começa disponível

        // Exibindo o estado inicial
        meuLivro.exibir();

        // Tentando emprestar
        meuLivro.emprestar();

        // Tentando emprestar novamente para testar a validação
        meuLivro.emprestar();

        // Devolvendo o livro
        meuLivro.devolver();

        // Exibindo o estado final
        meuLivro.exibir();
    }
}