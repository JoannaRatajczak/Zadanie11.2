import TreeOfShapes.Circle;
import TreeOfShapes.Rectangle;
import TreeOfShapes.Ball;
import TreeOfShapes.Cube;

public class ShapeCalculator implements Calc2d, Calc3d {


    public double circleArea(Circle circle) {

        return Math.PI*Math.sqrt(circle.getR());
    }

    public double rectangleArea(Rectangle rectangle) {

        return 0;
    }

    public double ballVolume(Ball ball) {

        return 0;
    }

    public double cubeVolume(Cube cube) {

        return 0;
    }

}
