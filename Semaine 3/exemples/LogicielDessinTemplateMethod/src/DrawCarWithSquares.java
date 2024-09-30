public class DrawCarWithSquares extends DrawCar{

  @Override
  protected Shape createShape(double size, Point point) {
    return new Square(size, point);
  }

}
