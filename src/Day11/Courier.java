package Day11;

public class Courier implements Worker{
    private int salary ;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse){
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        warehouse.setBalance(warehouse.getBalance() + 1000);
        salary += 100;
        bonus();
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() == 1000000){
            salary *= 2;
        }
    }

    public  int getSalary(){
        return salary;
    }
    public String toString(){
        return "Зарплата курьера: " + salary;
    }
}
