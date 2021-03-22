package Lab8;

public class NumberNew {
    private double number;

    public NumberNew() {
        setValue((double) (Math.random() * 100));
    }

    public NumberNew(double n) {
        setValue( n );
    }

    public void setValue(double n){
        number = n;
    }

    public double getValue(){
        return(number);
    }

    public String toString(){
        return(Double.toString(getValue()));
    }

    public void add(double n) {
        setValue( getValue() + n);
    }

    public void subtract(double n) {
        setValue( getValue() - n);
    }

    public void multiply(double n) {
        setValue( getValue() * n);
    }

    public void divide(double n) {
        setValue( getValue() / n);
    }

    public void sqrt(double n){
        setValue((double)Math.sqrt(getValue()));
    }

    public void percent(double n){
        setValue((getValue()*n)/100);
    }

    public void pm(double n){
        if(n<0){
            setValue(Math.abs(n));
        }else{
            setValue(n-n-n);
        }
    }
}
