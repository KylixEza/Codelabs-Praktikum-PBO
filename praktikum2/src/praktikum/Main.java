package praktikum;

public class Main {
    public static void main(String[] args) {

        CSS CSS = new CSS();
        Course matkul1 = new Course("MATKUL1", "Bahasa Indonesia");
        Course matkul2 = new Course("MATKUL2", "Statistika");
        Course matkul3 = new Course("MATKUL3", "Basis Data");

        CSS.tambahMataKuliah(matkul1);
        CSS.tambahMataKuliah(matkul2);
        CSS.tambahMataKuliah(matkul3);

        CSS.print();
    }
}
