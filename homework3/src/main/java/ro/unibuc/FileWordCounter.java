package ro.unibuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
    TODO:
    scrieti o clasa java care sa returneze toate cuvinetele de lungime > n dintr-un fisier text
    Lungimea n trebuie introdusa de la tastatura.

    In plus fata de lungime, care trebuie introdusa de la tastatura, putem filtra si dupa alte conditii(vedeti testele)
 */
public class FileWordCounter {

    //HINT: you could make one generic method to reuse for all three methods above
    //HINT2: think about functional interfaces, one that verifies things in particular
    public List<String> biggerThanNFromFile(String fileName) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        File file = new File(fileName);
        Scanner input = new Scanner(file);

        List<String> ret = new ArrayList<>();
        while (input.hasNext()) {
            String word  = input.next();
            if (word.length() > n) {
                System.out.println(word);
                ret.add(word);
            }
        }
        return ret;
    }

    public List<String> getSizeOne(String fileName) throws FileNotFoundException {
        //TODO: add code here
        File file = new File(fileName);
        Scanner input = new Scanner(file);

        List<String> ret = new ArrayList<>();
        while (input.hasNext()) {
            String word  = input.next();
            if (word.length() == 1) {
               System.out.println(word);
                ret.add(word);
            }
        }
        return ret;
    }

    public List<String> getSizeLessThan3(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner input = new Scanner(file);

        List<String> ret = new ArrayList<>();
        while (input.hasNext()) {
            String word  = input.next();
            if (word.length() < 3) {
                System.out.println(word);
                ret.add(word);
            }
        }
        return ret;
    }

    public List<String> countWordAppearances(String fileName, String word) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner input = new Scanner(file);

        List<String> ret = new ArrayList<>();
        while (input.hasNext()) {
            String currWord  = input.next().split("[!?.]")[0];
            if (currWord.matches(word)) {
                System.out.println(word);
                ret.add(word);
            }
        }
        return ret;
    }
}
