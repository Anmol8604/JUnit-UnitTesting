package Example2;

import javax.naming.spi.DirStateFactory.Result;
//import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class runner {
	public static void main(String[] args) {
		org.junit.runner.Result result = JUnitCore.runClasses(Code.class);
		for(Failure fail : result.getFailures()) {
			System.out.print(fail.toString());
		}
		System.out.print("Result==" + result.wasSuccessful());
	}
}
