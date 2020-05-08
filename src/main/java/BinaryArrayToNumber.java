import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 7 kyu
 * Ones and Zeros
 * Given an array of ones and zeroes, convert the equivalent binary value to an integer.
 *
 * Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
 *
 * Examples:
 *
 * Testing: [0, 0, 0, 1] ==> 1
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 0, 1] ==> 5
 * Testing: [1, 0, 0, 1] ==> 9
 * Testing: [0, 0, 1, 0] ==> 2
 * Testing: [0, 1, 1, 0] ==> 6
 * Testing: [1, 1, 1, 1] ==> 15
 * Testing: [1, 0, 1, 1] ==> 11
 * However, the arrays can have varying lengths, not just limited to 4.
 */
public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int sum=0;
        int length=binary.size();
        for (int i=0;i<length;i++){
            sum += binary.get(i)*Math.pow(2, length-i-1);
        }
        return sum;
    }

    public static void main(String[] args) {
        ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,1,0)));
    }
}