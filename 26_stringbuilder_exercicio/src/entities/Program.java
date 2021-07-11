package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException{
		
		var sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		var c1 = new Comment("Have a nice trip!");
		var c2 = new Comment("Wow! That's awesome!");
		
		var p1 = new Post(sdf.parse("21/06/2021 13:05:44"),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country!",
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);

		
	}

}
