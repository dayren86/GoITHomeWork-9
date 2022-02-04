import java.io.FileInputStream;
import java.io.IOException;

class CharArrayWriterTest {
    public static void main(String[] args) throws IOException {
        try(FileInputStream fileInputStream = new FileInputStream("file.txt")) {
            System.out.println("File size is bytes: " + fileInputStream.available());
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            for (int i = 0; i < buffer.length; i++) {
                System.out.print((char) buffer[i]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}