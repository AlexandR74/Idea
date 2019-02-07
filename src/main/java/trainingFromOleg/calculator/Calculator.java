/**
 * The task of the training project from Oleg Aryukov
 */


package trainingFromOleg.calculator;


/**
 * The class describes the behavior of the trainingFromOleg.calculator, namely, operations with numbers.
 */


public class Calculator {


    private double result;

    /**
     *
     * @param first
     * @param second
     * method adds two numbers
     */
    public void add(double first, double second) {
        this.result = first + second;
    }


    /**
     *
     * @param first
     * @param second
     *  the method subtracts the second from the first
     */
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
/*Где проврека на валидность входных данных?
  допустим я на вход в метод который делит где делится подам 0, что тогда будет?
*/