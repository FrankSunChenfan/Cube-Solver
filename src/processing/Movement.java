package processing;

/** 
 * this class handle all the movement
 *
 * @author chenfs
 *
 */
public class Movement {
	private SixSide modifier;
	
	public Movement(Storage current) {
		modifier = current.getStorage();
	}
	
}
