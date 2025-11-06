package oops1;

public class Test {
    static void main() {
        car c1 = new car("Toyota","Red",2024);


c1.drive();
c1.displayInfo();

    }




}

class car{
    String Brand;
    String color;
    int year;


    car (String Brand,String color,int year){
        this.Brand=Brand;
        this.color=color;
        this.year=year;
    }
void drive(){
    System.out.println(Brand+ " is Drive");
}
void displayInfo(){
    System.out.println("Brand :"+Brand+" color"+color+" Year"+year);
}



}
