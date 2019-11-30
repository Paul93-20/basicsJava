public class MyClass25 {
    public static void main(String[] args) {
        int arr[] = {1,8,2,3};
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max ) {
                max = arr[i];
            }
            if (arr[i] < min ) {
                min = arr[i];
            }
        }
        System.out.println("Максимальное число: " + max);
        System.out.print("Минимальное число: " + min);
    }
}
