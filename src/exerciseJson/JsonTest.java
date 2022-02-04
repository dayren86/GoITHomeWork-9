package exerciseJson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(arrayList);
        System.out.println(json);
    }

    public static void main(String[] args) throws IOException {
        JsonTest jsonTest = new JsonTest();
        jsonTest.readFile();
    }
}

