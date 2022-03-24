public class Main {
    public static void main(String[] args) {
        Human human1  = new Human("Kylix", "0891232144", true, 189);
        Student student1 = new Student("Samuel", "012349841232", true, 180, "205152012301");
        Employee employee1 = new Employee("Galih", "987654321", true, 200);

        human1.saySomething(human1);
        human1.saySomething(student1);
        human1.saySomething(employee1);

        describe(human1);
        describe(student1);
        describe(employee1);
    }

    public static void describe(Human human) {
        System.out.println(human.toString());
    }
}
