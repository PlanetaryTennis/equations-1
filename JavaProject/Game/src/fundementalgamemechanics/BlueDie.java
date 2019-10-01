package fundementalgamemechanics;

//This is the red die it contains a '0','1','2','3','�', and '�' sides.

public class BlueDie extends Die{
	
	public final static char[] BLUESIDES = new char[] {'0','1','2','3','�','�'};
	
	BlueDie() {
		roll();
	}
	
	public void roll() {
		roll(BLUESIDES);
	}
}
