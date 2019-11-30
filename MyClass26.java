public class MyClass26 {
    public static void main(String[] args) {

    }
    private static boolean checkBalance(int[] arrNumbers){
        int leftSum;
        int rightSum;
        for (int i = 0; i < arrNumbers.length + 1; i++){
            leftSum = 0;
            rightSum = 0;
            for(int k = 0;k < i; k++){
                leftSum = leftSum + arrNumbers[k];
            }
            for(int k = 0;k < i; k++){
                rightSum = rightSum + arrNumbers[k];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }
}
