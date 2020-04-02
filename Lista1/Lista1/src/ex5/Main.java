package ex5;

public class Main {
	public static void main(String[] args) {
		Conta conta1 = new Conta("Leonardo Arruda",500.00);
		Conta conta2 = new Conta("Fulano de tal",-500.00);
		
		System.out.printf("O titular da conta é %s, com um saldo de %.2f\n",conta1.getTitular(),conta1.getSaldo());
		System.out.printf("O titular da conta é %s, com um saldo de %.2f",conta2.getTitular(),conta2.getSaldo());
	}
}
