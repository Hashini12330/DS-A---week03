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
        

        // 04
        System.out.println("04. Anonymous array of one index");
        arr4 obj4 = new arr4();
        obj4.annonym();

        // annonym with parameters
        obj4.annonym2(new int[]{16, 17, 18, 19, 20});
        System.out.println("--------------------------------------------------");

        // 05 
        System.out.println("05. Reference array variable");
        arr5 obj5 = new arr5();
        obj5.show5();
        System.out.println("--------------------------------------------------");


        // 06
        arr6 obj6 = new arr6();
        obj6.show4();
        System.out.println("--------------------------------------------------");

        // 07
        // 2D array
        arr7 obj7 = new arr7();
        obj7.show7();
        System.out.println("--------------------------------------------------");

        //  
        obj7.show8();
        System.out.println("--------------------------------------------------");


        // 08
        // jagged array
        // method 1
        arr8 obj8 = new arr8();
        obj8.show9();
        System.out.println("--------------------------------------------------");

        // method 2
        obj8.show10();



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



// 04 
// Annonymous array: an array without a name, which is created and initialized in a single statement. It is used when you want to create an array and pass it as an argument to a method without storing it in a variable.
class arr4{

    public void annonym(){
        System.out.println(new int[] {15, 25, 35, 45, 55}[0]); // annonymous array
        
        System.out.println("Annonymous array with for loop: all elements of the array will be printed");

        for(int k = 0; k < new int[] {15, 25, 35, 45, 55}.length; k++){
            System.out.println(new int[] {15, 25, 35, 45, 55}[k]);
        }
        
    }


    public void annonym2(int[] num3){
        System.out.println("Annonym with parameter: all elements of the array will be printed");
        
        for(int l = 0; l < num3.length; l++){
            System.out.println(num3[l]);
        }

    }
}


// reference array variable
class arr5{
    int[] aa;
    
    public void show5(){
        // A
        aa = new int[] {1, 2, 3, 4, 5}; // array created and initialized
                            // This creates an actual array in memory:
        
        
        System.out.println(aa[0]);

        // B
        // Then aa is changed to refer to Array B:
        aa = new int[] {6, 7, 8, 9, 10}; // array created and initialized
                            // This creates a new array in memory:
        System.out.println(aa[0]);

    }
}


// array length with average
class arr6{
    int[] num6;

    public void show4(){
        num6 = new int[]{1, 2, 3, 4, 5}; // array created and initialized
        System.out.println("Length of the array: " + num6.length);

        double average = 0.0;

        for (int m = 0; m < num6.length; m++){
            average += num6[m];

        }
        average /= num6.length;
        System.out.println("Average of the array: " + average);


    }
}


// 2D array
class arr7{

    // method: 01
    int[][] num7 = new int[3][4]; // 2D array created, but not initialized

    public void show7(){
        // declaring its values
        num7[0][0] = 10; // array initialized
        num7[1][1] = 20; // array initialized
        num7[2][2] = 30; // array initialized  
        num7[2][3] = 40; // array initialized

        System.out.println("2D array: ");

        System.out.println(num7[0][0]);
        System.out.println(num7[1][1]);
    

    }


    // method: 02
    public void show8(){
        int[][] num8 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        System.out.println("2D array: ");
        for (int i = 0; i < num8.length; i++){
            for (int j = 0; j < num8[i].length; j++){
                System.out.print(num8[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}


// 08
// jagged array
class arr8{

    int[][] num9;
    
    public void show9(){

        // method: 01
        // step 1:
        // only declaring rows, but not columns
        num9 = new int[4][];

        // step 2:
        // declaring columns for each row
        num9[0] = new int[2];
        num9[1] = new int[3];

        // step 3:
        // declaring its values
        num9[0][0] = 1;
        num9[0][1] = 2;
        num9[1][0] = 3;
        num9[1][1] = 4;
        num9[1][2] = 5;
        
        // printing the jagged array
        System.out.println("Jagged array: ");
        System.out.println(num9[0][0]);
        System.out.println(num9[0][1]);
        
    }


    public void show10(){

        // method: 02
        int[][] num10 = {
            {1, 2},
            {3, 4, 5},
            {6, 7, 8, 9}
        };

        for (int n = 0; n < num10.length; n++){
            for (int o = 0; o < num10[n].length; o++){
                System.out.print(num10[n][o] + " ");
            }
            System.out.println();
        }


    }


}