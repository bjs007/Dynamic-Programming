import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class cell {
	int x;
	int y;

	cell(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class RobotMovement {
	ArrayList<cell> path;
	HashMap<cell, Boolean> failedPoint;

	RobotMovement(int r, int c) {
		path = new ArrayList<cell>();
		failedPoint = new HashMap<cell, Boolean>();

	}

	boolean findPath(int r, int c) {
		if (r < 0 || c < 0)
			return false;
		else if (r == 0 && c == 0)
			return true;
		else if (failedPoint.containsKey(new cell(r, c)))
			return false;
		else {
			boolean isPath = findPath(r - 1, c) || findPath(r, c - 1);

			if (isPath == true) {
				path.add(new cell(r, c));
				return isPath;
			} else {
				failedPoint.put(new cell(r, c), false);
				return false;
			}
		}
	}

	public static void main(String args[]) {
		RobotMovement rm = new RobotMovement(3, 3);
		rm.findPath(3, 3);
		for (cell c : rm.path) {
			System.out.println(c.x + " " + c.y);
		}
	}

}

/*
 * Time complexity is : O(2 ^ r + c)
 * 
 */
