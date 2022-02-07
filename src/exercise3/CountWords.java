package exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class CountWords {

    public void readFile() throws FileNotFoundException {
        File file = new File("src/exercise3/countwords.txt");
        Scanner scanner = new Scanner(file);
        HashMap<String, Integer> map = new HashMap<>();

        while (scanner.hasNext()) {
            String nextWord = scanner.next();
            map.put(nextWord, map.getOrDefault(nextWord, 0) + 1);
        }

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(
                set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry entry: list) {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        CountWords countWords = new CountWords();
        countWords.readFile();


    }

}
