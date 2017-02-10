package com.github.temptatio.junitrunner;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(Parameterized.class)
@UseParametersRunnerFactory(CustomRunnerFactory.class)
public class ParameterizedTest {

	private final String name;
	private final int i;

	@Parameters(name = "{0}")
	public static Collection<Object[]> initParam() {
		return Arrays.asList(new Object[][] { new Object[] { new String("Test 1"), new Integer(1) },
		        new Object[] { new String("Test 2"), new Integer(2) },
		        new Object[] { new String("Test 3"), new Integer(3) },
		        new Object[] { new String("Test 4"), new Integer(4) } });
	}

	public ParameterizedTest(String name, int i) {
		this.name = name;
		this.i = i;
	}

	@Test
	public void isOdd() {
		assertEquals(1, this.i % 2);
	}
}
