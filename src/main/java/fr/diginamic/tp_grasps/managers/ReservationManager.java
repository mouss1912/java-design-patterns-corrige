package fr.diginamic.tp_grasps.managers;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.IClientDao;
import fr.diginamic.tp_grasps.daos.ITypeReservationDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;
import fr.diginamic.tp_grasps.factories.ReservationFactory;

/** Classe qui exécute tous les cas d'utilisation de l'application liés aux réservations.
 * @author RichardBONNAMY
 *
 */
public class ReservationManager implements IReservationManager {
	
	/** DAO permettant d'accéder à la table des clients */
	private IClientDao clientDao = new ClientDao();
	
	/** DAO permettant d'accéder à la table des types de réservation */
	private ITypeReservationDao typeReservationDao = new TypeReservationDao();

	/** Cas d'utilisation qui créé une réservation à partir des paramètres suivants
	 * @param identifiantClient identifiant du client
	 * @param typeReservation type de réservation
	 * @param dateReservationStr date de réservation
	 * @param nbPlaces nombre de place
	 * @return Reservation
	 */
	public Reservation creerReservation(String identifiantClient, String typeReservation, String dateReservationStr, int nbPlaces) {
		
		// 1) Extraction de la base de données des informations client
		Client client = clientDao.extraireClient(identifiantClient);

		// 2) Extraction de la base de données des infos concernant le type de la
		// réservation
		TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);

		// 3) Création de la réservation
		Reservation reservation = ReservationFactory.getInstance(client, type, dateReservationStr, nbPlaces);

		// 4) Ajout de la réservation au client
		client.addReservation(reservation);

		return reservation;
	}
}
