import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BacaFile2 {

    public static void main(String[] args) {
        var filename = "praktikum12/src/test.txt";
        var file = new File(filename);

        if (file.exists() && file.canRead()) {

            try (var reader = new FileReader(filename);
                 var scanner = new Scanner(reader)) {
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (IOException e) {
                System.err.println("Gagal membaca file");
            }
        } else {
            System.out.println("File tidak ada atau tidak bisa dibaca");
        }
    }
}
