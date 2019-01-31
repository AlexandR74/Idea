package Calcolator;

public class Calculator {

    private double result;

    public void add(double first, double second) {
        this.result = first + second;
    }

    public void subtract(double first, double second) {
        this.result = first - second;
    }

    public void div (double first, double second) {
        if (second != 0) {
            this.result = first / second;
        }
        this.result = 0.0;
    }

    public void multiple(double first, double second) {
        this.result = first * second;
    }



    public double getResult() {
        return this.result;
    }


}
