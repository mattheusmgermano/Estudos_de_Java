import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		//System.out.print("This is a line.");
		//System.out.println("This is also a line.");
		//System.out.print("The previous one broke the line! \n");
		//System.out.print("And so did you too!");
		var x = 32;
		var y = x * 2;
		var z = x * 3;
		System.out.println(x + " " + y + " " + z);
		
		var dx = 32.50f;
		var dy = dx * 2;
		var dz = dx * 3;
		
		System.out.println(dx + " " + dy + " " + dz);
		//%.[num]f determina o número de casas
		//%n ou \n determina quebra de linha
		Locale.setDefault(Locale.US);
		System.out.printf("This is a format type:" + "%.4f%n", dx*dz*(dy*2));
		System.out.printf("This is a format type:" + "%.2f%n", dx*dz*(dy*2));
		
		System.out.printf("Concatenação usando printf: %.2f%n", dx / 2.33f);
		
		String nome = "Johanes";
		int idade = 88;
		double renda = 8650.5006657f;
		System.out.printf("%s tem %d anos e possui renda estimada de %.2f reais%n.", nome, idade, renda);
	}

}
