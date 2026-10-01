public class Main{
    public static void main(){

        // 01 
        arr1 obj = new arr1();
        obj.show();

        // 02
        arr2 obj2 = new arr2();
        obj2.show1();


    }
}


// 01
// expression with fixed index, and variable index
class arr1{
    int[] num = {10, 20, 30, 40, 50};
    int i = 0;

    public void show(){
        System.out.println(num[i]); // variable
        System.out.println(num[i + 1]); // expression
        System.out.println(num[i + 2]); // expression
        System.out.println(num[3]); // fixed number
    }
}


// 02
class arr2{
    
    public void show1(){
        // 1. Declare + initialize together:
        System.out.println("1. Declare + initialize together:");
        int[] num2 = {1, 2, 3, 4, 5}; // array created and initialized

        int i = 0;
        
        for (i = 0; i < num2.length; i++){
            System.out.println(num2[i]);

        }


        // 2. Declare first, then create + initialize:
        System.out.println("2. Declare first, then create + initialize:");
        int[] num3; // declare
        num3 = new int[]{2, 4, 6, 8, 10}; // create + initialize

        for (i = 0; i < num3.length; i++){
            System.out.println(num3[i]);
        }
    }
}


