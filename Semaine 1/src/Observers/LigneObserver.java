package Observers;

public class LigneObserver implements Observer{
  private int nbOccurences = 0;

  @Override
  public void update(String ligne) {
    nbOccurences++;
  }
  @Override
  public void afficherOccurences() {
    System.out.println("Il y avait " + nbOccurences + " lignes.");
  }
}
