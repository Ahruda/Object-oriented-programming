package ex1;

public class Funcionario {
	String nome;
	String cargo;
	char sexo;
	double salario;
	int idade;

	public Funcionario() { // construtor padrão

	}

	public Funcionario(String nome, String cargo, char sexo, double salario, int idade) {
		this.nome = nome;
		this.cargo = cargo;
		this.sexo = sexo;
		this.salario = salario;
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCargo() {
		return this.cargo;
	}

	public char getSexo() {
		return this.sexo;
	}

	public double getSalario() {
		return this.salario;
	}

	public int getIdade() {
		return this.idade;
	}

	public void mostrarFuncionario() {
		System.out.println("Funcionario:");
		System.out.println("NOME: " + getNome());
		System.out.println("CARGO: " + getCargo());
		System.out.println("SEXO: " + getSexo());
		System.out.println("SALARIO: " + getSalario());
		System.out.println("IDADE: " + getIdade());
		System.out.println("------------------------------------");
	}

}
