import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class BacaFile3 {

    public static void main(String[] args) {
        var path = Paths.get("praktikum12/src/test.txt");
        var file = path.toFile();

        if (file.exists() && file.canRead()) {
            List<String> text = null;

            try {
                text = Files.readAllLines(path);
            } catch (IOException e) {
                System.err.println("Gagal membaca file");
            }

            for (var line : text) {
                System.out.println(line);
            }
        } else {
            System.out.println("File tidak ada atau tidak bisa dibaca");
        }
    }
}
