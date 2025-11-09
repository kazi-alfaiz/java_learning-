package oops2;

public class car  {
  String Brand ;
         String color ;
         int year ;

                public car(String Brand,String color,int year){
                    this.Brand=Brand;
                    this.color=color;
                    this.year=year;
                }
            public void Drive(){
                System.out.println(Brand+" is Driving and there color is "+color+" And lunching year "+ year);
            }

    static void main() {

        car c1 = new car("Toyota", "Red", 2024);
        c1.Drive();
        car c2 = new car("Tata", "Black", 2024);
                   c2.Drive();
    }
}



