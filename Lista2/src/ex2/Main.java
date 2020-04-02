package ex2;

public class Main {
	public static void main(String[] args) {
		Pizza pizza1 = new Pizza("AMERICANA", 35.50, 1425);
		Pizza pizza2 = new Pizza("TRADICIONAL", 37.90, 5842);
		Pizza pizza3 = new Pizza("CALABRESA", 42.30, 1845);
		
		pizza1.mostrarPizza();
		pizza2.mostrarPizza();
		pizza3.mostrarPizza();
	}
}
