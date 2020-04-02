package ex2;

public class Disciplina {
	Aluno alunos[] = new Aluno[40];
	String nomeDisciplina;

	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int AddAluno(Aluno aluno) {
		int k = 0;

		if (k < 40) {
			while (alunos[k] != null) {
				k++;
			}
		} else {
			System.out.print("A turma já está completa");
			return 1;
		}

		alunos[k] = aluno;
		System.out.println("Aluno cadastrado na posicao " + k);
		return 0;
	}

	public int RemoveAluno(Aluno aluno) {
		int i;
		for (i = 0; i < 40; i++) {
			if (alunos[i] == aluno) {
				alunos[i] = null;
				System.out.println("Aluno na posicao " + i + " removido");
				return 0;
			}
		}
		System.out.println("Aluno nao estao cadastrado nessa disciplina");
		return 1;
	}

	public void getNumAlunos() {
		int i, contador = 0;

		for (i = 0; i < 40; i++) {
			if (alunos[i] != null) {
				contador++;
			}
		}
		System.out.println("Numero de alunos cadastrados:" + contador);
	}

	public void MostrarAlunos() {
		int i;
		for (i = 0; i < 40; i++) {
			if (alunos[i] != null) {
				alunos[i].ExibirAluno();
			}
		}
	}

}
