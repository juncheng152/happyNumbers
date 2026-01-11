import java.lang.reflect.Array;
import java.util.HashSet;

public class Solution {
    public boolean isHappy(int number) {
        HashSet<Integer> visited = new HashSet<>();

        while (true) {
            if (!visited.contains(number)) {
                if (getSumOfDigits(number) == 1) return true;
            } else {
                return false;
            }
            visited.add(number);
            number = getSumOfDigits(number);
        }
    }

    int getSumOfDigits(int number) {
        int output=0;
        int[] numberArray = intToArray(number);
        for (int i=0; i<numberArray.length; i++) {
            output+=Math.powExact(numberArray[i],2);
        }
        return output;
    }

    int[] intToArray(int number) {
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = Character.getNumericValue(temp.charAt(i));
        }
        return numbers;
    }

}
