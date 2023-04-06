package PracticalTask2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runner {
	public static void main(String[] args) {
		Result res = JUnitCore.runClasses(String.class);
		for(Failure fail : res.getFailures()) {
			System.out.print(fail.toString());
		}
		System.out.print("Result==" + res.wasSuccessful());
	}
}
