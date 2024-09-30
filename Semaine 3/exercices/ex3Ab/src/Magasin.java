import java.util.HashMap;
import java.util.Map;

public class Magasin {
  private final AbstractFactory factory;
  private final Map<String, Article> etagere;

  public Magasin(AbstractFactory factory) {
    this.factory = factory;
    this.etagere = new HashMap<>();
  }

  public void ajouterArticle(String name, int anneeDeParution) {
    Article article = factory.createArticle(name, anneeDeParution);
    etagere.put(name, article);
  }

  public Article retourneArticle(String name) {
    return etagere.get(name);
  }

}
