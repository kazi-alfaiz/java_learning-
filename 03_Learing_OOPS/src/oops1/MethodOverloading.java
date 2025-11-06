package oops1;

public class MethodOverloading {
    static void main() {
Greet gr = new Greet();
gr.Greetings();
gr.Greetings();
gr.Greetings("Alfaiz",5);


    }
}
class Greet{
    void Greetings(){
        System.out.println("Hello, Good Morning ");
    }
void Greetings(String Name){
    System.out.println("Hello "+Name+",Good Morning");
}
void Greetings(String name ,int count){
    for (int i = 0; i <count ; i++) {
        System.out.println("Hello "+ name +" Good Morning");

    }
}
}