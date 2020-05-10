/**
 * 8 kyu
 * Beginner Series #2 Clock
 * Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
 *
 * Your task is to make 'Past' function which returns time converted to milliseconds.
 *
 * Example:
 * Past(0, 1, 1) == 61000
 * Input constraints: 0 <= h <= 23, 0 <= m <= 59, 0 <= s <= 59
 */
public class Clock {
    public static int Past(int h, int m, int s)
    {
        return (h*60*60+m*60+s)*1000;
    }

}
