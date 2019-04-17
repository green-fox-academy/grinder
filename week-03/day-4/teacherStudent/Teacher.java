package teacherStudent;

    public class Teacher {


    public Teacher() {

    }

    public String answer() {
        return "Madrid";
    }

    public String teach(Student student) {
        return student.learn();
    }

}
