// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Assignment04;

public class Triangle extends Shape {
    private float length;

    public Triangle() {
        super();
        length = 0f;
    }
    public Triangle(float w, float h, float l) {
        super(w, h);
        length = l;
    }

    float calcArea() { 
        double s = (super.getWidth() + super.getHeight() + length) / 2;
        s = s * ((s - super.getWidth()) * (s - super.getHeight()) * (s - length));
        s = Math.sqrt(s);
        /*
            Couldn't find an easy way to convert this to float,
            and the calcArea() method needed to return float from Shape
        */
        return (float) s;
    }

    float calcPerimeter() {
        return (super.getWidth() + super.getHeight() + length);
    }

    public String toString() {
        return "Triangle Width = " + super.getWidth() + ", Height = " + super.getHeight() + ", Length = " + length + ", Perimeter = " + calcPerimeter() + ", Area = " + calcArea();
    }
}
