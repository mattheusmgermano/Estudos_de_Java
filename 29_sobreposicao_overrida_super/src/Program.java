import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
//		Sobreposição ou sobrescrita
//			É a implementação de um método de uma superclasse na subclasse.
//			
//			É fortemente recomendável utilizar a anotação @override em um
//			método sobrescrito.
//				Facilita leitura e compreensão do código;
//				Avisamos ao compilador(boa prática).
//		
//		Exemplo:
//			Suponha que a operação de saque possui uma taxa no valor de 5.0.
//			No entanto, se a conta for do tipo poupança ela não deverá ser
//			cobrada.
//			
//			Como resolver isso?
//					
//			Sobrescrevendo o método withdraw na classe SavingsAccount.
		
		Account account1 = new Account(1001, "Alex", 1000.0);
		account1.withdraw(200.0);
		System.out.println(account1.getBalance());
		
		SavingsAccount account2 = new SavingsAccount(1002, "Bora Mussa", 1200.0, 2.0);
		account2.withdraw(750.0);
		System.out.println(account2.getBalance());
		
//		Palavra Super:
//			É possível chamar a implementação da superclasse usando a palavra super.
//			
//			Exemplo: suponha que, na classe BusinessAccount, a regra para saque seja
//			realizar o saque normalmente da superclasse descontar mais 2.0;
		
		Account account3 = new BusinessAccount (1003, "Gabriela", 3500.0, 500.0);
		account3.withdraw(500.0);
		System.out.println(account3.getBalance());
		

	}

}
