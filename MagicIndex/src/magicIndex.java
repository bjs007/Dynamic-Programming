
public class magicIndex {

	int findMagicIndex(int arr[], int start, int end) {
		int mid = (start + end) / 2;
		if (start > end)
			return Integer.MAX_VALUE;

		if (arr[mid] == mid)
			return mid;
		else if (arr[mid] > mid)
			return findMagicIndex(arr, start, mid - 1);
		else
			return findMagicIndex(arr, mid + 1, end);
	}

	int findMagicIndexNonDistinct(int[] arr, int start, int end) {
		int mid = (start + end) / 2;
		if (start > end)
			return -1;
		if (arr[mid] == mid)
			return mid;
		int midValue = arr[mid];
		int leftIndex = Math.min(mid - 1, midValue);
		int left = findMagicIndexNonDistinct(arr, start, leftIndex);
		if (left > 0)
			return left;
		int rightIndex = Math.max(midValue + 1, midValue);
		int right = findMagicIndexNonDistinct(arr, rightIndex, end);
		return right;
	}

	public static void main(String args[]) {
		magicIndex mi = new magicIndex();

	}
}
