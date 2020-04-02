package ex1;

public class Pessoa {
	
	private int idade;
	private String nome,cpf,sexo; //cpf como string para receber pontos e tracos
	
	public Pessoa() {} //construtor vazio
	
	//metodos SET
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;  
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//metodos GET
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public String getCpf() {
		return cpf;
	}
	public String getSexo() {
		return sexo;
	}
}













