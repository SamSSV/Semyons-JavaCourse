import java.util.Scanner;

public class Test {

    public static String getPriseOfPurchase(double prise, double waight) {
         String a = Double.toString(prise * waight);
         return a;
    }


    public static void main(String[] args) {

        double pechenkiPrise;
        double konfetiPrise;

        System.out.println("Please enter the price of 1 kg of pechenki and 1 kg of konfeti");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the price of 1 kg of pechenki");
        pechenkiPrise = Double.parseDouble(sc.nextLine());
        System.out.println("Please enter the price of 1 kg of konfeti");
        konfetiPrise = Double.parseDouble(sc.nextLine());

        String a = getPriseOfPurchase(pechenkiPrise, 0.3);
        String b = getPriseOfPurchase(konfetiPrise, 0.4);
        String c = getPriseOfPurchase(konfetiPrise, 6);
        String d = getPriseOfPurchase(pechenkiPrise, 5.4);


        System.out.printf("the price of 0.3 kg pechenki: %s %n", a);
        System.out.printf("the price of0.4 kg pechenki: %s %n", b);
        System.out.printf("the prise of 6 kg konfeti is %s and 5.4 kg pechenki is %s", c, d);

    }

}
