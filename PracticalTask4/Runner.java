package PracticalTask4;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestCases.class);
		for(Failure fail : result.getFailures()) {
			System.out.print(fail.toString());
		}
		System.out.print("Result==" + result.wasSuccessful());
	}
}
