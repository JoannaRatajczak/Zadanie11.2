package TreeOfShapes;

public class Cube extends Shape3d {

    private double sideLenght;

    public Cube(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    public double getSideLenght() {
        return sideLenght;
    }

    public void setSideLenght(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "sideLenght=" + sideLenght +
                '}';
    }
}

