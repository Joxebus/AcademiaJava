public class Circulo implements Figura {
    private double radio;
    public static final double PI = 3.1416;

    public double area() {
        //return (PI*radio)*(PI*radio);
        return Math.pow((PI * radio), 2);
    }

    public double perimetro() {
        return PI * (radio * 2);
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
}
