package Basic;

public class String_all {
    public static void main(String[] args) {

        // this is the 3 way to init String

        String str1 = "value";
        String str2 = new String("value");
        String str3 = String.valueOf(123);
        System.out.println(str2);
        System.out.println(str3);



        //String s = 3+"Str"+3;
        //String s= 3 + 3+"Str";
        //String s= "3"+3+"str";
        //String s = "3" +"3"+ "23";
        //String s = ""+3+3+"23";
        String s= +3+3+3+"3";
        System.out.println(s);
// StringBuilder and String are same but they are some quite different like
        // String are immutable and StringBuilder are ummutable
  StringBuilder sb = new StringBuilder(10);
sb.append("QuickRef");
        System.out.println(sb);






    }

}
