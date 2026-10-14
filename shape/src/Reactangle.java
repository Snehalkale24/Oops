class Reactangle extends shape {

    protected double width;
    protected double length;

    // Default Constructor
    public Reactangle() {
        width = 1.0;
        length = 1.0;
    }

    // Parameterized Constructor
    public Reactangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Parameterized Constructor
    public Reactangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Reactangle[" + super.toString()
                + ", width=" + width
                + ", length=" + length + "]";
    }
}