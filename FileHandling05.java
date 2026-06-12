package Com.File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling05 {

	public static void main(String[] args) throws FileNotFoundException ,IOException{
		String p1 = "D:\\FileHandling\\Butterfly.jpg";
		String p2 = "D:\\FileHandling\\Butterfly1.jpg";
		FileInputStream fis = new FileInputStream(p1);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int temp;
		FileOutputStream fos = new FileOutputStream(p2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		while((temp = bis.read())!= -1) {
			bos.write(temp);
		}
		bis.close();
		bos.close();
		fos.close();
		fis.close();
	}

}
