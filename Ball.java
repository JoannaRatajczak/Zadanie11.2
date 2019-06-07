package TreeOfShapes;

public class Ball extends Shape3d {

    private double r;

    public Ball(int r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "r=" + r +
                '}';
    }
}

