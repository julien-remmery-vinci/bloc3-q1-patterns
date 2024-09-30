public class CircleStrategy implements Strategy{

  @Override
  public Shape createShape(double diameter, Point center) {
    return new Circle(diameter, center);
  }
}
