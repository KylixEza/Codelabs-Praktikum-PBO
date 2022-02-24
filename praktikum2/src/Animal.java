public class Animal {
    private String name = "";
    private int age = 0;
    private int height = 0;
    private int weight = 0;

//    public Animal(){
//
//    }

    public Animal(String name, int age, int height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    void eat(int food) {
        //overloading
    }

    void eat() {
        //overloading
    }

    void eat(int food, boolean isCarnivore) {
        //overloading
    }

    int walk() {
        return 0;
        //method
    }

    boolean drink() {
        return true;
        //method
    }
}


