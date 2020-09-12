// Name: Nick Nettleton
// Class: 1322L
// Professor Adeojo

package Assignment04;

public class Shape {
    private float width, height;

    public Shape() {
        width = 0f;
        height = 0f;
    }
    public Shape(float w, float h) {
        width = w;
        height = h;
    }

    float calcArea() {
        return (width * height);
    }

    float calcPerimeter() {
        return (2 * (width + height));
    }

    public String toString() {
        return "Width: " + width + ", Hight: " + height;
    }

    float getWidth() { return width; }
    float getHeight() { return height; }
}
