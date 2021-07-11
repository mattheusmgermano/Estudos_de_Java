
public class Main {

	public static void main(String[] args) {
		//Formatar: toLowerCase(), toUpperCase(),trim()
		//Recortar: substring(inicio), substring(inicio,fim)
		//Substituir: Replace(char, char), Replace(string,string)
		//Buscar: IndexOf(), LastIndexOf()
		//Dividir: str.Split(" ")
		
		String original = "abcde FGHIJ ABC abc DEFG     ";
		
		var s01 = original.toLowerCase();
		var s02 = original.toUpperCase();
		var s03 = original.trim();
		var s04 = original.substring(2);
		var s05 = original.substring(0, 15);
		var s06 = original.replace('a', 'x');
		var s07 = original.replace("ABC abc DEFG", "KLMN opqrs TUVXYZ");
		var s08 = original.indexOf("bc");
		var s09 = original.lastIndexOf("FG");
		var s10 = original.split(" ");
		
		
		System.out.println("Original: " + original);		
		System.out.println("toLowerCase():" + s01);
		System.out.println("toUpperCase():" + s02);
		System.out.println("trim():" + s03 + "-");
		System.out.println("substring(índice):" + s04);
		System.out.println("substring(índice x até o índice y) :" + s05);
		System.out.println("replace(a minúsculo por x minúsculo) :" + s06);
		System.out.println("replace(uma parte da string por outra) :" + s07);
		System.out.println(
				"indexOf(onde tal string/char aparece 1º) :" + s08);
		System.out.println(
				"indexOf(onde tal string/char aparece por último) :" + s09);
		System.out.println("str.Split(caractere separador):");
		System.out.println("1º vetor: " + s10[0]);
		System.out.println("2º vetor: " + s10[1]);
		System.out.println("3º vetor: " + s10[2]);
		System.out.println("4º vetor: " + s10[3]);
		System.out.println("5º vetor: " + s10[4]);
		
		
		
		
		
		

	}

}
