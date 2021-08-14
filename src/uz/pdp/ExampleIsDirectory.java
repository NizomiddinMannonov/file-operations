package uz.pdp;

import java.io.File;

public class ExampleIsDirectory {
    public static void main(String[] args) {
        File file = new File("E:\\Dell\\Test2.txt");
        if (file.isDirectory()) {
            System.out.println("Papka");
        } else {
            System.out.println(file.getPath());
            System.out.println("Papka emas");
        }
    }
}
