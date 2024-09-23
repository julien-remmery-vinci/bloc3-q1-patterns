import Strategies.CommencePar;
import Strategies.Compteur;
import Strategies.DeLongueur;
import Strategies.Palindrome;
import Strategies.Strategy;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    Strategy commencerParT = new CommencePar("t");
    Strategy longueur5 = new DeLongueur(5);
    Strategy palindrome = new Palindrome();

    ListerMots listerMots = new ListerMots("test.txt");
    listerMots.imprimerSi(commencerParT);
    listerMots.imprimerSi(longueur5);
    listerMots.imprimerSi(palindrome);

    Compteur commencerParTCompteur = new Compteur(commencerParT);
    listerMots.imprimerSi(commencerParTCompteur);
    commencerParTCompteur.afficherCompteur();
  }
}
