/**This program picks a combination in a lottery.
 * @author (Fikri San Koktas)
 * @version (24 October 2020)*/
 
import java.awt.Point;
import java.util.Scanner;
import java.util.Random;
import java.lang.Object;

public class KFS_LotteryPrinter_Main
{
    public static void main(String [] args)
    {
        double a = 1 + (Math.random()*49);
        double b = 1 + (Math.random()*49);
        double c = 1 + (Math.random()*49);
        double d = 1 + (Math.random()*49);
        double e = 1 + (Math.random()*49);
        double f = 1 + (Math.random()*49); // I used double because it gave compile errors with int. 

        int a1 = (int) a; // This poriton turns double values from above into integers. 
        int b1 = (int) b;
        int c1 = (int) c;
        int d1 = (int) d;
        int e1 = (int) e;
        int f1 = (int) f;
        
        System.out.println("Play this combination, it'll make you rich: " + a1 + " " + b1 + " " + c1 + " " + d1 + " " + e1 + " " + f1);
        
    }
}

