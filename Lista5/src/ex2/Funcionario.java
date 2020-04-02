package ex2;

public class Funcionario {
	private String nome;
	private String dataAdmissao;
	private double salario;
	
	public Funcionario(String nome, String dataAdmissao, double salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	
	public void AlterarSalario(double porcentagem) {
		this.salario = this.salario * porcentagem;
	}
}
