package eckel.ch3;

public class TestFraction {
    public static void main(String[] args) {
        Fraction fr1 = new Fraction(-13,4);
        Fraction fr2 = new Fraction(-3,30);

        System.out.println("fr1=" + fr1.showFraction() + " fr2=" + fr2.showFraction());

        System.out.println(fr1.showFraction() + " + " + fr2.showFraction() + " = " + Fraction.summFraction(fr1,fr2).showFraction());
        System.out.println(fr1.showFraction() + " - " + fr2.showFraction() + " = " + Fraction.minusFraction(fr1,fr2).showFraction());
        System.out.println(fr1.showFraction() + " * " + fr2.showFraction() + " = " + Fraction.multiplyFraction(fr1,fr2).showFraction());
        System.out.println(fr1.showFraction() + " / " + fr2.showFraction() + " = " + Fraction.divisionFraction(fr1,fr2).showFraction());

        System.out.println(fr1.showFraction() + " + " + 7 + " = " + Fraction.summFraction(fr1,7).showFraction());
        System.out.println(fr1.showFraction() + " - " + 14 + " = " + Fraction.minusFraction(fr1,14).showFraction());
        System.out.println(fr1.showFraction() + " * " + 24 + " = " + Fraction.multiplyFraction(fr1,18).showFraction());
        System.out.println(fr1.showFraction() + " / " + -37 + " = " + Fraction.divisionFraction(fr1,-37).showFraction());

    }
}
