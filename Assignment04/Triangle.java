// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Assignment04;

public class Triangle extends Shape {
    private float width, height, length;

    public Triangle() {
        super();
        width = super.getWidth();
        height = super.getHeight();
        length = 0f;
    }
    public Triangle(float w, float h, float l) {
        super(w, h);
        width = super.getWidth();
        height = super.getHeight();
        length = l;
    }

    float calcArea() { 
        double s = (width + height + length) / 2;
        // s = (2 + 3 + 4) / 2       -> 4.5
        System.out.println("s1 = " + s);
        s = s * ((s - width) * (s - height) * (s - length));
        System.out.println("s2 = " + s);
        s = Math.sqrt(s);
        System.out.println("s3 = " + s);
        /*
            Couldn't find an easy way to convert this to float,
            and the calcArea() method needed to return float from Shape
        */
        return (float) s;
    }

    float calcPerimeter() {
        return (width + height + length);
    }

    public String toString() {
        return "Triangle Width = " + width + ", Height = " + height + ", Length = " + length + ", Perimeter = " + calcPerimeter() + ", Area = " + calcArea();
    }
}
