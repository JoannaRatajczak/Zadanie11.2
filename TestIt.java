import TreeOfShapes.*;

public class TestIt {

    public static void main(String[] args) {

        ShapeCalculator shapeCalculator = new ShapeCalculator();

        //Shape[] shape = new Shape[5];
        Line2d lineTest = new Line2d(2, 1, 2, 1);

        System.out.println(lineTest.toString());
        System.out.println("Lenght"+shapeCalculator.lineLenght(lineTest));

        Rectangle rectangleTest = new Rectangle(2,2);
        System.out.println(rectangleTest.toString());
        System.out.println(shapeCalculator.rectangleArea(rectangleTest));

        Circle circleTest = new Circle(2);
        System.out.println(circleTest.toString());
        System.out.println(shapeCalculator.circleArea(circleTest));

        Ball ballTest = new Ball(2);
        System.out.println(ballTest.toString());
        System.out.println(shapeCalculator.ballVolume(ballTest));

        Cube cubeTest = new Cube(2);
        System.out.println(cubeTest.toString());
        System.out.println(shapeCalculator.cubeVolume(cubeTest));


    }
}
