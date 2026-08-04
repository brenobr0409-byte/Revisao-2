//Breno

public class Carro {

    String modelo;
    String marca;
    int ano;

    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.modelo = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 2022;

        carro1.exibirInformacoes();
    }
}