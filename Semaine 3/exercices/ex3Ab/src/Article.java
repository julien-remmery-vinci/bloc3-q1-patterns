public abstract class Article {
  private final String name;
  private final int anneeDeParution;
  private double prix;

  public Article(String name, int anneeDeParution, double prix){
    this.name=name;
    this.anneeDeParution=anneeDeParution;
    this.prix=prix;
  }
  public String getName() {
    return name;
  }
  public int getAnneeDeParution() {
    return anneeDeParution;
  }
  public double getPrix() {
    return prix;
  }
  public void setPrix(double prix){
    this.prix=prix;
  }
}
