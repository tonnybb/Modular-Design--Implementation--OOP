package week10;

/**
 * This class provides an implementation of Quick Sort.
 * @author Tonny Boesenbaek
 *
 */
public class QuickSort extends AbstractSort {

	/**
	 * Constructor of the QuickSort class.
	 * @param name The name of the sorting algorithm.
	 */
	public QuickSort(String name) {
		super(name);
	}

	/**
	 * This method performs the quick sort.
	 * Inspired by: http://www.algolist.net/Algorithms/Sorting/Quicksort
	 * @param The array to sort.
	 * @return The sorted array.
	 */
	@Override
	public int[] sort(int[] array) {
		quickSort(array, 0, array.length-1);
		
		return array;
	}

	private void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

	private int partition(int arr[], int left, int right) {

		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];

		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}

		return i;
	}
}