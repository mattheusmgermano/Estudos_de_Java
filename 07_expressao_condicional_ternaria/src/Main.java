import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//(condition) ? if_true : if_false
		//          [if]      [else]
		
		Scanner sc = new Scanner(System.in);
		var numQualquer = sc.nextInt();
		String resultado = (numQualquer > 2) ? "Maria" : "João";
		System.out.println(resultado);
		
		sc.close();
	}

}
