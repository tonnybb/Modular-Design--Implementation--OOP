package week10;

/**
 * A stop watch class.
 * This class can time events.
 * @author Tonny Boesenbaek
 *
 */
public class StopWatch {
	private long m_startTime;
	private long m_stopTime;
	
	/**
	 * The default constructor.
	 */
	public StopWatch(){}
	
	/**
	 * Start the stop watch.	
	 */
	public void start(){
		m_startTime = System.currentTimeMillis();
	}
	
	/**
	 * Stop the stop watch.
	 */
	public void stop(){
		m_stopTime = System.currentTimeMillis();
	}

	/**
	 * This method returns the start time in miliseconds.
	 * @return The start time in miliseconds.
	 */
	public long getStartTime() {
		return m_startTime;
	}

	/**
	 * This method returns the stop time in miliseconds.
	 * @return The stop time in miliseconds.
	 */
	public long getStopTime() {
		return m_stopTime;
	}
	
	/**
	 * This method returns the elapsed time in miliseconds.
	 * @return The time elapsed in miliseconds.
	 */
	public long getElapsedTimeMiliseconds(){
		return m_stopTime - m_startTime;
	}
	
}
