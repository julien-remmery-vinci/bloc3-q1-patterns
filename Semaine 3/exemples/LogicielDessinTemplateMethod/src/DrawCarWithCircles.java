public class DrawCarWithCircles extends DrawCar{

  @Override
  protected Shape createShape(double size, Point point) {
    return new Circle(size, point);
  }
}
