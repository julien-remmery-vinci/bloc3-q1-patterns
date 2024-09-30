public class DVDFactory implements AbstractFactory {

    @Override
    public Article createArticle(String name, int anneeDeParution) {
      return new DVD(name, anneeDeParution);
    }
}
