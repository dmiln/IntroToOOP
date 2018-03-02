package ch3;

public class TestFraction {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(-13,0);
        Fraction fr2 = new Fraction(-3,30);

        System.out.println("fr1=" + fr1.showFraction() + " fr2=" + fr2.showFraction());
        System.out.println(fr1.showFraction() + " + " + fr2.showFraction() + " = " + Fraction.summFraction(fr1,fr2).showFraction());
        System.out.println(fr1.showFraction() + " - " + fr2.showFraction() + " = " + Fraction.minusFraction(fr1,fr2).showFraction());
        System.out.println(fr1.showFraction() + " * " + fr2.showFraction() + " = " + Fraction.multiplyFraction(fr1,fr2).showFraction());
        System.out.println(fr1.showFraction() + " / " + fr2.showFraction() + " = " + Fraction.divisionFraction(fr1,fr2).showFraction());
    }
}
