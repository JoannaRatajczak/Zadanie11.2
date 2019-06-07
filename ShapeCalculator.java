import TreeOfShapes.Circle;
import TreeOfShapes.Rectangle;
import TreeOfShapes.Ball;
import TreeOfShapes.Cube;
import TreeOfShapes.Line2d;

public class ShapeCalculator implements Calc2d, Calc3d {


    public double circleArea(Circle circle) {

        return Math.PI * Math.pow(circle.getR(), 2);
    }

    public double rectangleArea(Rectangle rectangle) {

        return rectangle.getSideA()*rectangle.getSideB();
    }

    public double lineLenght(Line2d line){

        return Math.sqrt(Math.pow((line.getX1()-line.getX2()),2)+Math.pow((line.getY1()-line.getY2()),2));
    }

    public double ballVolume(Ball ball) {

        return Math.PI * Math.pow(ball.getR(), 3) * (4 / 3);
    }

    public double cubeVolume(Cube cube) {

        return Math.pow(cube.getSideLenght(), 3);
    }

}
