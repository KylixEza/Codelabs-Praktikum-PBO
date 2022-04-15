public class Student extends Human implements StudentDailyActivity{
    String nim;

    public Student(String name, String number, boolean gender, int height, String nim) {
        super(name, number, gender, height);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public String isGenders() {
        if(gender == true){
            return "Mahasiswa Laki-laki";
        }else
            return  "Mahasiswa Perempuan";
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", gender=" + gender +
                ", height=" + height +
                ", nim='" + nim + '\'' +
                '}';
    }

    @Override
    public void study() {

    }
}
