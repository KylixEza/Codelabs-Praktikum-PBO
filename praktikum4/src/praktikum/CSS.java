package praktikum;

import java.util.ArrayList;
import java.util.function.Consumer;

public class CSS {

    private ArrayList<Course> courses = new ArrayList<>();

    public void addNewCourse(Course course) {
        courses.add(course);
    }

    public void deleteCourse(Course deletedCourse) {
        courses.remove(deletedCourse);
    }

    public void print() {
        courses.forEach(new Consumer<Course>() {
            @Override
            public void accept(Course course) {
                System.out.println(course.getName());
            }
        });
    }
}
