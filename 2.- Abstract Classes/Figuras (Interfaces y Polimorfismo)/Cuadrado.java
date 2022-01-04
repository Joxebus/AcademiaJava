public class Cuadrado implements Figura {
    private double lado;

    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return lado * 4;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}
