package ex2;

public class Departamento {
	private String nome;
	private Funcionario funcionarios[] = new Funcionario[100];

	public Departamento(String nome) {
		this.nome = nome;
	}
	
	public void AddFuncionario(Funcionario funcionario) {
		int i = 0;
		for(i=0;i<100;i++) {
			if(funcionarios[i] == null) {
				this.funcionarios[i] = funcionario;
			}
		}
	}
	
	public void RemoveFuncionario(Funcionario funcionario) {
		int i = 0;
		for(i=0;i<100;i++) {
			if(funcionarios[i] == funcionario) {
				this.funcionarios[i] = null;
			}
		}
	}
	
	public void AlterarSalarioDepartamento(double porcentagem) {
		int i = 0;
		for(i=0;i<100;i++) {
			if(funcionarios[i] != null) {
				this.funcionarios[i].AlterarSalario(porcentagem);
			}
		}
	}
	
}
