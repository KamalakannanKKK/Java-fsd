package filehandling;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
public class writefile {

	public static void main(String[] args) {
				try {
					FileWriter Writer
						= new FileWriter("newFile.txt");
					Writer.write(
						"The World is surruonded by water ");
					Writer.close();
					System.out.println("The text is written on the file");
				}
				catch (IOException e) {
					System.out.println("An erro occurred.");
					e.printStackTrace();
				}
			}
		


	}


