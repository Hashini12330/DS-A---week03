public class Main{
    public static void main(){
        arr1 obj = new arr1();
        obj.show();
        

    }
}


class arr1{
    int[] num = {10, 20, 30, 40, 50};
    int i = 0;

    public void show(){
        System.out.println(num[i]);
        System.out.println(num[i + 1]);
        System.out.println(num[i + 2]);
        System.out.println(num[3]);
    }
}