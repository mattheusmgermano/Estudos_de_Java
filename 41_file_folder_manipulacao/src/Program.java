import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		var sc = new Scanner(System.in);
		System.out.println("Enter the folder path: ");
		var strPath = sc.nextLine();
		var path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders: ");
		
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files:");
		for(File file : files) {
			System.out.println(file);
		}
		
		var success = new File(strPath + "\\subdir").mkdir();
		
		sc.close();
	}
	
	
}
