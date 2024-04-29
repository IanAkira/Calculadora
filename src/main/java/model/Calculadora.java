package model;

public class Calculadora {

    private double numA;
    private double numB;

    public Calculadora() {
        this(0, 0);
    }

    public Calculadora(double numA, double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    public double getSoma() {
        return numA + numB;
    }

    public double getSubtracao() {
        return numA - numB;
    }

    public double getMultiplicacao() {
        return numA * numB;
    }

    public double getDivisao() {
        return numA / numB;
    }

}
