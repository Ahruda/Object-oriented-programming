package ex6;

public class Cruzadinha {
	String palavra1 = "CLASSE";
	String palavra2 = "STRING";
	String palavra3 = "ATRIBUTOS";
	String palavra4 = "NEW";
	
	public Cruzadinha(){
		
	}
	
	public String getPalavra(int palavra) {
		if(palavra == 1) {
			return palavra1;
		}else if(palavra == 2) {
			return palavra2;
		}else if(palavra == 3) {
			return palavra3;
		}else if(palavra == 4) {
			return palavra4;
		}else {
			return "Invalido, informe numero de 1 a 4";
		}
	}
}