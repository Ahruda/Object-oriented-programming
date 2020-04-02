package ex2;

public class Main {
	public static void main(String[] args) {
		Empresa empresa1 = new Empresa("Arruda eventos",5845);
		
		Departamento departamento1 = new Departamento("Marketing");
		Departamento departamento2 = new Departamento("Financas");
		
		Funcionario funcionario1 = new Funcionario("Leonardo","14/05/2019",1100);
		Funcionario funcionario2 = new Funcionario("Tatiane","24/07/2018",1500);
		Funcionario funcionario3 = new Funcionario("Ana","18/02/2017",2100);
		Funcionario funcionario4 = new Funcionario("Jose","20/04/2017",2100);
		
		empresa1.CriarDepartamento(departamento1);
		empresa1.CriarDepartamento(departamento2);
		
		departamento1.AddFuncionario(funcionario1);
		departamento1.AddFuncionario(funcionario2);		
		
		departamento2.AddFuncionario(funcionario3);
		departamento2.AddFuncionario(funcionario4);
		
		departamento2.AlterarSalarioDepartamento(1.1); //aumentou 10% do salarios desses funcionarios
		
		departamento1.RemoveFuncionario(funcionario1);
		departamento2.AddFuncionario(funcionario1);
	}
}
