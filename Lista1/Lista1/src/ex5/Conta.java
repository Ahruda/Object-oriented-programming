package ex5;

public class Conta {
	String titular;
	double saldo;
	
	public Conta(String titular,double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	
}
