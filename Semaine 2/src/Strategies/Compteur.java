package Strategies;

public class Compteur implements Strategy {
  private final Strategy strategy;
  private int compteur;

  public Compteur(Strategy strategy) {
    this.strategy = strategy;
    this.compteur = 0;
  }

  @Override
  public boolean estValide(String mot) {
    if (strategy.estValide(mot)) {
      this.compteur++;
      return true;
    }
    return false;
  }

  public void afficherCompteur() {
    System.out.println("Compteur: " + this.compteur);
  }
}
