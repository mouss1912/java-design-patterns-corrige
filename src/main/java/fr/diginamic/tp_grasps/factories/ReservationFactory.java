package fr.diginamic.tp_grasps.factories;

import java.time.LocalDateTime;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.services.IReservationService;
import fr.diginamic.tp_grasps.services.ReservationService;
import fr.diginamic.tp_grasps.utils.DateUtils;

public class ReservationFactory {
	
	private static IReservationService reservationService = new ReservationService();

	public static Reservation getInstance(Client client, TypeReservation type, String dateReservationStr, int nbPlaces) {
		
		LocalDateTime dateReservation = DateUtils.toDate(dateReservationStr);
		
		Reservation reservation = new Reservation(dateReservation);
		reservation.setNbPlaces(nbPlaces);
		reservation.setClient(client);
		reservation.setTotal(reservationService.calculMontant(type, nbPlaces, client.isPremium()));
		return reservation;
	}
}
