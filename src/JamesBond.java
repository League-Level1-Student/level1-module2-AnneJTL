
public class JamesBond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vault secret = new Vault(7500);
		JamesBond james = new JamesBond();
		
		int test = james.findCode(secret);
		if (test == -1){
			System.out.println("Code non trouvé !!!");
		} else {
			System.out.println("Le code secret est: " + test);
		}
		

	}
	
	public int findCode(Vault secret) {
		for (int i=0; i <= 6000; i++){
			if (secret.getSecretCode() == i)
				return i;
		}
		
		return -1;
	}

}
