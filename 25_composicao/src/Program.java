import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Contratos;
import entities.Trabalhador;
import entities.enums.NivelTrabalhador;

public class Program {

	public static void main(String[] args) throws ParseException {
//		? um tipo de associa??o que permite que um objeto
//		contenha outro.
//		
//		Rela??o "tem-um" ou "tem-v?rios". 
//		
//		Vantagens: 
//			Organiza??o;
//			Coes?o;
//			Flexibilidade;
//			Reuso.
//		
//		Nota: embora o s?mbolo UML para composi??o (todo-parte) seja
//		o diamante preto, neste contexto estamos chamando de composi??o
//		qualquer associa??o tipo "T-1"/"T-++";

//		Ler os dados de um trabalhador com N contratos (N fornecido pelo
//		usu?rio). Depois, solicitar do usu?rio um m?s e mostrar qual foi
//		o sal?rio do funcion?rio nesse m?s.
		
		var sc = new Scanner(System.in);
		var sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Informe o nome do departamento: ");
		var nomeDepartamento = sc.nextLine();
		System.out.println("Digite os dados do trabalhador: ");
		System.out.println("Nome: ");
		var nomeTrabalhador = sc.nextLine();
		System.out.println("N?vel do trabalhador: ");
		var nivelTrabalhador = sc.nextLine();
		System.out.println("Sal?rio: ");
		var salarioTrabalhador = sc.nextDouble();
		
		var trabalhador = new Trabalhador(nomeTrabalhador,
				NivelTrabalhador.valueOf(nivelTrabalhador),
				salarioTrabalhador,
				nomeDepartamento);
		
		System.out.printf("Quantos contratos %s possui?%n", nomeTrabalhador);
		var n = sc.nextInt();
		for(var i = 0; i <= n; i++) {
			System.out.println("Digite as informa??s referentes ao contrato:");
			System.out.print("Data (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Informe o valor/hora: ");
			var valorHora = sc.nextDouble();
			System.out.print("Informe a dura??o: ");
			var horasDuracao = sc.nextInt();
			var novoContrato = new Contratos(dataContrato, valorHora, horasDuracao);
			trabalhador.adicionarContrato(novoContrato);
		}

		System.out.println("Informe o m?s e o ano para calcular os ganhos do trabalhador(MM/YYYY): ");
		var mesEAno = sc.next();
		var mes = Integer.parseInt(mesEAno.substring(0,1));
		var ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("Trabalhador: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento());
		System.out.println("Ganhos no per?odo de "+ mesEAno + ": " + 
							String.format("%.2f", trabalhador.ganhos(mes, ano)));
		
		
		
		sc.close();
		
	}

}
