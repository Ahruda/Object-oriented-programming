package pkt;

public class Contato {
	private String nome;
	private String email;
	private String telefone;

	public Contato(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public void mostrarInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("E-mail: " + email);
		System.out.println("Telefone: " + telefone);
	}
}
