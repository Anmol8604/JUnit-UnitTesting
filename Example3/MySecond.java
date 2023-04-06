package Example3;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MySecond {
	@Test
	public void testSetup() {
		int reg_no = 12018604;
		String name1 = "My registration no. :" + reg_no;
		String name2 = "My name is : Anmol";
		assertNotEquals(name2, name1);
	}
}
