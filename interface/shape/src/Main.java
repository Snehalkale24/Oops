public class Main
{
    public static void main(String args[])
    {
        Shape s1 = new Circle(7);
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Square(5);

        System.out.println("Circle");
        System.out.println("Area = " + s1.getArea());
        System.out.println("Perimeter = " + s1.getPerimeter());

        System.out.println();

        System.out.println("Rectangle");
        System.out.println("Area = " + s2.getArea());
        System.out.println("Perimeter = " + s2.getPerimeter());

        System.out.println();

        System.out.println("Square");
        System.out.println("Area = " + s3.getArea());
        System.out.println("Perimeter = " + s3.getPerimeter());
    }
}