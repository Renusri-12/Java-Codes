package Com.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer1 implements Serializable {

    String name;
    String country;
    transient int runs; 
    int wickets;
    int catches;

    public Cricketer1(String name, String country, int runs, int wickets, int catches) {
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

public class FileHandling13 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Serialization");
        System.out.println("----------------");
        Cricketer1 c1 = new Cricketer1("Rohit", "India", 18000, 15, 350);
        c1.display();
        String p1 = "D:\\FileHandling\\Cricketer1.txt";
        FileOutputStream fos = new FileOutputStream(p1);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c1);
        oos.close();
        fos.close();
        System.out.println("Deserialization");
        System.out.println("----------------");
        FileInputStream fis = new FileInputStream(p1);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Cricketer1 c2 = (Cricketer1) ois.readObject();
        c2.display();
        ois.close();
        fis.close();
    }
}