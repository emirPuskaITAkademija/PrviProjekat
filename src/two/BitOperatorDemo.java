package two;

public class BitOperatorDemo {
    public static void main(String[] args) {
        int x = 2;
        x = x << 3;// x = x * 2 na 3
        System.out.println("Pomjeraj u lijevo za 1: " + x);
        x = 16;
        x = x >> 2; // x = x / 2 na 1
        System.out.println("Pomjer u desno : " + x);
    }
}
