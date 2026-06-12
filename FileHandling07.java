package Com.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling07 {

	public static void main(String[] args) throws FileNotFoundException ,IOException{
		String p1 = "D:\\FileHandling\\Final Documentation.docx";
		String p2 = "D:\\FileHandling\\Final Documentation.docx1";
		FileReader fr = new FileReader(p1);
		BufferedReader br = new BufferedReader(fr);
		int temp; 
		FileWriter fw = new FileWriter(p2);
		BufferedWriter bw = new BufferedWriter(fw);
		while((temp = fr.read())!= -1) {
			bw.write(temp);
		}
		bw.close();
		br.close();
		fw.close();
		fr.close();
	}
}
		


