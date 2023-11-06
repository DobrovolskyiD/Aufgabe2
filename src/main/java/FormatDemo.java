public class FormatDemo {
    public static void main(String[]  args){
        intFormatDemo(100);
        intFormatDemo(1023);
        intFormatDemo(0xFFF1234);
        intFormatDemo(-3);

        doubleFormatDemo(2.5);
        doubleFormatDemo(3.141592653);
        doubleFormatDemo(1e12);
        doubleFormatDemo(-0.0001234);
    }
    public static void intFormatDemo(int x){
        System.out.println(x);
        System.out.printf("Dezimalzahl mit Vorzeichen: %+d%n", x);
        System.out.printf("8-stellige Hexadezimalzahl: 0x%08X%n", x);
        String binaryNumber = Integer.toBinaryString(x);
        binaryNumber = String.format("%32s", binaryNumber).replace(' ', '0');
        System.out.printf("32-stellige Zahl im Binärsystem: 0b%s%n", binaryNumber);
        System.out.printf("Dezimalzahl in eckigen Klammern (linksbündig): [%-10d]%n", x);
        System.out.printf("Dezimalzahl in eckigen Klammern (rechtsbündig): [%10d]%n", x);
        System.out.println("------------------------------");
    }
    public static void doubleFormatDemo(double d) {
        System.out.println(d);
        System.out.printf("Dezimalzahl mit zwei Stellen hinter dem Komma: %.2f%n", d);
        System.out.printf("Dezimalzahl in wissenschaftlicher Notation: %.2E%n", d);
        System.out.printf("Hexadezimales Exponentialformat: %#25a%n", d);
        System.out.println("------------------------------");
}
}
