public class ShapeManagementApp {

    public static void main(String[] args) {

        Shape[] shapes = {

            new Circle(5, "Red"),
            new Rectangle(4, 6, "Blue"),
            new Square(4, "Green"),
            new Circle(3, "Yellow"),
            new Rectangle(7, 2, "Black")

        };


        double totalArea = 0;
        double totalPerimeter = 0;
        double largestArea = 0;
        Shape largest = null;

        for (Shape shape : shapes) {

            System.out.println(shape);

            shape.area();
            shape.perimeter();
            double a = shape.getArea();
            double p = shape.getPerimeter();

            System.out.println("Area: " + a);
            System.out.println("Perimeter: " + p);
            System.out.println();

            totalArea += a;
            totalPerimeter += p;

            if (a > largestArea) {
                largestArea = a;
                largest = shape;
            }
        }

        System.out.println("Total Area: " + totalArea);
        System.out.println("Total Perimeter: " + totalPerimeter);
        System.out.println("Largest Shape: " + largest);
        System.out.println("Largest Area: " + largestArea);
        Shape s=new Circle(5,"red");
        Circle c=(Circle)s;
        c.setRadius(10);
        c.area();
        c.perimeter();

    }
}