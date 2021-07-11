import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.entities.Reservation_2nd;
import model.entities.Reservation_3rd;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args){
		var sc = new Scanner(System.in);
		var sdf = new SimpleDateFormat("dd/MM/yyyy");

		// 1st Solution: REALLY SMELLY SOLUTION

//		reallySmellySolution(sc, sdf);

		// 2nd Solution: SMELLY SOLUTION

//		smellySolution(sc, sdf);

//		3rd Solution: NOICE SOLUTION

		try {
			System.out.println("Room number:");
			var rn = sc.nextInt();
			System.out.println("Now enter the check-in date (dd/MM/yyyy): ");
			var in = sdf.parse(sc.next());
			System.out.println("Now inform the check-out date (dd/MM/yyyy): ");
			var out = sdf.parse(sc.next());

			var reservation = new Reservation_3rd(rn, in, out);
			
			System.out.println("Reservation: " + reservation);

			System.out.println("");
			System.out.println("Enter data to update the reservation: ");
			in = sdf.parse(sc.next());
			System.out.println("Now inform the check-out date (dd/MM/yyyy): ");
			out = sdf.parse(sc.next());
			reservation.updateDates(in, out);
		} 
		catch (ParseException e) {
			System.out.println("Invalid date format.");
		} 
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		

		sc.close();

	}

	public static void smellySolution(Scanner sc, SimpleDateFormat sdf) throws ParseException {
		System.out.println("Room number:");
		var rn = sc.nextInt();
		System.out.println("Now enter the check-in date (dd/MM/yyyy): ");
		var in = sdf.parse(sc.next());
		System.out.println("Now inform the check-out date (dd/MM/yyyy): ");
		var out = sdf.parse(sc.next());

		if (!out.after(in)) {
			System.out.println("Reservation failed: check-out must be after check-in. Are you NUTS?");
		} else {
			var reservation = new Reservation_2nd(rn, in, out);
			System.out.println("Reservation: " + reservation);

			System.out.println("");
			System.out.println("Enter data to update the reservation: ");
			in = sdf.parse(sc.next());
			System.out.println("Now inform the check-out date (dd/MM/yyyy): ");
			out = sdf.parse(sc.next());
			String error = reservation.updateDates(in, out);
			if (error != null) {
				System.out.println("Error ir reservation!");
			}
		}
	}

	public static void reallySmellySolution(Scanner sc, SimpleDateFormat sdf) throws ParseException {
		System.out.println("Room number:");
		var rn = sc.nextInt();
		System.out.println("Now enter the check-in date (dd/MM/yyyy): ");
		var in = sdf.parse(sc.next());
		System.out.println("Now inform the check-out date (dd/MM/yyyy): ");
		var out = sdf.parse(sc.next());

		if (!out.after(in)) {
			System.out.println("Reservation failed: check-out must be after check-in. Are you NUTS?");
		} else {
			var reservation = new Reservation(rn, in, out);
			System.out.println("Reservation: " + reservation);

			System.out.println("");
			System.out.println("Enter data to update the reservation: ");
			in = sdf.parse(sc.next());
			System.out.println("Now inform the check-out date (dd/MM/yyyy): ");
			out = sdf.parse(sc.next());

			var now = new Date();

			if (in.before(now) || out.after(now)) {
				System.out.println("Update failed: you cannot set the check-in/out date to the past. Are you MAD?");
			} else if (!out.after(in)) {
				System.out.println("Reservation failed: check-out must be after check-in. Are you NUTS?");
			} else {
				reservation.updateDates(in, out);
				System.out.println("Reservation updated: " + reservation);
			}

		}
	}

}
