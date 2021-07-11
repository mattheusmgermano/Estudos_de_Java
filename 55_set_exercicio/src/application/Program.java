package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {
	public static void main(String[] args) {
//		Um site de internet registra um log de acessos dos usu�rios. Um
//		registro de log consiste no nome de usu�rio (apenas uma palavra)
//		e o instante em que o usu�rio acessou o site no padr�o ISO 8601,
//		separados por espa�o. 
		var sc = new Scanner(System.in);
		
		var path = sc.nextLine();
		
		try(var br = new BufferedReader(new FileReader(path))){
			Set<LogEntry> set = new HashSet<>();
			var line = br.readLine();
			while(line != null) {
				var fields = line.split(" ");
				var username = fields[0];
				var moment = Date.from(Instant.parse(fields[1]));
				set.add(new LogEntry(username, moment));
				line = br.readLine();
			}
			System.out.println("Total users: " + set.size());
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
