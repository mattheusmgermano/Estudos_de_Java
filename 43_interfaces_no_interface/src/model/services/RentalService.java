package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	private Double pricePerDay;
	private Double pricePerHour;
	private BrazilTaxServices taxServices;
	
	public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxServices taxServices) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxServices = taxServices;
	}
	
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();  // pega o valor em milissegundos
		long t2 = carRental.getFinish().getTime();
		double hours = (double)(t2 - t1) / 1000 / 60 / 60;
		
		double basicPayment;
		
		if(hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		} else {
			basicPayment = Math.ceil(hours) * pricePerDay;
		}
		double tax = taxServices.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
		
	}
}
