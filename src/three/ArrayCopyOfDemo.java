package three;

import java.util.Arrays;

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        char[] slova = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        slova[2] = 'f';
        char slovo = slova[0];
        char[] odredisniNiz = Arrays.copyOfRange(slova, 2, 9);
        System.out.println(odredisniNiz);
    }
}
