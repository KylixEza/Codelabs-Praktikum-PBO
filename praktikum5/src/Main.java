public class Main {
    public static void main(String[] args) {
        Human human1  = new Human("Kylix", "0891232144", true, 189);
        Student student1 = new Student("Samuel", "012349841232", true, 180, "205152012301");

    }

    public static void saySomething(Human human) {
        if(human instanceof Student) {
            System.out.println("Student is called");
            System.out.println(human.toString());
        } else {
            System.out.println("Other is called");
            System.out.println(human.toString());
        }
    }
}
