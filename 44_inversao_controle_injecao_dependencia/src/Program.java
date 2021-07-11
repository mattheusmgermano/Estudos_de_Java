import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxServices;
import model.services.RentalService;

public class Program {
	
//	Invers�o de controle:
//		Padr�o de desenvolvimento que consiste em retirar da classe a responsabilidade
//		de instanciar suas depend�ncias.
//		
//	Inje��o de depend�ncia:
//		� uma forma de realizar a invers�o de controle: um componente externo instancia
//		a depend�ncia, que � ent�o injetada no objeto "pai". Pode ser implementada de
//		v�rias formas:
//			Construtor
//			Classe de instancia��o (builder/factory)
//			Container/framework
	
	
	
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
