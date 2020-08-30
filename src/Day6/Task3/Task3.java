package Day6.Task3;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Лидия Петровна Экономовна", "Экономика");
        Student student = new Student("Лентяй Прогульевич Сплюн");
        teacher.rateStudent(student);
    }
}
