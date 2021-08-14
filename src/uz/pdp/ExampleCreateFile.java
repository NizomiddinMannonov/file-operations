package uz.pdp;

import java.io.File;
import java.io.IOException;

public class ExampleCreateFile {
    public static void main(String[] args) {
        File file = new File("E:\\Dell\\Test1.txt");
        try {
            boolean isCreated = file.createNewFile();
            if (isCreated) {
                System.out.println("File yaratildi");
            } else {
                System.out.println("Bunday file mavjud");
            }
        } catch (IOException e) {
            System.out.println("Ko'rstailgan disk yoki papka mavjud emas");
        }

    }
}
