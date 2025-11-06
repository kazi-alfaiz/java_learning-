package oops1;

public class LearnConstructor {
    static void main() {
        Complex  num1= new Complex(2,4);
        Complex num2 = new Complex(3,4);
        num1.print();
num2.print();

    }
}
class Complex{
    int a,b;

    public Complex(int Real, int imaginary){
        a=Real;
        b=imaginary;
    }
    void print(){
        System.out.println(a+" + "+b+"i");
    }
}

