package kaszino;

public class Robot extends Jatekos {
	private int id;
	static private int next_id = 0;
	
	@Override
	public String toString() 
	{
		return "Robot" + id;
	}
	
	@Override
	public void lep() 
	{
		System.out.println(toString() + ": Ez a " + asztal.getKor() + ". kör");
	}
}
