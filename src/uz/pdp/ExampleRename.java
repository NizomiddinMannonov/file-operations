package uz.pdp;

import java.io.File;

public class ExampleRename {
    public static void main(String[] args) {
        File oldFile = new File("E:\\Dell\\Test3.txt");
        File newFile = new File("E:\\Dell\\Test2.txt");
        if (oldFile.renameTo(newFile)) {
            System.out.println("O'zgardi");
        } else {
            System.out.println("O'zgarmadi");
        }

    }
}
