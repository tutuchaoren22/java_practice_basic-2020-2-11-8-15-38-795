public class Application {
    public static void main(String[] args) {
        System.out.println("所有女学生的信息为：");
        for (Student student : Student.values()) {
            if (student.getGender().equals("Male")) {
                System.out.println("(" + student.getName() + "," + student.getGender() + ")");
            }
        }
    }
}
