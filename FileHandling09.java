package Com.File;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling09 {

    public static void main(String[] args) throws IOException {

        String p1 = "D:\\FileHandling\\WhatsApp Ptt 2026-06-03 at 12.52.28 PM.ogg";
        String p2 = "D:\\FileHandling\\WhatsApp Ptt 2026-06-03 at 12.52.28 PM Copy.ogg";

        FileInputStream fis = new FileInputStream(p1);
        BufferedInputStream bis = new BufferedInputStream(fis);
        int temp;

        FileOutputStream fos = new FileOutputStream(p2);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        

        while ((temp = bis.read()) != -1) {
            bos.write(temp);
        }
        fis.close();
        fos.close();
        bis.close();
        bos.close();

    }
}