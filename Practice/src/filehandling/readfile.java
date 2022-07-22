package filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class readfile {

	public static void main(String[] args) {
				try {
					File Obj = new File("newFile.txt");
					Scanner Reader = new Scanner(Obj);
					while (Reader.hasNextLine()) {
						String data = Reader.nextLine();
						System.out.println(data);
					}
					Reader.close();
				}
				catch (FileNotFoundException e) {
					System.out.println("An error has occurred.");
					e.printStackTrace();
				}
			
		


	}

}
