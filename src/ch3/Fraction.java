package ch3;

public class Fraction {

    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;

        if (denominator > 0) {
            this.denominator = denominator;
        }else if (denominator == 0){
            System.out.println("на 0 делить нельзя, знаменатель будет равен 1");
            this.denominator = 1;
        }else{
            this.numerator = -this.numerator;
            this.denominator = -denominator;

        }
    }

    private Fraction(){}

    public String showFraction() {
        return numerator + "/" + denominator;
    }

    public static Fraction summFraction(Fraction a, Fraction b) {
        Fraction result = new Fraction();
        int mod = mod(a.denominator, b.denominator);
        result.denominator = a.denominator * b.denominator / mod;
        result.numerator = a.numerator * b.denominator / mod + b.numerator * a.denominator / mod;
        reduce(result);
        return result;
    }

    public static Fraction minusFraction(Fraction a, Fraction b){
        Fraction result = new Fraction();
        int mod = mod(a.denominator, b.denominator);
        result.denominator = a.denominator * b.denominator / mod;
        result.numerator = a.numerator * b.denominator / mod - b.numerator * a.denominator / mod;
        reduce(result);
        return result;
    }

    public static Fraction multiplyFraction(Fraction a, Fraction b){
        Fraction result = new Fraction();
        result.numerator = a.numerator * b.numerator;
        result.denominator = a.denominator * b.denominator;
        reduce(result);
        return result;
    }

    public static Fraction divisionFraction(Fraction a, Fraction b){
        Fraction result = new Fraction();
        result.numerator = a.numerator * b.denominator;
        result.denominator = a.denominator * b.numerator;
        if (result.denominator < 0){
            result.numerator = - result.numerator;
            result.denominator = - result.denominator;
        }
        reduce(result);
        return result;
    }

    private static void reduce(Fraction fraction){
        int mod = mod(fraction.numerator, fraction.denominator);
        fraction.numerator /= mod;
        fraction.denominator /= mod;
    }

    private static int mod(int a, int b) {
        int result = 1;
        for (int i = Math.abs(Math.min(a, b)); i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                result = i;
                return result;
            }
        }
        return result;
    }

}