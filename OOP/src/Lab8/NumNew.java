package Lab8;

import java.text.DecimalFormat;

public class NumNew {
    private double number;
    DecimalFormat df = new DecimalFormat("0.00");

    public NumNew() {
        setValue((double) (Math.random() * 100));
    }

    public NumNew(double n) {
        setValue( n );
    }

    public void setValue(double n){
        number = n;
    }

    public double getValue(){
        return(number);
    }

    public String toString(){
        //return(Double.toString(getValue()));
        return df.format(getValue());
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

    public String toHex(double n) {
        setValue(n);
        int value =(int)(n);
        return (Integer.toHexString(value));
    }

    public void power(double n) {
        setValue((double)Math.pow(10,n));
    }
}
