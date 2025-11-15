package introdoction;

public class WrapperExaplme {
    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 20 ;

swap(a,b);

        System.out.println(a+"  "+b);

        final int bonus =2;
         //bouns = 3;

    }


    static void swap(Integer a,Integer b){

        int temp = a;
        a=b;
        b= temp ;


    }


}
class A{
    final int num =2;
}