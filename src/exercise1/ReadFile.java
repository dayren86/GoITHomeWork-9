package exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public void readFile() throws IOException {

        FileReader fr = new FileReader("src/exercise1/file.txt");
        BufferedReader br = new BufferedReader(fr);
        String[] arrayLine = new String[20];
        String line;
        int index = 0;
        while((line = br.readLine()) != null){
            arrayLine[index] = line;
            index++;
        }
        for (int i = 0; i < arrayLine.length; i++) {
            char[] chars = arrayLine[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[3] == '-' && chars[7] == '-' || chars[0] == '(' && chars[4] ==')') {
                    System.out.println(arrayLine[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        readFile.readFile();
    }
}

