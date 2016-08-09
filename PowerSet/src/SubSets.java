import java.util.ArrayList;

public class SubSets {

	ArrayList<ArrayList<Integer>> findSubSets(int[] arr, int index) {
		ArrayList<ArrayList<Integer>> subSets;
		if (index == arr.length) {
			subSets = new ArrayList<ArrayList<Integer>>();
			subSets.add(new ArrayList<Integer>());
			return subSets;
		}

		subSets = findSubSets(arr, index + 1);
		int item = arr[index];
		ArrayList<ArrayList<Integer>> newSubSets = new ArrayList<ArrayList<Integer>>();
		for (ArrayList<Integer> list : subSets) {
			ArrayList<Integer> newList = new ArrayList<Integer>(list);
			newList.add(item);
			newSubSets.add(newList);
		}
		subSets.addAll(newSubSets);

		return subSets;

	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3 };
		SubSets ss = new SubSets();
		ArrayList<ArrayList<Integer>> subSets = ss.findSubSets(arr, 0);

		for (ArrayList<Integer> list : subSets) {
			System.out.print(list);
		}

	}

}
