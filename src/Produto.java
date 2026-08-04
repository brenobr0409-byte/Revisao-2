//Breno

public class Produto {

    String nome;
    double preco;
    int estoque;

    void adicionarEstoque(int quantidade) {
        estoque = estoque + quantidade;
    }

    void removerEstoque(int quantidade) {
        estoque = estoque - quantidade;
    }

    double calcularValorTotal() {
        return preco * estoque;
    }

    public static void main(String[] args) {

        Produto produto1 = new Produto();

        produto1.nome = "Teclado";
        produto1.preco = 50.00;
        produto1.estoque = 10;

        produto1.adicionarEstoque(5);
        produto1.removerEstoque(2);

        System.out.println("Produto: " + produto1.nome);
        System.out.println("Preço: R$ " + produto1.preco);
        System.out.println("Estoque: " + produto1.estoque);
        System.out.println("Valor total em estoque: R$ "
                + produto1.calcularValorTotal());
    }
}