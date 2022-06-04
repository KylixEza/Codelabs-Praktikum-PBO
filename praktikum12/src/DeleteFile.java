import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        var file = new File("praktikum12/src/test-baru.txt");

        if (file.exists()) {
            var result = file.delete();

            System.out.println((result ? "Berhasil" : "Gagal") + " menghapus file");
        } else {
            System.out.println("File tidak ada");
        }
    }
}
