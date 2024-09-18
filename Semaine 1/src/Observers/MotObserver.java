package Observers;

public class MotObserver implements Observer{
  private int nbOccurences = 0;

  @Override
  public void update(String ligne) {
    for (String mot : ligne.trim().split(" ")) {
      nbOccurences++;
    }
  }
  @Override
  public void afficherOccurences() {
    System.out.println("Il y avait " + nbOccurences + " mots.");
  }
}
