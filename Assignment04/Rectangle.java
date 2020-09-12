// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Assignment04;

public class Rectangle extends Shape {
    private float width, height;

    public Rectangle() {
        super();
        width = super.getWidth();
        height = super.getHeight();
    }
    public Rectangle(float w, float h) {
        super(w, h);
        width = super.getWidth();
        height = super.getHeight();
    }

    float calcArea() {
        return (width * height);
    }

    float calcPerimeter() {
        return (2 * (width + height));
    }

    public String toString() {
        return "Width = " + width + ", Height = " + height + ", Perimeter = " + calcPerimeter() + ", Area = " + calcArea();
    }
}
