package ro.unibuc;

import java.io.FileNotFoundException;

public class WordCounting {
    public static void main(String[] args) throws FileNotFoundException {
        FileWordCounter fileWordCounter = new FileWordCounter();
        //TODO: add code here to read from console and get the length limit

        for (String s: "test!!!!".split("[!?.]"))
            System.out.println(s);
    }
}
