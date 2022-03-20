package praktikum;

public class Main {
    public static void main(String[] args) {

        CSS CSS = new CSS();
        Course course1 = new Course("MATKUL1", "Bahasa Indonesia");
        Course course2 = new Course("MATKUL2", "Statistika");
        Course course3 = new Course("MATKUL3", "Basis Data");

        CSS.addNewCourse(course1);
        CSS.addNewCourse(course2);
        CSS.addNewCourse(course3);

        CSS.print();
    }
}
