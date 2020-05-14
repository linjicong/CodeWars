/**
 * 6 kyu
 * Create Phone Number
 * Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
 *
 * Example:
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 * The returned format must be correct in order to complete this challenge.
 * Don't forget the space after the closing parentheses!
 *
 * return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
 */
public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int number : numbers) {
      stringBuilder.append(number);
    }
    stringBuilder.insert(0,"(");
    stringBuilder.insert(4,") ");
    stringBuilder.insert(9,"-");
    return stringBuilder.toString();
  }

  public static void main(String[] args) {
    System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
  }
}