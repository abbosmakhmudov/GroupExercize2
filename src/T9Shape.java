public interface T9Shape {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea
and calculatePerimiter. Create 2 classes Circle & Square that
implements functionality defined in the Shape Interface. Test your
code
     */
public double calculateArea();
public double calculatePerimiter();
    
}

class Circle implements T9Shape{
    double radius;
    final static double pi=3.14;
    @Override
    public double calculateArea() {
        double circleArea=pi*radius*radius;
        return circleArea;
    }

    @Override
    public double calculatePerimiter() {
        double circlePerimeter=2*pi*radius;
        return circlePerimeter;
    }
}

class Square implements T9Shape{
    double length;
    double width;


    @Override
    public double calculateArea() {
        double squareArea=length*width;
        return squareArea;
    }

    @Override
    public double calculatePerimiter() {
        double squarePerimeter=2*(length+width);
        return squarePerimeter;
    }
}

class T9ShapeTester{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=3.5;
        System.out.println("Area of Circle="+c1.calculateArea());
        System.out.println("Perimeter of Circle="+c1.calculatePerimiter());

        Square s1=new Square();
        s1.length=2.5;
        s1.width=2;
        System.out.println("Area of Square="+s1.calculateArea());
        System.out.println("Perimiter of Square="+s1.calculatePerimiter());
    }
}
