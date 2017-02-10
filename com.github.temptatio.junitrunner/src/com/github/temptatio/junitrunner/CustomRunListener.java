package com.github.temptatio.junitrunner;

import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class CustomRunListener extends RunListener {

	@Override
	public void testFailure(Failure failure) throws Exception {
		super.testFailure(failure);
		System.out.println(failure.getMessage());
	}

}
