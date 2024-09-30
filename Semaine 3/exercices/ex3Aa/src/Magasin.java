import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {
  private final Map<String, Article> etagere;

  public Magasin() {
    this.etagere = new HashMap<>();
  }

  public void ajouterArticle(String name, int anneeDeParution) {
    Article article = this.creerArticle(name, anneeDeParution);
    etagere.put(name, article);
  }

  protected abstract Article creerArticle(String name, int anneeDeParution);

}
