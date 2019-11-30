public class MyClass24 {
    public static void main(String[] args) {
        int len = 5;
        int arr[][] = new int[len][len];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i == j) || (i == len - 1 - j)) {
                    arr[i][j] = 1;
                }
            }


        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
