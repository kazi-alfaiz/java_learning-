package oops4;

public class learnAbstract {
    static void main() {
        scotty sc  =new scotty();
        sc.accelarate();
            sc.brakes();

    }


}


abstract class Vehicle{

    abstract void accelarate();
    abstract void brakes();
}

class scotty extends Vehicle{


    @Override
    void brakes() {

    }

    @Override
    void accelarate() {

    }
}