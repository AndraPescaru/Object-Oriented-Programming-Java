package lab2.Task1;

import java.time.format.SignStyle;

public class Complex {

    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(){
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(Complex number) {
        this.real = number.real;
        this.imaginary = number.imaginary;
    }

    public int getReal() {
        return this.real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return this.imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void addWithComplex(Complex number) {
        this.real += number.real;
        this.imaginary += number.imaginary;
    }

    public void showNumber() {
        if (this.imaginary > 0) {
            System.out.printf("%d + i * %d\n",this.real, this.imaginary);
        } else if ( this.imaginary < 0) {
            System.out.printf("%d - i * %d\n",this.real, (-1) * this.imaginary);
        } else {
            System.out.printf("%d\n",this.real);
        }
    }
}
