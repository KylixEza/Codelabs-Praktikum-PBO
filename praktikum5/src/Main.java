public class Main {
    public static void main(String[] args) {
        Human human1  = new Human("Kylix", "0891232144", true, 189);
        Student student1 = new Student("Samuel", "012349841232", true, 180, "205152012301");

        System.out.println(human1.isGenders());
        System.out.println(student1.isGenders());

        System.out.println(human1);
    }
}
