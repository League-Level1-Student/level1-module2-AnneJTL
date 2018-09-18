
public class Vault {
	private int secretCode;
	
	public Vault(int secretCode){
		this.secretCode = secretCode;
	}
	
	public void setSecretCode(int code){
		this.secretCode = code;
	}
	
	public int getSecretCode() {
		return this.secretCode;
	}
	
	
	public boolean tryCode(int code){
		if (code == secretCode)
			return true;
		
		return false;
	}
	

}
