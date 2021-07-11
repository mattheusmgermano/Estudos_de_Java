import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

//		� um bloco try que declara um ou mais recursos, e garante
//		que esses ser�o fechados ao final do bloco.
//		
//		Dispon�vel do Java 7 em diante.

		String path = "C:\\Users\\mattheus.martins\\Documents\\Java-Javinha\\FileScanner\\in.txt"; 

		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {

		}
	}
}
