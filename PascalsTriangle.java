/**
 * 
 * @author Tyrone Post
 * 
 * Java solution to sicp exercise 1.12
 */
public class PascalsTriangle {

	public long getElement(int depth, int position) {
		if (depth < 1) {
			throw new IllegalArgumentException("Depth must be greater than 0");
		}
		if (position < 1) {
			throw new IllegalArgumentException("Position must be greater than 0");
		}
		if (position > depth) {
			throw new IllegalArgumentException("Position must not be greater depth");
		}
		if (position == 1 || position == depth) {
			return 1L;
		}
		return getElement(depth-1, position-1) + getElement(depth-1, position);
	}
}
