package Day8;

public class Aircraft {

    private String maker;
    private int yearOfIssue;
    private int length;
    private int weight;
    private int volumeOfTank;

    public void info() {
        System.out.printf("Изготовитель: %s,год выпуска: %d,длина: %d, вес: %d, объем топлива в баке: %d", maker, yearOfIssue, length, weight, volumeOfTank);
    }

    public String toString(){
        return "Изготовитель: " + maker + ", год выпуска: " + yearOfIssue + ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " + volumeOfTank;
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

    public Aircraft(String maker, int yearOfIssue, int length, int weight) {
        this.maker = maker;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.weight = weight;
        this.volumeOfTank = 0;
    }


}
