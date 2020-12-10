package fr.diginamic.factorymethod.factory;

import fr.diginamic.factorymethod.beans.Casque;
import fr.diginamic.factorymethod.beans.CasqueAudio;
import fr.diginamic.factorymethod.beans.EnceinteConnecte;
import fr.diginamic.factorymethod.beans.ObjetConnecte;
import fr.diginamic.factorymethod.beans.Oreillette;
import fr.diginamic.factorymethod.beans.Tablette;
import fr.diginamic.factorymethod.beans.TelephonePortable;
import fr.diginamic.factorymethod.beans.TypeCasque;
import fr.diginamic.factorymethod.beans.TypeObjetConnecte;

public class ObjetConnecteFactory implements IObjetConnecteFactory {

	@Override
	public ObjetConnecte getInstance(TypeObjetConnecte type, int limiteVolts) {
		
		if (type==null) {
			return null;
		}
		
		ObjetConnecte objet = null;
		switch (type) {
		case TEL:
			objet = new TelephonePortable(limiteVolts);
			break;
		case TAB:
			objet = new Tablette(limiteVolts);
			break;
		case EIN:
			objet = new EnceinteConnecte(limiteVolts);
			break;
		default:
			break;
		}
		return objet;
	}
	
	public Casque getInstance(TypeCasque type) {
		
		if (type==null) {
			return null;
		}
		
		Casque objet = null;
		switch (type) {
		case ORE:
			objet = new Oreillette();
			break;
		case CAD:
			objet = new CasqueAudio();
			break;
		default:
			break;
		}
		return objet;
	}
}
