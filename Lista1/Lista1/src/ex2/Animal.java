package ex2;

public class Animal {

	private String tipo;
	
	public Animal(int opcao) {
		switch (opcao){
			case 1:
				this.tipo = "Aqu�tico";
				break;
			case 2:
				this.tipo = "Terrestre";
				break;
			case 3:
				this.tipo = "A�reo";
				break;
			default:
				this.tipo = "Desconhecido";
				break;
		}
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
}
