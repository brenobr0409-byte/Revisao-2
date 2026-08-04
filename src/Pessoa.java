//Breno
  
public class Pessoa {
    String nome;
    int idade;
    double altura;

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.idade = 20;
        pessoa1.altura = 1.75;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";
        pessoa2.idade = 22;
        pessoa2.altura = 1.65;

        System.out.println("Pessoa 1:");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("Altura: " + pessoa1.altura);

        System.out.println("\nPessoa 2:");
        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade);
        System.out.println("Altura: " + pessoa2.altura);
    }
}