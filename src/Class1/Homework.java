package Class1;

public class Homework {
    public static void main(String[] args) {
        double cTemp = 21.11;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println("fTemp = " + fTemp);

        cTemp = 20;
        double kTemp = cTemp + 273.15;
        System.out.println("kTemp = " + kTemp);

        fTemp = 68;
        cTemp = fTemp - 32 * 5 / 9;
        System.out.println("cTemp = " + cTemp);

        fTemp = 50;
        kTemp = fTemp + 459.67 * 5 / 9;
        System.out.println("kTemp = " + kTemp);

        kTemp = 300;
        cTemp = kTemp - 273.15;
        System.out.println("cTemp = " + cTemp);

        kTemp = 400;
        fTemp = kTemp * 9 / 5 - 459.67;
        System.out.println("fTemp = " + fTemp);

        kTemp = 500;
        fTemp = kTemp * 9 / 5 - 459.67;
        System.out.println("fTemp = " + fTemp);

        kTemp = 3000;
        fTemp = kTemp * 9 / 5 - 459.67;
        System.out.println("fTemp = " + fTemp);

        fTemp = 135;
        cTemp = fTemp - 32 * 5 / 9;
        System.out.println("cTemp = " + cTemp);




    }
}
