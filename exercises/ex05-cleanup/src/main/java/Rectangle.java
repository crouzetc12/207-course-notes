/**
 * Exercise.
 Make mvn -P exercises -pl exercises/ex05-cleanup checkstyle:check report
 0 violations.
 *
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Initiates the measures of the rectangle.
   *
   * @param h the heigth of the rectangle
   * @param w the width of the rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
  * Computes the area of the rectangle.
  */
  public double area() {
    return width * height;
  }

  /**
  * Scales the rectangle.
   *
  * @param factor a scalar
  */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Scales the rectangle.
   *
   * @param other a second Rectangle
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
