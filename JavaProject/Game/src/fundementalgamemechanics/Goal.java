package fundementalgamemechanics;

public class Goal extends Mat {
	private String myGoal;
	private int myNumNormalDice;
	
	public Goal() {
		this.addToMyMat(new SpecialDie(2));
	}
	
	public void Read() {
		myGoal = "";
		for(int i = 0;i < this.getMyMat().capacity();i++) {
			if(this.getMyMat().get(i)!=null) {
				myGoal = getMyGoal() + this.getMyMat().get(i).getMyUpSide();
			}
		}
	}
	
	public void addPerenthises() {
		myMat.add(new SpecialDie(0));
		myMat.add(new SpecialDie(1));
	}
	
	@Override
	public void addToMyMat(Die in) {
		myNumNormalDice++;
		myMat.add(in);
	}
	
	public boolean removeDieByIndex(int index) {
		return false;
	}
	
	@Override
	public boolean reorderDice(int firstIndex,int secondIndex) {
		Die first;
		if(firstIndex == 0||secondIndex==0) return false;
		try {
			first = myMat.get(firstIndex);
		} catch ( IndexOutOfBoundsException e ) {
			return false;
		}
		Die second;
		try {
			second = myMat.get(secondIndex);
		} catch ( IndexOutOfBoundsException e ) {
			return false;
		}
		if(firstIndex < secondIndex) {
			secondIndex--;
		}
		myMat.remove(firstIndex);
		myMat.remove(secondIndex);
		myMat.insertElementAt(first, secondIndex);
		myMat.insertElementAt(second, firstIndex);
		return true;
	}
	
	public String getMyGoal() {
		return getMyGoal();		
	}
	
	public int getMyNumNormalDice() {
		return myNumNormalDice;
	}
}