package stacksAndQueues.Problem1_CTCI_SQ;

public class FullStackException extends Exception{

	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Stack of given number is full";
	}
	
}
