package ex2;

public class Empresa {
	String nome;
	int cnpj;
	Departamento departamentos[] = new Departamento[10];
	
	public Empresa(String nome, int cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public void CriarDepartamento(Departamento departamento) {
		int i = 0;
		for(i=0;i<10;i++) {
			if(departamentos[i] == null) {
				this.departamentos[i] = departamento;
			}
		}
	}
}
