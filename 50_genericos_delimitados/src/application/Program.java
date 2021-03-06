package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Users\\mattheus.martins\\Documents\\webexample\\in.txt";
		
		try (var br = new BufferedReader(new FileReader(path))){
			var line = br.readLine();
			while(line != null) {
				String[] field = line.split(",");
				list.add(new Product(field[0], Double.parseDouble(field[1])));
				line = br.readLine();
			}
			Product x = CalculationService.max(list);
			System.out.println("Max: ");
			System.out.println(x.getName() + " " + x.getPrice());
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
