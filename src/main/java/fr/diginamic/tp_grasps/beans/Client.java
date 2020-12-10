package fr.diginamic.tp_grasps.beans;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String identifiantClient;
	
	private boolean premium;
	
	private List<Reservation> reservations = new ArrayList<>();
	
	public Client() {
		
	}

	public Client(String identifiantClient, boolean premium) {
		super();
		this.identifiantClient = identifiantClient;
		this.premium = premium;
	}
	
	public void addReservation(Reservation res) {
		reservations.add(res);
	}

	/** Getter
	 * @return the identifiantClient
	 */
	public String getIdentifiantClient() {
		return identifiantClient;
	}

	/** Setter
	 * @param identifiantClient the identifiantClient to set
	 */
	public void setIdentifiantClient(String identifiantClient) {
		this.identifiantClient = identifiantClient;
	}

	/** Getter
	 * @return the premium
	 */
	public boolean isPremium() {
		return premium;
	}

	/** Setter
	 * @param premium the premium to set
	 */
	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	/** Getter
	 * @return the reservations
	 */
	public List<Reservation> getReservations() {
		return reservations;
	}

	/** Setter
	 * @param reservations the reservations to set
	 */
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
}
