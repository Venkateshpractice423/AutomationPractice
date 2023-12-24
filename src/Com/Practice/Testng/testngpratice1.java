package Com.Practice.Testng;
/**
 * @author Venkatesh
 */

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngpratice1 {

	@Test
	public void practise() {
		System.out.println("print");
	}
	
	@BeforeMethod
	public void pre() {
		System.out.println("before");
	}
}
