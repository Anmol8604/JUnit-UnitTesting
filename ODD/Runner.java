package ODD;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class Runner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Suite1.class);
		for(Failure fail : result.getFailures()) {
			System.out.print(fail.toString());
		}
		System.out.print("Result==" + result.wasSuccessful());
	}
}