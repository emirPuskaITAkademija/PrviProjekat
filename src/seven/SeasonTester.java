package seven;

import java.util.Random;

public class SeasonTester {

    public static void main(String[] args) {
//        Random random = new Random();
//        for (; ; ) {
//            System.out.println("Slučajan broj: " + random.nextInt(10));
//        }

        Season season = Season.SPRING;
        //swtich -> int, String
        switch (season) {
            case SPRING:
                System.out.println("Proljeće");
                break;
            case AUTUMN:
                System.out.println("Jesen");
                break;
            case SUMMER:
                System.out.println("Ljeto");
                break;
            case WINTER:
                System.out.println("Zima");
                break;
            default:
                break;
        }
    }
}
