import Observers.Observer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AnalyseurDeTexte {
	private final ArrayList<Observer> observers;

	public AnalyseurDeTexte() {
		this.observers = new ArrayList<>();
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void lireFichier(String nomFichier) throws IOException {
		BufferedReader lecteurAvecBuffer = null;
		String ligne;
		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader(nomFichier));
		} catch (FileNotFoundException e) {
			System.out.println("Erreur d'ouverture");
		}
		while ((ligne = lecteurAvecBuffer.readLine()) != null) {
			for (Observer observer : observers) {
				observer.update(ligne);
			}
		}
		lecteurAvecBuffer.close();
		for (Observer observer : observers) {
			observer.afficherOccurences();
		}
	}
}
