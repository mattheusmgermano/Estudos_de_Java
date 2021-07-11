import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
//		Polimorfismo � o recurso que permite que vari�veis de um mesmo tipo
//		mais gen�rico possam apontar para objetos de tipos espec�ficos dife
//		rentes, tendo assim comportamentos diferentes conforme cada tipo es
//		pec�fico.

//		Exemplo:
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Janaina Ina", 1000.0, 0.01);
		
		x.withdraw(100);
		y.withdraw(100);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		
		
	}
}
