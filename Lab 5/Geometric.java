public class Geometric extends AbstractSeries {

    // instance variables
    double term = -1;
    double summ = 0;

    public double next() {

        // implement the method
        summ += Series();
        return summ;
    }

    public double Series() {
        term++;
        return (1/(Math.pow(2,term)));
    }
}