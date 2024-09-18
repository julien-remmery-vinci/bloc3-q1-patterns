import Observers.BelgiqueObserver;
import Observers.LigneObserver;
import Observers.MotObserver;
import Observers.Observer;
import Observers.PalindromeObserver;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    AnalyseurDeTexte analyseurDeTexte = new AnalyseurDeTexte();
    Observer belgiqueObserver = new BelgiqueObserver();
    Observer motsObserver = new MotObserver();
    Observer ligneObserver = new LigneObserver();
    Observer palindromeObserver = new PalindromeObserver();
    analyseurDeTexte.addObserver(belgiqueObserver);
    analyseurDeTexte.addObserver(motsObserver);
    analyseurDeTexte.addObserver(ligneObserver);
    analyseurDeTexte.addObserver(palindromeObserver);
    analyseurDeTexte.lireFichier("test.txt");
  }
}
