import java.util.Arrays;

public class MyClass22 {
    public static void main(String[] args) {
        int[] array = new int [8];
        int j = 0;
        for (int i = 1; i < array.length; i++, j += 3){
            array[i] = j;

            System.out.println(array[i]);
        }
    }
}
