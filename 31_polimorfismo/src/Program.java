import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
//		Polimorfismo é o recurso que permite que variáveis de um mesmo tipo
//		mais genérico possam apontar para objetos de tipos específicos dife
//		rentes, tendo assim comportamentos diferentes conforme cada tipo es
//		pecífico.

//		Exemplo:
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Janaina Ina", 1000.0, 0.01);
		
		x.withdraw(100);
		y.withdraw(100);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		
		
	}
}
