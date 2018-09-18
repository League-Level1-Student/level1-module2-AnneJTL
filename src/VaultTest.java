import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VaultTest {
	
	@Test
	 public void test() {
		Vault test = new Vault(125);
		
		System.out.println("test 120: " + test.tryCode(120));
		assertEquals(false, test.tryCode(120));

		System.out.println("test 125: " + test.tryCode(125));
		assertEquals(true, test.tryCode(125));

		System.out.println("test 130: " + test.tryCode(130));
		assertEquals(false, test.tryCode(130));

	}

}
