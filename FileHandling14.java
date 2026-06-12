package Com.File;

import java.io.File;
import java.io.IOException;

public class FileHandling14 {
	public static void main(String[] args) throws IOException {
		String p1 = "D:\\FileHandling\\File1.txt";
		File f1 = new File(p1);
		f1.createNewFile(); //creates the file specified in the path
		System.out.println(f1.exists()); // check if the file in the path is present or not
		System.out.println(f1.canExecute()); // check if the file is have execute rights or not 
		System.out.println(f1.canWrite()); //   check if the file is have write access or not 
		System.out.println(f1.canRead()); //    check if the file is have Read access or not
		System.out.println(f1.getAbsolutePath()); // display the file path
		System.out.println(f1.getCanonicalPath()); // display the file path
		System.out.println(f1.getFreeSpace()); // display the space unallocated in bytes
		System.out.println(f1.getName()); //  display the file name
		System.out.println(f1.getParent()); // display the root path
		System.out.println(f1.getPath()); //display the file path
		System.out.println(f1.getTotalSpace()); //display the space available in bytes
		System.out.println(f1.getUsableSpace()); //display the usable space
		System.out.println(f1.hashCode()); //unique value for the file object
		System.out.println(f1.isAbsolute()); //checks if the path points to absolute path
		System.out.println(f1.isDirectory()); //Checks if the path points to directory
		System.out.println(f1.isFile()); //checks if the path points to file
		System.out.println(f1.isHidden()); //checks if the file is hidden or not
		File f2 = new File("D:\\FileHandling\\File2.txt");
		System.out.println(f2.isHidden());  //checks if the file is hidden or not
		System.out.println(f1.lastModified()); // last modified value in terms of long
		System.out.println(f1.length()); // prints the total number of characters in the file
		
		//File f3 = new File("D:\\FileHandling\\File2.txt");
		//System.out.println(f1.renameTo(f3));
		//System.out.println(f1.exists());
	}

}
