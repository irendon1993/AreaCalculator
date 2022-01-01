public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            double circleArea = (radius * radius) * Math.PI;
            System.out.println("The area of the circle is " + circleArea);
            return circleArea;
        }
    }

    public static double area(double x,double y) {
        if((x < 0) || (y < 0)) {
            return -1;
        } else {
            double rectangleArea = x * y;
            System.out.println("The area of the rectangle is " + rectangleArea);
            return rectangleArea;
        }
    }

}
