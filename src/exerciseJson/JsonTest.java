package exerciseJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JsonTest  {
    public void readFile () throws IOException {

        File fr = new File("src/exerciseJson/file.txt");
        Scanner scanner = new Scanner(fr);
        List<Person> arrayList = new ArrayList<>();
        scanner.nextLine();
        while (scanner.hasNext()) {
           arrayList.add(new Person(scanner.next(), scanner.nextInt()));
        }
        Writer file = new FileWriter("src/exerciseJson/person.json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(arrayList, file);
        file.close();
    }

    public static void main(String[] args) throws IOException {
        JsonTest jsonTest = new JsonTest();
        jsonTest.readFile();
    }
}

