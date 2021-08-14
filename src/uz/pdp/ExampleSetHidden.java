package uz.pdp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExampleSetHidden {
    public static void main(String[] args) {
        File file = new File("E:\\Dell\\Test2.txt");

        //HIDDEN LIGINI TEKSHIRISH
        if (file.isHidden()) {
            System.out.println("Fayl yashirilgan");
        } else {
            System.out.println("Fayl yashirilmagan");
        }


        //HIDDEN QILISH

        Path path = Paths.get("E:\\Dell\\Test2.txt");

        try {
            Files.setAttribute(path, "dos:hidden", true, LinkOption.NOFOLLOW_LINKS);
        } catch (IOException e) {
            e.printStackTrace();
        }


        //HIDDEN LIGINI TEKSHIRISH
        if (file.isHidden()) {
            System.out.println("Fayl yashirilgan");
        } else {
            System.out.println("Fayl yashirilmagan");
        }


    }
}
