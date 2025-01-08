public class Arithmetic extends AbstractSeries {

    // instance variables
    double term = 0;
    double summ = 0;

    public double next() {

        // implement the method
        summ += Series();
        return summ;
    }

    public double Series() {
        term++;
        return term;
    }
}