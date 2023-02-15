package open_close_principle;

public class Main {
    public static void main(String[] args) {
        //Toyota toyota = new Toyota();
        Celica celica = new Celica();
        workInTaxi(celica);
    }

    static void workInTaxi(Car car) {
        car.workInTaxi();
    }
}
//main|->|Toyota|
//main| -> ICar <- |Toyota|

interface Car {
    void workInTaxi();
}

class Toyota implements Car {
    void getPassengers() {
        System.out.println("get passengers");
    }

    void getPassenger() {
        System.out.println("get one passenger");
    }

    @Override
    public void workInTaxi() {
        getPassengers();
    }
}

class Celica extends Toyota {
    @Override
    public void workInTaxi() {
        getPassenger();
    }

    void getPassenger() {
        System.out.println("get one passenger");
    }
}

