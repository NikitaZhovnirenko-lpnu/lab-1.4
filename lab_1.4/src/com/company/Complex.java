package com.company;

public class Complex {
    private double real;
    private double image;

    public Complex(double real, double image) {
        this.real = real;
        this.image = image;


    }

    public Complex() {
    }

    public Complex add(Complex complex1, Complex complex2){

    double newReal = complex1.getReal() + complex2.getReal();
    double newImage = complex1.getImage() + complex2.getImage();

    return new Complex(newReal, newImage);
    }

    public Complex sub(Complex complex1, Complex complex2){

    double newReal = complex1.getReal() - complex2.getReal();
    double newImage = complex1.getImage() - complex2.getImage();

    return new Complex(newReal, newImage);
    }

    public Complex mul(Complex complex1, Complex complex2){

    double newReal = complex1.getReal() * complex2.getReal() - complex1.getImage() * complex2.getImage();
    double newImage = complex1.getImage() * complex2.getReal() + complex1.getReal() * complex2.getImage();

    return new Complex(newReal, newImage);
    }

    public Complex div(Complex complex1, Complex complex2){



    double newReal = (complex1.getReal() * complex2.getReal() + complex1.getImage() * complex2.getImage())
    /(complex2.getReal() * complex2.getReal() + complex2.getImage() * complex2.getImage());

    double newImage = (complex1.getImage() * complex2.getReal() - complex1.getReal() * complex2.getImage())
    /(complex2.getReal() * complex2.getReal() + complex2.getImage() * complex2.getImage());


    return new Complex(newReal, newImage);
    }

    public void print () { //форматування виводу
        if(image > 0){
            System.out.print("(" + real + " + " + image + "i" + ")");
        }else if(image < 0){
            System.out.print("(" + real + "" + image + "i" + ")");
        }else{
            System.out.print(real);
        }
    }


    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    @Override
    public String toString() {
        if (getImage() > 0){
            return "(" +
                    "" + real +
                    " + " + image +
                    "i)";
        }
        else if (getImage() < 0){
            return "(" +
                    "" + real +
                    " - " + image * -1 +
                    "i)";
        }
        else {
            return "(" +
                    "" + real +
                    " + " + image +
                    "i)";
        }
    }

}

