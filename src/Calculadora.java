

public class Calculadora {

    double somar(double a, double b) {
        return a + b;
    }

    double subtrair(double a, double b) {
        return a - b;
    }

    double multiplicar(double a, double b) {
        return a * b;
    }

    double dividir(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Calculadora calculo = new Calculadora();

        System.out.println("Soma: " + calculo.somar(10, 5));
        System.out.println("Subtração: " + calculo.subtrair(10, 5));
        System.out.println("Multiplicação: " + calculo.multiplicar(10, 5));
        System.out.println("Divisão: " + calculo.dividir(10, 5));
    }
}