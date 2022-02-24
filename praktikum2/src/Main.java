public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal();

        cat.setName("Kylix");
        String catName = cat.getName();
        cat.setName("Samuel");
        catName = cat.getName();
        System.out.println(catName);
    }
}
