package proje.enocaproje.core.utulities.result;

public class Result {

	private String message;
	private boolean success;
	
	
	public Result(boolean success) {
		
		this.success=success;
	}
	
	public Result(boolean success,String message) {
		
		this.success=success;
		this.message=message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	public String getMessage() {
		return message;
	}
	
}
