package bruchrechnen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BruchTest
{
	private Bruch b1;
	private Bruch b2;
	
	
	@Before
	public void setup() throws Exception
	{
		b1 = new Bruch(2, 3);
		b2 = new Bruch(5, 7);
	}

	@Test
	public void testKonstruktor() throws Exception
	{
		Bruch b = new Bruch(3, 4);
		assertEquals(3, b.getZaehler());
		assertEquals(4, b.getNenner());
		
		try
		{
			Bruch a = new Bruch(1, 0);
			fail("Exception erwartet: Nenner darf nicht 0 sein");
			
		} catch(Exception e)
		{
			// absichtlich leer (Exception erwartet)
		}
		
	}

	@Test
	public void testToString()
	{
		assertEquals("2/3", b1.toString());
	}

	@Test
	public void testMultiplizieren()
	{
		Bruch ergebnis = b1.multiplizieren(b2);
		assertEquals(10, ergebnis.getZaehler());
		assertEquals(21, ergebnis.getNenner());
	}

	@Test
	public void testAddieren()
	{
		Bruch ergebnis = b1.addieren(b2);
		assertEquals(29, ergebnis.getZaehler());
		assertEquals(21, ergebnis.getNenner());	
	}

	@Test
	public void testSubtrahieren()
	{
		Bruch ergebnis = b1.subtrahieren(b2);
		assertEquals(-1, ergebnis.getZaehler());
		assertEquals(21, ergebnis.getNenner());		}

	@Test
	public void testDividieren() throws Exception
	{
		Bruch ergebnis = b1.dividieren(b2);
		assertEquals(14, ergebnis.getZaehler());
		assertEquals(15, ergebnis.getNenner());	
	}

	@Test
	public void testDezimal() throws Exception
	{
		Bruch b = new Bruch(3,4);
		assertEquals(0.75,  b.dezimal(), 1e-10);
	}

}
