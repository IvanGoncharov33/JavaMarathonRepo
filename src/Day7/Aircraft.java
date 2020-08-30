package Day7;

public class Aircraft {

    private String maker;
    private int yearOfIssue;
    private int length;
    private int weight;
    private int volumeOfTank;

    public Aircraft(String maker, int yearOfIssue, int length, int weight) {
        this.maker = maker;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.weight = weight;
        this.volumeOfTank = 0;
    }

    public void info() {
        System.out.printf("Изготовитель: %s,год выпуска: %d,длина: %d, вес: %d, объем топлива в баке: %d", maker, yearOfIssue, length, weight, volumeOfTank);
    }

    public static void lengthComparison(Aircraft aircraft1, Aircraft aircraft2) {

        if (aircraft1.length == aircraft2.length) {

            System.out.println("Оба самолета равны по длинне");
        } else {

            if (aircraft1.length > aircraft2.length) {
                System.out.println("Первый самолет длиннее второго");
            } else System.out.println("Второй самолет длиннее первого");

        }
    }

    public void fillUp(int volumeFuel) {
        this.volumeOfTank += volumeFuel;
    }

    public String getMaker() {
        return maker;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getVolumeOfTank() {
        return volumeOfTank;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setVolumeOfTank(int volumeOfTank) {
        this.volumeOfTank = volumeOfTank;
    }


}
