package fr.diginamic.tp_grasps.beans;


/**
 * @author RichardBONNAMY
 *
 */
public class TypeReservation {

	/** id */
	private Long id;
	
	/** type de spectacle */
	private String type;
	
	/** Montant de la réservation */
	private double montant;
	
	/** reduction en % uniquement pour les clients premium */
	private double reductionPourcent;

	public TypeReservation() {
		super();
	}

	public TypeReservation(String type, double montant, double reductionPourcent) {
		super();
		this.type = type;
		this.montant = montant;
		this.reductionPourcent = reductionPourcent;
	}

	/** Getter
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/** Setter
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/** Getter
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/** Setter
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/** Getter
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/** Setter
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/** Getter
	 * @return the reductionPourcent
	 */
	public double getReductionPourcent() {
		return reductionPourcent;
	}

	/** Setter
	 * @param reductionPourcent the reductionPourcent to set
	 */
	public void setReductionPourcent(double reductionPourcent) {
		this.reductionPourcent = reductionPourcent;
	}
}
