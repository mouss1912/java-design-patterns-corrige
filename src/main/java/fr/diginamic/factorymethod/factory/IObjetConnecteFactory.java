package fr.diginamic.factorymethod.factory;

import fr.diginamic.factorymethod.beans.ObjetConnecte;
import fr.diginamic.factorymethod.beans.TypeObjetConnecte;

public interface IObjetConnecteFactory {

	ObjetConnecte getInstance(TypeObjetConnecte type, int limiteVolts);
}
