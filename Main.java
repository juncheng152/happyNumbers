import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] happyNumbers = new int[1000];
        int n=0;
        int target=0;
        while (n<happyNumbers.length) {
            if (solution.isHappy(target)) {
                happyNumbers[n] = target;
                n++;
            }
            target++;
        }
        System.out.println(Arrays.toString(happyNumbers));
    }
}
