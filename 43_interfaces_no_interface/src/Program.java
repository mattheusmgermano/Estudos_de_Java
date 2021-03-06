import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxServices;
import model.services.RentalService;

public class Program {

//	A partir do Java 8, interfaces podem ter "default methods" ou "defender methods".
//	
//	Isso possui implica??es conceituais e pr?ticas.
//	
//	A interface ? um tipo que define um conjunto de opera??es que uma classe deve implementar.
//	
//	A interface estabelece um contrato que a classe deve cumprir.
//	
//	Pra qu? interfaces?
//			
//		Para criar sistemas com baixo acoplamentos e flex?vel.
//		
//	Uma locadora brasileira de carros cobra um valor por hora para loca??es de at?
//	12 horas. Por?m, se a dura??o de loca??o ultrapassar 12 horas, a loca??o ser?
//	cobrada com base em um valor di?rio. Al?m do valor da loca??o, ? acrescido no
//	pre?o valor do imposto conforme regra do pa?s que, neste caso, ? 20% para val
//	ores at? R$ 100,00 ou 15% para valores acima de R$ 100,00. Fazer um programa 
//	que l? os dados da loca??o (modelo do carro, instante inicial e final da lo-
//	ca??o), bem como o valor por hora e o valor di?rio de loca??o. O programa 
//	deve ent?o gerar a nota de pagamento (contendo valor da loca??o, valor do 
//	imposto e valor total do pagamento) e informar os dados na tela.
	
	public static void main (String[] args) throws ParseException{
		Locale.setDefault(Locale.US);
		
		var sc = new Scanner(System.in);
		
		var sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Enter rental data:");
		System.out.println("Car model: ");
		var carModel = sc.nextLine();
		System.out.println("Pick-up date (dd/mm/yyyy hh:ss):");
		var start = sdf.parse(sc.nextLine());
		System.out.println("Return date (dd/mm/yyyy hh:ss");
		var finish = sdf.parse(sc.nextLine());
		
		var cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.println("Enter the price per hour: ");
		var pricePerHour = sc.nextDouble();
		System.out.println("Enter the price per day: ");
		var pricePerDay = sc.nextDouble();
		
		var rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxServices());
		
		rentalService.processInvoice(cr);
		
		System.out.println("Invoice: ");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		sc.close();
		
		
	}
}
