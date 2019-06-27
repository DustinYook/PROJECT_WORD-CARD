package word;

public class NoMoreQuestionException extends Exception 
{
	public NoMoreQuestionException() 
	{
		super("No question left!");
	}
	
	public NoMoreQuestionException(String message) 
	{
		super(message);
	}
}