package single_responsibility;

public class Main {
    public static void main(String[] args) {
EmployeeFacade employeeFacade = new EmployeeFacade();
employeeFacade.cleanFloor();
employeeFacade.cook();
    }
}
interface Employee {
    int getSalary();
}
class Cook implements Employee{
    @Override
    public int getSalary() {
        return 0;
    }

    void cook() {}
}
class Janitor implements Employee {
    @Override
   public int getSalary() {
        return 0;
    }

    void cleanFloor() {}
}

class EmployeeFacade {
    Cook cook = new Cook();
    Janitor janitor = new Janitor();
    void cook() {
    cook.cook();
}
        void cleanFloor() {
    janitor.cleanFloor();
    }
}