public class LinearSearch {
    public static void main(String[] args) {
        int [] arr ={5,10,15,20,};
        int key =1;
        boolean found = false;


        for (int num :arr){
            if(num==key){
                found=true;
                break;
            }
        }

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element not Found");



    }
}
