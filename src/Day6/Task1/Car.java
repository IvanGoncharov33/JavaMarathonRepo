package Day6.Task1;


public class Car {

   private int yearOfIssue;
   private String color;
   private String model;


    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void printTypeTransport(){
        System.out.println("Это Автомобиль");
    }
    public int operationTime(int year){
        return year - this.yearOfIssue;
    }
}
