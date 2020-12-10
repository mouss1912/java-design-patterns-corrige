package fr.diginamic.tp_grasps.daos;

import java.util.List;
import java.util.Optional;

import fr.diginamic.tp_grasps.beans.TypeReservation;

public class TypeReservationDao implements ITypeReservationDao {
	
	private static TypeReservation[] types = {new TypeReservation("TH", 150.0, 15.0), new TypeReservation("CI", 10.9, 0.0)};
	
	@Override
	public TypeReservation extraireTypeReservation(String type) {
		
		Optional<TypeReservation> opt = List.of(types).stream().filter(t->t.getType().equals(type)).findAny();
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
}
