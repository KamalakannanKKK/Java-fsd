package projectassesment;

import java.util.*;
import java.io.File;

public class VirtualkeyRepositary {
	public static File folder = new File("/home/kamalakannankmp/Asses");

	public static void main(String[] args) {

		// welcome Page
		System.out.println("\n**************************************\n");
		System.out.println("\tVirtual Key Repository \n");
		System.out.println("                      Developed by KAMAL");
		System.out.println("**************************************");
		menu();
	}

	public static void menu() {

		System.out.println("Available Operation are \n");
		String[] arr = { "1. To Retrieving the file names in an ascending order",
				"2.  To perform Business-level operations", "3. Close the application" };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			// display the all the menu mentioned in the String array
		}
		System.out.println("\nSelect one of the options listed above\n");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		switch (k) {
		case 1:
			File a[] = folder.listFiles();
			Arrays.sort(a);

			for (int i = 0; i < a.length; i++)
				System.out.println(a[i]);
			menu();
			break;
		case 2:
			boolean t = true;
			while (t) {
				System.out.println("Business Level Operations\n");
				System.out.println(" 1 : To Add a file in the existing Directory");
				System.out.println(" 2 : To Delete a file from the existing Directory. ");
				System.out.println(" 3 : To Search a user specified file from the Directory");
				System.out.println(" 4 : Back to the main menu");

				int j = sc.nextInt();
				switch (j) {
				case 1:
					System.out.println("Enter the File Name to create");
					String s = sc.next();
					File file = new File(folder, s);

					try {
						boolean value = file.createNewFile();
						if (value) {
							System.out.println("The new file is created.");
						} else {
							System.out.println("The file already exists.");
						}
					} catch (Exception e) {
						e.getStackTrace();
					}
					break;
				case 2:
					System.out.println("Enter the File Name to delete");
					String name = sc.next();
					File file1 = new File(folder, name);

					try {
						boolean value = file1.delete();
						if (value) {
							System.out.println("The new file is Deleted.");
						} else {
							System.out.println("File Not Found");
						}
					} catch (Exception e) {
						e.getStackTrace();
					}
					break;
				case 3:
					System.out.println("Enter a keyword to search");
					String search = sc.next();
					boolean flag1 = false;
					File arr1[] = folder.listFiles();
					for (int i = 0; i < arr1.length; i++) {
						if (arr1[i].getName().startsWith(search)) {
							flag1 = true;
							System.out.println("File Found\n");
							System.out.println(arr1[i]);
							break;
						}
					}
					if (flag1 == false) {
						System.out.println("No file found");
					}

					break;
				case 4:
					t = false;
					menu();
					break;
				default:
					System.out.println("You have made an invalid choice!");
					System.out.println("Please enter correct choice\n");

				}
			}
			break;
		case 3:
			System.out.println("Closing Your Application...\n");
			System.out.println("-----Thank You------");
			break;
		default:
			System.out.println("You have made an invalid choice!");
			System.out.println("Please enter correct choice\n");
			menu();
			break;

		}

	}

}
