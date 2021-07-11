import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var sc = new Scanner(System.in);
		
		System.out.println("Enter the filepath: ");
		var strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: "+ path.getName());
		System.out.println("getName: "+ path.getParent());
		

	}

}
