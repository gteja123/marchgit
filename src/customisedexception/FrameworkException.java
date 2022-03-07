package customisedexception;

public class FrameworkException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FrameworkException()
	{
	super();	
	}
	
	public FrameworkException(String exceptionMsg)
	{
		super(exceptionMsg);
	}
	
	
}
