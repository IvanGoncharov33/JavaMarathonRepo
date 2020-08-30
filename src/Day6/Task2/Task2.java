package Day6.Task2;

public class Task2 {
    public static void main(String[] args) {
        Aircraft a320 = new Aircraft("Airbus",2010,38,50000);
        a320.setYearOfIssue(2013);
        a320.setLength(39);
        a320.fillUp(300);
        a320.fillUp(700);
        a320.info();
    }
}
