package Com.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling10 {

	public static void main(String[] args) throws FileNotFoundException ,IOException{
		String p1 = "D:\\FileHandling\\WhatsApp Ptt 2026-06-03 at 12.52.28 PM.ogg";
		String p2 = "D:\\FileHandling\\WhatsApp Ptt 2026-06-03 at 12.52.28 PM Copy1.ogg";
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
		


