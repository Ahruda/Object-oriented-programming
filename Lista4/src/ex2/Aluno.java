package ex2;

public class Aluno {
	String nome;
	int idade, turma, raAluno;

	public Aluno(String nome, int idade, int turma, int raAluno) {
		this.nome = nome;
		this.idade = idade;
		this.turma = turma;
		this.raAluno = raAluno;
	}

	public void ExibirAluno() {
		System.out.println("Aluno " + raAluno + ": " + nome + " | Idade: " + idade + " anos | Turma: " + turma);
	}
}
