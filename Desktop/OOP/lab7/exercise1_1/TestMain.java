package lab7.exercise1_1;

public class TestMain {
    public static void main(String[] args){
        Shape s1 = new Circle(5.5, "red", false);  // Upcast Circle to Shape
        System.out.println(s1);                    // which version?
        System.out.println(s1.getArea());          // which version?
        System.out.println(s1.getPerimeter());     // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
//        System.out.println(s1.getRadius());

        Circle c1 = (Circle)s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

//        Shape s2 = new Shape();

        Shape s3 = new Rectangle(1.0, 2.0, "red", false);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
//        System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle)s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
//        System.out.println(s4.getSide());

// Take note that we downcast Shape s4 to Rectangle,
//  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
//        System.out.println(r2.getSide());
        System.out.println(r2.getLength());

// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}

//Circle{Shape{color='red', filled=false}radius=5.5}
//95.03317777109123
//34.55751918948772
//red
//false
//Circle{Shape{color='red', filled=false}radius=5.5}
//95.03317777109123
//34.55751918948772
//red
//false
//5.5
//Rectangle{Shape{color='red', filled=false}width=1.0, length=2.0}
//2.0
//6.0
//red
//Rectangle{Shape{color='red', filled=false}width=1.0, length=2.0}
//2.0
//red
//2.0
//Rectangle{Shape{color='red', filled=true}width=6.6, length=6.6}
//43.559999999999995
//red
//Rectangle{Shape{color='red', filled=true}width=6.6, length=6.6}
//43.559999999999995
//red
//6.6
//Rectangle{Shape{color='red', filled=true}width=6.6, length=6.6}
//43.559999999999995
//red
//6.6
//6.6