package Day6.Task3;

import java.util.Random;

public class Teacher {
    private String lastFirstMiddleName;
    private String subject;

    public Teacher(String lastFirstMiddleName, String subject){
        this.lastFirstMiddleName = lastFirstMiddleName;
        this.subject = subject;
    }
    public void rateStudent(Student student){
        int evaluation = (int)(Math.random()*4+2);
        String rating = "";
        switch (evaluation){
            case 2 :{
                rating = "неудовлетворительно";
                break;
            }
            case 3:{
                rating = "удовлетворительно";
                break;
            }
            case 4:{
                rating = "хорошо";
                break;
            }
            case 5: {
                rating = "отлично";
                break;
            }
        }
        System.out.print("Преподаватель "  + lastFirstMiddleName + " оценил студента с именем " + student.getLastFirstMiddleName() +
                " по предмету " + subject + " на оценку " + rating);
    }
}
