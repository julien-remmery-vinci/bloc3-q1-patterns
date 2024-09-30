public class CircleAbstractFactory implements AbstractFactory {

  @Override
  public Shape createShape(double diameter, Point center) {
    return new Circle(diameter, center);
  }
}
