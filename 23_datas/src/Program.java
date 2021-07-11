import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
//		Representa um instante.
//		
//		Um objeto Date internamente armazena:
//			O número de milissegundos desde a meia noite do
//			dia 1 de janeiro 1970 GMT(UTC). 
//		
//		Simples Date Format:
//			dd/MM/yyyy -> 23/06/2021
//			dd/MM/yyyy 	HH:mm:ss -> 23/06/2021 14:38:09
//			
//		Padrão ISO 8601 e classe Instant:
//			Formato: yyyy-MM-ddTHH:mm:ssZ
//			
//			Exemplo: 2021-06-23T14:38:09Z
//			
//			Date y3 = date.from(Instant.parse("2021-06-23T14:38:09Z"));
			
			var sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			var sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			var sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
			var y1 = sdf1.parse("23/06/2021");
			var y2 = sdf2.parse("23/06/2021 14:50:21");
			System.out.println(y1 + "\n" + y2);
			
			var x1 = new Date();
			System.out.println(sdf2.format(x1));
			
			var x2 = new Date(System.currentTimeMillis());
			System.out.println(x2);
			
			var x3 = new Date(1000L* 60L * 60L * 5L);
			System.out.println(sdf2.format(x3));
			
			var x4 = Date.from(Instant.parse("2021-06-23T14:38:09Z"));
			System.out.println(sdf2.format(x4));
			
			System.out.println(sdf3.format(x4));
			

	}

}
