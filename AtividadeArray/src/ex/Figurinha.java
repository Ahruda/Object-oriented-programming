package ex;

public class Figurinha {

	int numero;
	int quantidade;
	
	Figurinha(){
		//construtor default
	}
	
	Figurinha(int numero, int quantidade){
		setNumero(numero);
		setQuantidade(quantidade);
	}
	
	void setNumero(int numero) {
		this.numero = numero;
	}
	void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	int getNumero() {
		return numero;
	}
	int getQuantidade() {
		return quantidade;
	}
	
	void exibirFigurinha() {
		System.out.println("Figurinha "+numero+".Quantidade: "+quantidade);
	}
}