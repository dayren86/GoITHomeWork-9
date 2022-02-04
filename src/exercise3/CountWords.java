package exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWords {

    public void readFile() throws FileNotFoundException {
        File file = new File("src/exercise3/countwords.txt");
        Scanner scanner = new Scanner(file);
        Map<String, Integer> map = new HashMap<>();

        while (scanner.hasNext()) {
            String nextWord = scanner.next();
            map.put(nextWord, map.getOrDefault(nextWord, 0) + 1);
        }
        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        CountWords countWords = new CountWords();
        countWords.readFile();
    }

}
