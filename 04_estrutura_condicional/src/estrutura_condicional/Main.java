package estrutura_condicional;


public class Main {

	public static void main(String[] args) {
		var hora = 13;
		queHorasSao(hora);
		hora = 12;
		queHorasSao(hora);
		hora = 19;
		queHorasSao(hora);
		hora = 1;
		queHorasSao(hora);

	}

	private static void queHorasSao(int hora) {
		if(hora > 6 && hora <= 12) {
			System.out.println("Bom dia!");
		} else if(hora > 12 && hora <= 18) {
			System.out.println("Boa tarde!");
		} else if(hora > 18 && hora < 24) {
			System.out.println("Boa noite!");
		} else if(hora >= 0 && hora < 6) {
			System.out.println("Boa noite, ainda é madrugada.");
		}
	}

}
