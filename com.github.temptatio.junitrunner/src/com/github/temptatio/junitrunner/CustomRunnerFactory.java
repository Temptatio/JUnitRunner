package com.github.temptatio.junitrunner;

import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.parameterized.ParametersRunnerFactory;
import org.junit.runners.parameterized.TestWithParameters;

public class CustomRunnerFactory implements ParametersRunnerFactory {

	@Override
	public Runner createRunnerForTestWithParameters(TestWithParameters test) throws InitializationError {
		String s = String.format("Create customized test runner\n");
		System.out.print(s);
		return new CustomParameterizedRunner(test);
	}

}
