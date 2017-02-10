package com.github.temptatio.junitrunner;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.InitializationError;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters;
import org.junit.runners.parameterized.TestWithParameters;

public class CustomParameterizedRunner extends BlockJUnit4ClassRunnerWithParameters {

	public CustomParameterizedRunner(TestWithParameters test) throws InitializationError {
		super(test);
		String s = String.format("Construct customized test runner (%s)\n", test.getName());
		System.out.print(s);
	}

	@Override
	public void run(RunNotifier runNotifier) {
		runNotifier.addListener(new CustomRunListener());
		super.run(runNotifier);
	}

}
