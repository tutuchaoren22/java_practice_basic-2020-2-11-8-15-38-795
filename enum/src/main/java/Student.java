public enum Student {
    STUDENT_1("Linda", "Female"),
    STUDENT_2("Bob", "Male"),
    STUDENT_3("Solider", "Male"),
    STUDENT_4("Cindy", "Female");
    private final String name;
    private final String gender;

    Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
