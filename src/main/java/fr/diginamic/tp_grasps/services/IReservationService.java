package fr.diginamic.tp_grasps.services;

import fr.diginamic.tp_grasps.beans.TypeReservation;

public interface IReservationService {

	double calculMontant(TypeReservation type, int nbPlaces, boolean premium);

}