package ex1;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.setNome("Leonardo Galbiere Arruda");
		pessoa1.setSexo("Masculino");
		pessoa1.setIdade(19);
		pessoa1.setCpf("999.888.777-66");
		
		pessoa2.setNome("Tatiane Galbiere Arruda");
		pessoa2.setSexo("Feminino");
		pessoa2.setIdade(24);
		pessoa2.setCpf("555.444.333-22");
		
		System.out.printf("Nome: %s,\n",pessoa1.getNome());
		System.out.printf("Sexo: %s,\n", pessoa1.getSexo());
		System.out.printf("Idade: %d anos,\n", pessoa1.getIdade());
		System.out.printf("CPF: %s.\n",pessoa1.getCpf());
		
		System.out.println("-------------------");
		
		System.out.printf("Nome: %s,\n",pessoa2.getNome());
		System.out.printf("Sexo: %s,\n", pessoa2.getSexo());
		System.out.printf("Idade: %d anos,\n", pessoa2.getIdade());
		System.out.printf("CPF: %s.\n",pessoa2.getCpf());

	}
}
