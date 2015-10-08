package bruchrechnen;

public class Bruch
{
	// Attribute (Instanz-Variablen)
	private int zaehler;
	private int nenner;
	
	public Bruch(int zaehler, int nenner) throws Exception
	{
		setZaehler(zaehler);
		setNenner(nenner);
	}
	
	@Override
	public String toString()
	{
		return zaehler + "/" + nenner;
	}

	// getter / setter
	public int getNenner()
	{
		return nenner;
	}
	
	public int getZaehler()
	{
		return zaehler;
	}
	
	public void setNenner(int nenner) throws Exception
	{
		if (nenner != 0)
			this.nenner = nenner;
		else
			throw new Exception("Nenner darf nicht 0 sein");
	}
	
	public void setZaehler(int zaehler)
	{
		this.zaehler = zaehler;
	}
	
	public Bruch multiplizieren(Bruch b)
	{
		int neuerZaehler = this.zaehler  * b.zaehler;
		int neuerNenner = this.nenner * b.nenner;
		Bruch b1 = null;
		try
		{
			b1 = new Bruch(neuerZaehler, neuerNenner);
		} catch (Exception e)
		{
			// sollte nicht passieren können
			e.printStackTrace();
		}
		return b1;
	}
	
	public Bruch addieren(Bruch b)
	{
		Bruch neu = null;
		try
		{
			 neu = new Bruch(this.getZaehler()*b.getNenner() + this.getNenner()*b.getZaehler(), 
					this.getNenner() * b.getNenner());
		} catch (Exception e)
		{
			// kann eigentlich nicht passieren
			e.printStackTrace();
		}
		return neu;
	}
	
	public Bruch subtrahieren(Bruch b)
	{
		Bruch neu = null;
		try
		{
			neu = new Bruch(this.getZaehler()*b.getNenner() - this.getNenner()*b.getZaehler(), 
					this.getNenner() * b.getNenner());
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return neu;
	}
	
	public Bruch dividieren(Bruch b) throws Exception
	{
		return new Bruch(b.getNenner()*this.getZaehler(), b.getZaehler()*this.getNenner());
	}
	
	public double dezimal()
	{
		double z = zaehler;
		return z / nenner;	
	}
	

}
