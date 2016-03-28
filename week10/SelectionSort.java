package week10;

/**
 * This class provides an implementation of Selection Sort.
 * @author Tonny Boesenbaek
 *
 */
public class SelectionSort extends AbstractSort {

	/**
	 * Constructor of the class.
	 * @param name The name of the sorting algorithm.
	 */
	public SelectionSort(String name) {
		super(name);
	}

	/**
	 * This method performs the selection sort.
	 * Inspired by: http://mathbits.com/MathBits/Java/arrays/SelectionSort.htm
	 * @param The array to sort.
	 * @return The sorted array.
	 */
	@Override
	public int[] sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {

			int first = i;

			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[first])
					first = j;
			}

			int temp = array[first];
			array[first] = array[i];
			array[i] = temp;
		}
		
		return array;
	}
}
