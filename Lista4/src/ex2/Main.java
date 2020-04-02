package ex2;

public class Main {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Leonardo", 19, 5, 0001);
		Aluno aluno2 = new Aluno("Rodolfo", 21, 6, 0002);
		Aluno aluno3 = new Aluno("Carlos", 22, 4, 0003);
		Aluno aluno4 = new Aluno("Gabriel", 25, 3, 0004);

		Disciplina disciplina1 = new Disciplina("Ciencias");
		Disciplina disciplina2 = new Disciplina("Matematica");

		aluno1.ExibirAluno();
		disciplina1.AddAluno(aluno1);
		disciplina1.AddAluno(aluno2);
		disciplina1.AddAluno(aluno3);
		disciplina1.getNumAlunos();
		disciplina1.MostrarAlunos();
		disciplina1.RemoveAluno(aluno2);
		disciplina1.getNumAlunos();
		disciplina1.MostrarAlunos();

		disciplina2.AddAluno(aluno4);
		disciplina2.getNumAlunos();
		disciplina2.MostrarAlunos();
	}
}
