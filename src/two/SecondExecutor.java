package two;

/**
 * Statically typed:
 * Tipovi podataka:
 * <li>1. Prosti</li>
 * <li>2. Složeni</li>
 *
 *
 * <p><b>Prostih tipova:</b>
 * <ol>
 *
 *
 * <li>1. byte</li>  -128 0 127
 * <li>2. short</li> -32 768     0      32 767
 * <li>3. int</li>
 * <li>4. long</li>
 * <li>5. float</li> 32
 * <li>6. double</li> 64
 * <li>7. char</li>  'r'
 * <li>8. boolean</li> true ili false
 * </ol>
 * </p>
 * <p>
 * TIP varijablom = podatak;
 *
 * <p>
 *     OVO JE NEKI tekst.. <b>SADA IDE BOLDIRANI</b>
 * </p>
 */
public class SecondExecutor {
    public static void main(String[] args) {
        //tip varijabla = podatak;
        byte firstNumber = 127;//8-bitnom
        short secondNumber = 32_767;//16-bitni
        int thirdNumber = 55000;//32-bitni podrazumijevani
        long fourthNumber = 55000L;//64  -> 64


        int intNumber = 32000;
        long longNumber = intNumber;//automatskog

        long longNumber2 = 32000L;// 32000
        int intNumber2 = (int) longNumber2;
        //tip varijabla = podatak
        float floatNumber = 2.3F;
        double doubleNumber = 2.3;
        double decimalNumber = 123.4;
        double decimalNumber2 = 1.234e2;
        System.out.println(decimalNumber);
        System.out.println(decimalNumber2);

        System.out.println();

        int specijalniBroj1 = 26;//dekadni 10 0-9
        System.out.println(specijalniBroj1);
        int specijalniBroj2 = 0x1a;//hex
        System.out.println(specijalniBroj2);
        int specijalniBroj3 = 0b11010;
        System.out.println(specijalniBroj3);

        //char  -> jednostruke navodnike

        char charVar = 87;
        System.out.println(charVar);
        char charVariable = 'a';
        int intNumber3 = charVariable;
        System.out.println(intNumber3);

        //boolean
        boolean condition = true;
        System.out.println(condition);
    }
}
