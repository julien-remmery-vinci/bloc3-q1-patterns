public class MachineACafe {

	public enum State{
		IDLE{
			@Override
			public void selectionnerBoisson(MachineACafe m, ToucheBoisson toucheBoisson) {
				m.afficherPasAssez(toucheBoisson);
			}

			@Override
			public void rendreMonnaie(MachineACafe m) {
			}
		}, COLLECTE,
		PAS_ASSEZ{
			@Override
			public void selectionnerBoisson(MachineACafe m, ToucheBoisson toucheBoisson) {
				throw new IllegalStateException();
			}

			@Override
			public void entrerMonnaie(MachineACafe m) {
				if (m.boisson.getPrix() > m.montantEnCours) {
					m.afficherPasAssez(m.boisson);
				} else {
					m.setMontantEnCours(m.montantEnCours - m.boisson.getPrix());
					m.afficherBoisson(m.boisson);
					m.setBoisson(null);
					m.afficherMontant();
					if (m.montantEnCours == 0)
						m.setState(IDLE);
					else
						m.setState(COLLECTE);
				}
			}
		};
		public void entrerMonnaie(MachineACafe m){
			m.setState(COLLECTE);
		}
		public void selectionnerBoisson(MachineACafe m, ToucheBoisson toucheBoisson){
			if (toucheBoisson.getPrix() > m.montantEnCours) {
				m.setBoisson(toucheBoisson);
				m.afficherPasAssez(m.boisson);
//				m.setBoisson(toucheBoisson);
				m.setState(PAS_ASSEZ);
				return;
			}
			m.setMontantEnCours(m.montantEnCours - toucheBoisson.getPrix());
			m.afficherBoisson(toucheBoisson);
			m.afficherMontant();
			if (m.montantEnCours == 0)
				m.setState(IDLE);
			else
				m.setState(COLLECTE);
		}
		public void rendreMonnaie(MachineACafe m){
			m.afficherRetour();
			m.setMontantEnCours(0);
			m.setBoisson(null);
			m.setState(IDLE);
		};
	}
	private int montantEnCours = 0;
	private State state;
	private ToucheBoisson boisson = null;

	public MachineACafe() {
		this.state = State.IDLE;
	}
	public void setMontantEnCours(int montantEnCours) {
		this.montantEnCours = montantEnCours;
	}

	public void setBoisson(ToucheBoisson boisson) {
		this.boisson = boisson;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void afficherMontant() {
		System.out.println(montantEnCours + " cents disponibles");
	}
	
	public void afficherRetour() {
		System.out.println(montantEnCours + " cents rendus");
	}
	
	public void afficherPasAssez(ToucheBoisson toucheBoisson) {
		System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
		System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
	}

	public void afficherBoisson(ToucheBoisson toucheBoisson) {
		System.out.println("Voici un " + toucheBoisson);
		
	}

	public void entrerMonnaie(Piece piece) {
		montantEnCours += piece.getValeur();
		afficherMontant();
		state.entrerMonnaie(this);
	}
	
	public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
		state.selectionnerBoisson(this, toucheBoisson);
	}
	
	public void rendreMonnaie() {
		state.rendreMonnaie(this);
	}
}
