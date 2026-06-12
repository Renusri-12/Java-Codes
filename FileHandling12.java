package Com.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
class Cricketer implements Serializable {

    String name;
    String country;
    int runs;
    int wickets;
    int catches;

    public Cricketer(String name, String country, int runs, int wickets, int catches) {
        this.name = name;
        this.country = country;
        this.runs = runs;
        this.wickets = wickets;
        this.catches = catches;
    }

    void display() {
        System.out.println(name);
        System.out.println(country);
        System.out.println(runs);
        System.out.println(wickets);
        System.out.println(catches);
    }
}

public class FileHandling12 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
    	Cricketer c1 = new Cricketer("Virat", "India", 19000, 20, 300);
    	String p1 = "D:\\FileHandling\\Cricketer.txt";
    	FileInputStream fis =new FileInputStream(p1);
    	ObjectInputStream ois = new ObjectInputStream(fis);
    	Cricketer c2 =(Cricketer)ois.readObject();
    	c2.display();
    	ois.close();
    	fis.close();
    }
}