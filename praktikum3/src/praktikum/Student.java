package praktikum;

public class Student {

    private String id;
    private String name;
    private String gender;
    private String classOfStudent;
    private String school;
    private CSS css;
    private boolean isCssLocked = false;

    Student(String id, String name) {
        this.id = id;
        this.name = name;
        css = new CSS();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassOfStudent() {
        return classOfStudent;
    }

    public void setClassOfStudent(String classOfStudent) {
        this.classOfStudent = classOfStudent;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void addNewCourse(Course course) {
        if (isCssLocked)
            System.out.println("KRS sudah divalidasi oleh dosen PA sehingga tidak menambahkan matkul baru");
        else
            css.addNewCourse(course);
    }

    public void deleteSelectedCourse(Course deletedCourse) {
        if (isCssLocked)
            System.out.println("KRS sudah divalidasi oleh dosen PA sehingga tidak menghapus matkul");
        else
            css.deleteCourse(deletedCourse);
    }

    public void cssValidation() {
        isCssLocked = true;
    }

    public void print() {
        System.out.println("KRS " + name);
        css.print();
    }
}
