public class Employee extends Human {

    public Employee(String name, String number, boolean gender, int height) {
        super(name, number, gender, height);
    }

    public void work() {
        System.out.println(this.name + " works for 3 hours each day");
    }
}
