/**
 * 7 kyu
 * You're a square!
 */
public class Square {
    public static boolean isSquare(int n) { 
        int d=1;
        int count=0;
        while(n>0){
          n-=d;
          d+=2;
          count++;
        }
        return n==0;
    }
}