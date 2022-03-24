package praktikum;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("MATKUL1", "Bahasa Indonesia");
        Course course2 = new Course("MATKUL2", "Statistika");
        Course course3 = new Course("MATKUL3", "Basis Data");

        Student student = new Student("ID001", "Kylix");
        Staff staff = new Staff();
        Lecture lecture = new Lecture();
        Human human = new Human();

        student.addNewCourse(course1);
        student.addNewCourse(course2);
        student.addNewCourse(course3);
        student.cssValidation();
        student.deleteSelectedCourse(course2);

        student.print();
    }
}
