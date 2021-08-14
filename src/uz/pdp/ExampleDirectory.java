package uz.pdp;

import java.io.File;

public class ExampleDirectory {

    public static void main(String[] args) {


        File file=new File("E:\\Dell");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);


    }
}
