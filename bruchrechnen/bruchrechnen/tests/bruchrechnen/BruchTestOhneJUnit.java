package bruchrechnen;

public class BruchTestOhneJUnit
{

	public static void main(String[] args) throws Exception
	{
		Bruch a = new Bruch(3, 4);
		Bruch b = new Bruch(2, 3);
		Bruch ergebnis = a.multiplizieren(b);
		
		if (ergebnis.getZaehler() == 6 
				&& ergebnis.getNenner() == 12)
		{
			System.out.println("Test ok");
		}
		else
		{
			System.out.println("Nicht ok:");
			System.out.println(a + " * " + b + " = " + ergebnis);
		}
		
		
		
	}

}
