package sabah.problem2;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(4,5);
        Fraction f2 = new Fraction(40,50);
        System.out.println(f1.displayFraction());
        System.out.println(f2.displayFraction());
        System.out.println(f1.equals(f2));
    }
}
