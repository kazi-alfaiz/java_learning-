package introdoction;

public class main  {
    public static void main(String[] args) {
        // store 5 rolls nos
        int [] number = new int[5];
        //Store 5 names
        String [] names = new String[5];
        //data of 5 student ;{roll no,name,marks}
int []rno= new int[5];
String []name = new String[5];
float [] marks = new float[5];




//just declaring
      //  Student kunal;
     // kunal = new Student();

   Student kunal = new Student();
   kunal.rno=21;
   kunal.name="kunal kushwaha";
   //kunal.marks=78.85f   ;
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);




    }
}
//create a class
//for every single Student


// we need  one  word to access every object
class Student{
    int rno;
    String name ;
    float marks =43.43f;

    // we need a way to add the value of the above property object by object

Student (){
    this.name="Kuanl; khuswaha";
    this.rno=13;
    this.marks=78.78f;
}


Student(int rno,String name,float marks){
    this.rno=rno;
    this.name=name;
    this.marks=marks;
}

}