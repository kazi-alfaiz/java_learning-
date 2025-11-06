public class main {
    public static void main(String[] args) {


        Dog d1 = new Dog();
        d1.Name="Kalo";

        d1.bark();
        d1.Walk();
        d1.age=13;
        d1.Color="red";



        Dog d2 = new Dog();
        d2.Name="leo";
        d2.Walk();
         d2.bark();


    }
}

class Dog{ // factory

    String Name;
    int age;
    String Color;



    void Walk(){
        System.out.println(Name+" is Walking");
    }

    void bark(){
        System.out.println(Name+" is barking");
    }
}


class cat{


}