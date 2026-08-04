// Ana Carolina

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    // Método para aumentar o salário com base em um percentual (ex: 10 para 10%)
    void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100.0);
    }

    // Método para exibir os dados atualizados
    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.printf("Salário: R$ %.2f\n", salario);
    }

    // Método principal para testar o funcionamento
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.nome = "Ana Bomfim";
        f.cargo = "Desenvolvedor Júnior";
        f.salario = 3000.0;

        System.out.println("--- Dados Iniciais ---");
        f.exibirDados();

        // Aplicando um aumento de 10%
        f.aumentarSalario(10.0);

        System.out.println("\n--- Dados Após o Aumento ---");
        f.exibirDados();
    }
}