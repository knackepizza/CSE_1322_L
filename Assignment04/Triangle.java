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
        return ((width * height) / 2);
    }

    float calcPerimeter() {
        return (width + height + length);
    }

    public String toString() {
        return "Triangle Width = " + width + ", Height = " + height + ", Length = " + length + ", Perimeter = " + calcPerimeter() + ", Area = " + calcArea();
    }
}
