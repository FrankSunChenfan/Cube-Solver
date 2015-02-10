package processing;
/**
 * This class is used to store all the cube information.
 * @author chenfs
 *
 */
public class Storage {
	private SixSide current_in;
	
	public Storage(int[][] data) {
		current_in = new SixSide(data);
	}
	
	public void renew(SixSide newData) {
		current_in = new SixSide(newData);
	}
	
	public SixSide getStorage() {
		return current_in;
	}
}
