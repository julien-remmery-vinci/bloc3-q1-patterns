package Strategies;

public class CommencePar implements Strategy {
  private final String lettre;

  public CommencePar(String lettre) {
    this.lettre = lettre;
  }

  @Override
  public boolean estValide(String mot) {
    return mot.startsWith(lettre);
  }
}
