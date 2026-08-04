//Breno

public class Aluno {

    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void verificarSituacao() {
        double media = calcularMedia();

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.nome = "João";
        aluno1.nota1 = 8;
        aluno1.nota2 = 6;

        System.out.println("Aluno: " + aluno1.nome);
        System.out.println("Média: " + aluno1.calcularMedia());

        aluno1.verificarSituacao();
    }
}
