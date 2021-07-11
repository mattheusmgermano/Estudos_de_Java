import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
//		Classes:
//			FileReader: stream de leitura de caracteres a partir de arquivos.
//			
//			BufferedReader: mais rápido.

		String path = "C:\\Users\\mattheus.martins\\Documents\\Java-Javinha\\FileScanner\\ina.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);  // Ele é uma abstração maior para deixar mais rápido e flexível.
			
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
				if(br != null && fr != null) {
					br.close();
					fr.close();
				}				
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
