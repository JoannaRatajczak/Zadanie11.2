import TreeOfShapes.Circle;
import TreeOfShapes.Rectangle;
import TreeOfShapes.Line2d;

public interface Calc2d {

    double circleArea(Circle circle);

    double rectangleArea(Rectangle rectangle);

    double lineLenght(Line2d line);
}