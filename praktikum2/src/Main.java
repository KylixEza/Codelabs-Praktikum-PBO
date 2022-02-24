public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Bola", 18, 40, 50);

//        cat.setName("Kylix");
//        String catName = cat.getName();
//        cat.setName("Samuel");
//        catName = cat.getName();
//        System.out.println(catName);

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getHeight());
        System.out.println(cat.getWeight());
    }
}
