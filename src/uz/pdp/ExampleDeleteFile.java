package uz.pdp;

import java.io.File;

public class ExampleDeleteFile {
    public static void main(String[] args) {
        File file = new File("E:\\Dell\\Test1.txt");
        boolean delete = file.delete();
        if (delete) {
            System.out.println("O'chirildi");
        }else
            System.out.println("Fayl yo'q");


    }


}
