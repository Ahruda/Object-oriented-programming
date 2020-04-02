package ex1;

public class Poligono {
	double lados[];

	public Poligono(int Numlados) {
		this.lados = new double[Numlados];
	}

	public void setLados(int i, double tamanhoLado) {
		this.lados[i] = tamanhoLado;
	}

	public double perimetroPoligono() {
		int k = 0;
		double perimetro = 0.0;

		while (k < lados.length) {
			perimetro += lados[k];
			k++;
		}
		return perimetro;
	}

}
