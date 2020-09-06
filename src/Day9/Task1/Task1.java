package Day9.Task1;

public class Task1 {
    public static void main(String[] args){
        Student student = new Student("James" , "group401");
        Teacher teacher = new Teacher("Abbet", "Computer Science");
        System.out.println(student.getEducationGroup());
        System.out.println(teacher.getSubject());

        student.printInfo();
        teacher.printInfo();
    }
}
