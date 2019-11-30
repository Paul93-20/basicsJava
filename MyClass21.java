

public class MyClass21 {
    public static void main(String[] args) {
        //Задание 1:
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
            System.out.println(arr[i]);
        }
    }


}


