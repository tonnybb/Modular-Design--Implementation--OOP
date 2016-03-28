package week10;

/**
 * This is an abstract class that is meant to be inherited from into a concrete 
 * class that implements a sorting algorithm.
 * @author Tonny Boesenbaek
 *
 */
public abstract class AbstractSort {
	private String m_name;
	
	/**
	 * The class constructor. 
	 * The constructor takes one parameter: the name of the sorting algorithm.
	 * @param name The name of the sorting algorithm.
	 */
	public AbstractSort(String name){
		m_name = name;
	}
	
	/**
	 * Abstract sort method that must be implemented concretely by classes inheriting from this abstract class.
	 * @param array The array to sort.
	 * @return The sorted array.
	 */
	public abstract int[] sort(int[] array);
}