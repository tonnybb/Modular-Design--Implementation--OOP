package week10;

/**
 * Exception thrown when invalid sorting algorithm is chosen.
 * 
 * @author Tonny Boesenbaek
 * 
 */
public class NotImplementedException extends Exception
{
	/**
	 * Constructs a new exception with null as its detail message.
	 */
    public NotImplementedException(){
    }
	
    /**
     * Constructs a new exception with the specified message for details.
     * @param arg0 the detailed message.
     */
    public NotImplementedException(String arg0)
    {
        super(arg0);
    }

    /**
     * Constructs a new exception with the specified detail message and cause.
     * @param arg0 The detailed messaged.
     * @param arg1 The cause.
     */
    public NotImplementedException(String arg0, Throwable arg1)
    {
        super(arg0, arg1);
    }
}