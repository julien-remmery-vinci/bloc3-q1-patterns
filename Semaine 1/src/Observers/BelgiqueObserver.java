package Observers;

public class BelgiqueObserver implements Observer{
  private int nbOccurences = 0;

  @Override
  public void update(String ligne) {
    if (ligne.contains("Belgique")) {
      nbOccurences++;
    }
  }
  @Override
  public void afficherOccurences() {
    System.out.println("Il y avait " + nbOccurences + " lignes contenant Belgique.");
  }
}
