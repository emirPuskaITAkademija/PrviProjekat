package two;

/**
 * Unarni operatori:
 * <li> + </li>
 * <li> - </li>
 * <li> ++</li> pre i post
 * <li> -- </li> pre i post
 * <li>  !</li>
 */
public class UnaryDemo {
    public static void main(String[] args) {
        int broj1 = +23;
        System.out.println("Broj 1 sa +: " + broj1);
        broj1 = -broj1;
        System.out.println("Broj 1 sa -: " + broj1);
        broj1 = 23;
        broj1++;// broj1 = broj1+1;
        System.out.println("POST INCREMENT: " + broj1);
        broj1 = 23;
        ++broj1;
        System.out.println("PRE INCREMENT: " + broj1);
        //
        broj1 = 23;
        System.out.println(broj1++);//23   pošalji u konzolu .... uvećaj za 1
        System.out.println(broj1);//24

        broj1 = 23;
        System.out.println(++broj1);// 24 uvećaj za 1 .... šalji u konzolu
        System.out.println(broj1);//24

        //POST dekrement
        broj1 = 23;
        System.out.println(broj1--); // 23
        System.out.println(broj1);//22
        //PRE dekrement
        broj1 = 23;
        System.out.println(--broj1);//22
        System.out.println(broj1);//22

        boolean lav = false;
        System.out.println(!lav);
    }
}
