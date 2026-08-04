// Ana Carolina

import java.util.Scanner;

public class Retangulo {
	double base;
	double altura;
	
	
	double calcularArea() {
		return base * altura;
	}
	
	double calcularPerimetro() {
		return 2 * (base + altura);
	}
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		Retangulo r = new Retangulo();
		
		System.out.println("--- Calculadora de Retângulo ---");
		
		System.out.print("Digite o valor da base: ");
		r.base = scanner.nextDouble();
		
		System.out.print("Digite o valor da altura: ");
		r.altura = scanner.nextDouble();
		
		System.out.println("\n--- Resultados ---");
		System.out.println("Base informada: " + r.base);
		System.out.println("Altura informada: " + r.altura);
		System.out.println("Area: " + r.calcularArea());
		System.out.println("Perimetro" + r.calcularPerimetro());
	}
}
