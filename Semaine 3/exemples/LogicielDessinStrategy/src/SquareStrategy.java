public class SquareStrategy implements Strategy{

    @Override
    public Shape createShape(double size, Point center) {
      return new Square(size, center);
    }
}
