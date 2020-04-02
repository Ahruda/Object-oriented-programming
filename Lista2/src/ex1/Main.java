package ex1;

public class Main {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Leonardo","Médico",'M',15000.50,19);
		Funcionario funcionario2 = new Funcionario("Tatiane","Enfermeira",'F',10000.25,24);
		
		funcionario1.mostrarFuncionario();
		funcionario2.mostrarFuncionario();
	}
	
}
