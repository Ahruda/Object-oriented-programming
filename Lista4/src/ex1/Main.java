package ex1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int numLados, i;
		double buffer;

		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o numero de lados do poligono: ");
		numLados = sc.nextInt();

		Poligono pol1 = new Poligono(numLados);

		for (i = 0; i < numLados; i++) {
			System.out.print("Valor lado " + (i + 1) + ": ");
			buffer = sc.nextDouble();
			pol1.setLados(i, buffer);
			buffer = 0.0;
		}
		sc.close();
		System.out.println("Valor do perimetro: " + pol1.perimetroPoligono());
	}
}
