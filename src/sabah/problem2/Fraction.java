package sabah.problem2;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
    public String displayFraction(){
        return numerator +"/" + denominator;
    }

    private double getFraction(){
        return (double) numerator/denominator;
    }

    public boolean equals(Fraction f){
        return (f.getFraction() == (double) this.numerator/this.denominator);
    }
}
