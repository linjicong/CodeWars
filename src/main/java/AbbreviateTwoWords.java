/**
 * Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
 *
 * The output should be two capital letters with a dot separating them.
 *
 * It should look like this:
 *
 * Sam Harris => S.H
 *
 * Patrick Feeney => P.F
 */
public class AbbreviateTwoWords {
    public static String abbrevName(String name) { String[] s = name.split(" ");
        return s[0].toUpperCase().charAt(0)+"."+s[1].toUpperCase().charAt(0);
    }
}
