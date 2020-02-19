import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Student Linda = new Student("Linda", Gender.FEMALE);
        Student Bob = new Student("Bob", Gender.MALE);
        Student Solider = new Student("Solider", Gender.MALE);
        Student Cindy = new Student("Cindy", Gender.FEMALE);
        List<Student> students = new ArrayList<Student>() {{
            add(Linda);
            add(Bob);
            add(Solider);
            add(Cindy);
        }};
        System.out.println("所有女学生的信息为：");
        for (Student student : students) {
            if (student.getGender().equals(Gender.FEMALE)) {
                System.out.println("(" + student.getName() + "," + student.getGender() + ")");
            }
        }
    }
}
