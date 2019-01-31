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
        this.result = first / second;
    }

    public void multiple(double first, double second) {
        this.result = first * second;
    }



    public double getResult() {
        return this.result;
    }


}
/*Где проврека на валидность входных данных?
  допустим я на вход в метод который делит где делится подам 0, что тогда будет?
*/