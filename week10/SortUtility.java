package week10;

/**
 * This class sorts an array of integers and times how long it took.
 * @author Tonny Boesenbaek
 *
 */
public class SortUtility {
	private SORT_ALGORITHM_TYPE m_sortAlgorithmType;
	private StopWatch m_timer;

	/**
	 * Constructor of SortUtility class. 
	 * Instantiates an instance of StopWatch().
	 */
	public SortUtility() {
		m_timer = new StopWatch();
	}
	
	/**
	 * This method will time how long it takes to sort an array of integers
	 * and call a method to sort the array.
	 * @param array The array to be sorted.
	 * @param sortAlgorithmType The sorting algorithm to be used.
	 * @return The sorted array.
	 * @throws NotImplementedException If the sorting algorithm has not been implemented, NotImplementedException
	 * will be thrown.
	 */
	public int[] sort(int[] array, SORT_ALGORITHM_TYPE sortAlgorithmType) throws NotImplementedException {
		int[] sortedArray;

		// Start the timer
		m_timer.start();

		// Sort the array
		sortedArray = getSortAlgorithm(sortAlgorithmType).sort(array);

		// Stop the timer
		m_timer.stop();

		return sortedArray;
	}

	/**
	 * This method returns the time it took to sort the array.
	 * @return The time it took to sort the array.
	 */
	public long getElapsedTime() {
		return m_timer.getElapsedTimeMiliseconds();
	}

	/**
	 * This method will return an instance of the appropriate sorting algorithm.
	 * @param sortAlgorithmType The sorting algorithm chosen for the sort.
	 * @return An instance of the chosen sorting algorithm.
	 * @throws NotImplementedException If the sorting algorithm has not been implemented, NotImplementedException
	 * will be thrown.
	 */
	public AbstractSort getSortAlgorithm(SORT_ALGORITHM_TYPE sortAlgorithmType) throws NotImplementedException {
		AbstractSort sortMethod = null;

		switch (sortAlgorithmType) {
		case SELECTION:
			sortMethod = new SelectionSort(sortAlgorithmType.toString());
			break;
		case QUICK:
			sortMethod = new QuickSort(sortAlgorithmType.toString());
			break;
		default:
			throw new NotImplementedException("The selected sorting algorithm has not been implemented.");
		}

		return sortMethod;
	}
}
