import annotation.AnnotationExecutor;
import annotation.FieldNotNull;
import annotation.NullableField;

@FieldNotNull
public class Human extends AnnotationExecutor implements DailyActivity{
    @NullableField
    String name;
    String number;
    boolean gender;
    int height;

    public Human() throws Exception {
        nullableCheck(this);
    }

    public Human(String name, String number, boolean gender, int height) throws Exception {
        this.name = name;
        this.number = number;
        this.gender = gender;
        this.height = height;
        nullableCheck(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String isGenders(){
        if(gender == true){
            return "Laki-laki";
        }else
            return "Perempuan";
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", gender=" + gender +
                ", height=" + height +
                '}';
    }

    public void saySomething(Human human) {
        if (human instanceof Student) {
            System.out.println("Student is called");
            System.out.println(human.toString());
        } else if (human instanceof Employee) {
            System.out.println("Employee is called");
            System.out.println(human.toString());
        } else {
            System.out.println("Other is called");
            System.out.println(human.toString());
        }
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

}
