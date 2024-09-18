package Observers;

public class PalindromeObserver implements Observer {
  private int nbOccurences = 0;

  @Override
  public void update(String ligne) {
    for (String mot : ligne.trim().split(" ")) {
      StringBuffer temp = new StringBuffer(mot);
      if (mot.equals(temp.reverse().toString())) {
        nbOccurences++;
      }
    }
  }
  @Override
  public void afficherOccurences() {
    System.out.println("Il y avait " + nbOccurences + " palindromes.");
  }
}
