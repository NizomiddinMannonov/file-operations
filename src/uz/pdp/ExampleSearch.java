package uz.pdp;

import java.io.File;
import java.util.Scanner;

public class ExampleSearch {
    private static int j = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diskni kiriting");
        String disk = scanner.nextLine();

        System.out.println("Fayl nomini kiriting");
        String name = scanner.nextLine();

        File file = new File(disk + ":\\");
        searchFile(file, name);
    }

    public static void searchFile(File file, String name) {
        File[] files = file.listFiles();
        for (File fileOne : files) {
            if (fileOne.isDirectory() && !fileOne.isHidden()) {
                searchFile(fileOne, name);
            } else {
                if (!fileOne.isDirectory() && fileOne.getName().toLowerCase().contains(name.toLowerCase())) {
                    j++;
                    System.out.println(j + "." + fileOne.getPath());
                }
            }
        }
    }

}
