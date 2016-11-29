package reserch;

public abstract class Reserch {
	public int[] array;

	public Reserch(int[] array) {
		super();
		this.array = array;
	}
	
	public abstract int reserch(int value);
	

}
