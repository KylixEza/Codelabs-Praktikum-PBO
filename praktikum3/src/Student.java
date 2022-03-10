public class Student {

    private String id;
    private String name;
    private String gender;
    private String classOfStudent;
    private String school;

    Student(String id, String name) {
        this.id = id;
        this.name = name;
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

    public void study() {

    }
}
