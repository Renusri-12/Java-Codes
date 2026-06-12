package Com.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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

public class FileHandling11 {

    public static void main(String[] args) throws IOException {
    	Cricketer c1 = new Cricketer("Virat", "India", 19000, 20, 300);
    	c1.display();
    	String p1 = "D:\\FileHandling\\Cricketer.txt";
    	FileOutputStream fos =new FileOutputStream(p1);
    	ObjectOutputStream oos = new ObjectOutputStream(fos);
    	oos.writeObject(c1);
    	oos.close();
    	fos.close();

        
    }
}