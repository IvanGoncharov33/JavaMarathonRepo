package Day11;

public class Picker implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.salary = salary;
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        warehouse.setCountOrder(warehouse.getCountOrder()+1);
        salary += 80;
        bonus();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder() == 1500){
            salary *= 3;
        }
        if (warehouse.getBalance() == 1000000){
            salary *= 2;
        }
    }
    public  int getSalary(){
        return salary;
    }

    public String toString(){
        return "Зарплата сборщика: " + salary;
    }
}
