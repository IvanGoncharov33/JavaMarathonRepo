package Day6.Task1;

public class Motorcycle {

    private String model;
    private String color;
    private int yearOfIssue;

    public Motorcycle(String model, String color,int yearOfIssue ){
        this.model = model;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    public void printTypeTransport(){
        System.out.println("Это Мотоцикл");
    }

    public int operationTime(int year){
        return year - this.yearOfIssue;
    }


}
