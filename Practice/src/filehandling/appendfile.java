package filehandling;
import java.io.*;
public class appendfile {
	public static void append(String fileName,
											String str)
			{
				try {

					BufferedWriter out = new BufferedWriter(
						new FileWriter(fileName, true));
					out.write(str);
					out.close();
				}

				catch (IOException e) {

					System.out.println("exception occurred" + e);
				}
			}

			public static void main(String[] args) throws Exception
			{
				String fileName = "newFile.txt";

				String str = "About 71 percent of the Earth's surface is water";
				append(fileName, str);

				try {
					BufferedReader in = new BufferedReader(
						new FileReader("newFile.txt"));

					String mystring;
					while ((mystring = in.readLine()) != null) {
						System.out.println(mystring);
					}
				}

				catch (IOException e) {
					System.out.println("Exception Occurred" + e);
				}
			}
		


	

}
