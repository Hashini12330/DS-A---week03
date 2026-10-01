public class Main{
    public static void main(){

        // 01 
        arr1 obj = new arr1();
        obj.show();
        System.out.println("--------------------------------------------------");

        // 02
        arr2 obj2 = new arr2();
        obj2.show1();
        System.out.println("--------------------------------------------------");

        // 03 
        System.out.println("03. Creating and initializing arrays in different ways");

        arr3 obj3 = new arr3();
        obj3.show3();
        System.out.println("--------------------------------------------------");
        

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


// 03
// Creating and initializing arrays in different ways

class arr3{

    // method 1:
    int[] num1; // or   int num1[]; // both are valid
                // the array has NOT been created yet.

    public void show3(){
        System.out.println("Array variable declared, but not created yet.");

        
        // num1 = {10, 20, 30, 40, 50}; // array created and initialized

        // method 1: create first, then initialize
        System.out.println("If you only want the first method, your code can be:");

        num1 = new int[5]; // array created, but not initialized

        num1[0] = 3; // array initialized
        num1[1] = 4; // array initialized
        num1[2] = 5; // array initialized
        num1[3] = 6; // array initialized
        num1[4] = 7; // array initialized        // or

        System.out.println(num1[0]);
        System.out.println(num1[1]);
        System.out.println(num1[2]);
        System.out.println(num1[3]);
        System.out.println(num1[4]);

        System.out.println("--------------------------------------------------");



        // method 2: create and initialize together
        System.out.println("Here not impact declara element");

        num1 = new int[]{3, 4, 5, 6, 7, 8}; // array created and initialized
                    // here has 6 elements, but the previous array has 5 elements, so the previous array will be destroyed.

        int j = 0;

        for(j = 0; j < num1.length; j++){
            System.out.println(num1[j]);
        }
    }

}
