package fr.diginamic.factorymethod.beans;

/**
 * @author RichardBONNAMY
 *
 */
public abstract class ObjetConnecte {

	/** limiteVolts */
	private int limiteVolts;

	/** Constructeur
	 * @param limiteVolts
	 */
	public ObjetConnecte(int limiteVolts) {
		super();
		this.limiteVolts = limiteVolts;
	}

	/** Getter
	 * @return the limiteVolts
	 */
	public int getLimiteVolts() {
		return limiteVolts;
	}

	/** Setter
	 * @param limiteVolts the limiteVolts to set
	 */
	public void setLimiteVolts(int limiteVolts) {
		this.limiteVolts = limiteVolts;
	}
	
}
