package ex2;

public class Pizza {
	String nome;
	double valor;
	int numeroIngrediente;

	public Pizza() {

	}

	public Pizza(String nome, double valor, int numeroIngrediente) {
		this.nome = nome;
		this.valor = valor;
		this.numeroIngrediente = numeroIngrediente;
	}

	public void mostrarPizza() {
		System.out.println("Nome da pizza: " + nome);
		System.out.println("Valor: R$" + valor);
		System.out.println("Número dos ingredientes: " + numeroIngrediente);
		System.out.println("----------------------------------");
	}
}
