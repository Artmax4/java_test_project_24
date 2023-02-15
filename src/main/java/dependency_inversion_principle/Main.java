package dependency_inversion_principle;

public class Main {
    public static void main(String[] args) {

    }
}

interface DAO {
    void execute();

}

class DataAccess implements DAO {
    public void execute() {
        System.out.println("execute");
    }
}

class Client {
    DataAccess dataAccess = new DataAccess();

    void doJob() {
        dataAccess.execute();
    }
}
