public class LivreFactory implements AbstractFactory {

  @Override
  public Article createArticle(String name, int anneeDeParution) {
    return new Livre(name, anneeDeParution);
  }
}
