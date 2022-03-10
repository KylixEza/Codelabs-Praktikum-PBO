package praktikum;

import java.util.ArrayList;
import java.util.function.Consumer;

public class CSS {

    private ArrayList<Course> courses = new ArrayList<>();

    public void tambahMataKuliah(Course matkul) {
        courses.add(matkul);
    }

    public void print() {
        courses.stream().forEach(new Consumer<Course>() {
            @Override
            public void accept(Course course) {
                System.out.println(course.getName());
            }
        });
    }
}
