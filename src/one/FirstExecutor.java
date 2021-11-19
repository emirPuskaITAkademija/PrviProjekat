package one;

import six.Movie;

/**
 *   TIPOVI :
 *    1. PROSTI
 *        1.1 byte(8-bit)
 *        1.2 short(16-bit) -32768 0 32 767
 *        1.3 int(32)
 *
 *    2. SLOŽENI
 */
public class FirstExecutor {
    public static void main(String[] args) {
        //cijele brojeve : byte,  short, int, long
        //char
        //decimalni brojevi : float, double
        //boolean : false ili true
        //TIP_PODATKA ime_memorijske(varijabla) = VRIJEDNOST;
        int broj1 = 23;
        int broj2 = 13;
        int suma = broj1+broj2;
        System.out.println("SUMA: " + suma);

        //-128 0  127
        byte broj3 = 127;
        short broj4 = -32768;
        int number = 32769;
    }
}
