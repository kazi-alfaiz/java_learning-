package oops4;

public class LearnInterface {

    static void main() {
        Monkey mk= new Monkey();
        mk.eat();
       mk.walk();
    }
}
interface Animal{
    void eat();
void drink();
}

interface ped{
    void walk();
    void drink();
}



class Monkey implements Animal,ped{
    @Override
    public void drink() {
        System.out.println("Monkey is Drinking water");
    }

    @Override
    public void walk() {
        System.out.println("Monkey is walking ");
    }

    @Override
    public void eat() {
        System.out.println("Monkey Is eating ");
    }
}