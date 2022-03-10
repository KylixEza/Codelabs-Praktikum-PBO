public class Main {

    public static void main(String[] args) {
        Student student = new Student("STUDENT1", "Samuel");
        student.setGender("Laki-laki");
        student.setName("Kylix");
        System.out.println(student.getName());
        System.out.println(student.getGender());
    }
}
