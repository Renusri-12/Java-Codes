package Com.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling15 {
	public static void main(String[]args) {
		try {
			String p1 = "D:\\FileHandling\\File1.txt";
			FileWriter fw = new FileWriter(p1);
			fw.write("Welcome To Gqt");
			fw.close();
			System.out.println("Reading the data from the file :");
			FileReader fr = new FileReader(p1);
			Scanner sc = new Scanner(fr);
			while(sc.hasNextLine()) {
				String temp = sc.next();
				System.out.print(temp);
			}
			sc.close();
			fr.close();
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
	}

}





/*package Com.File;

import java.io.File;
import java.io.IOException;

public class FileHandling16 {

	public static void main(String[] args) {

		try {
			String p1 = "D:\\FileHandling\\File1.txt";

			File f = new File(p1);

			System.out.println("Deleting the file :");

			if (f.delete()) {
				System.out.println("File deleted successfully");
			} else {
				System.out.println("File not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}*/