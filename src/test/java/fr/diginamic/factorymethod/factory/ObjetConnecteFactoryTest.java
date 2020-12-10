package fr.diginamic.factorymethod.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import fr.diginamic.factorymethod.beans.ObjetConnecte;
import fr.diginamic.factorymethod.beans.Tablette;
import fr.diginamic.factorymethod.beans.TelephonePortable;
import fr.diginamic.factorymethod.beans.TypeObjetConnecte;

public class ObjetConnecteFactoryTest {

	private IObjetConnecteFactory factory = new ObjetConnecteFactory();
	
	@Test
	public void testGetInstance1() {
		
		ObjetConnecte conn = factory.getInstance(TypeObjetConnecte.TEL, 10);
		assertEquals(TelephonePortable.class, conn.getClass());
		assertEquals(10, conn.getLimiteVolts());
	}
	
	@Test
	public void testGetInstance2() {
		ObjetConnecte conn = factory.getInstance(TypeObjetConnecte.TAB, 10);
		assertEquals(Tablette.class, conn.getClass());
		assertEquals(10, conn.getLimiteVolts());
	}
	
	@Test
	public void testGetInstance3() {
		ObjetConnecte conn = factory.getInstance(null, 10);
		assertNull(conn);
	}

}
