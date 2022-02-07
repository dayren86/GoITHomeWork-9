package exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public void readFile() throws IOException {

        FileReader fr = new FileReader("src/exercise1/file.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            if (line.matches("^[(]\\d{3}[)][\\s]\\d{3}[-]\\d{4}$|^\\d{3}[-]\\d{3}[-]\\d{4}$")) {
                System.out.println("line = " + line);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();
        readFile.readFile();
    }
}

