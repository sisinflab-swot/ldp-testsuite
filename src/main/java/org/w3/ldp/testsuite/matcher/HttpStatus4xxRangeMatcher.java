package org.w3.ldp.testsuite.matcher;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.testng.annotations.Factory;

public class HttpStatus4xxRangeMatcher extends TypeSafeMatcher<Integer> {

	@Override
	public void describeTo(Description d) {
		d.appendText("in the 4xx range");
	}

	@Override
	protected boolean matchesSafely(Integer status) {
		return status >= 400 && status <= 499;
	}

	@Factory
	public static Matcher<Integer> is4xxRange() {
		return new HttpStatus4xxRangeMatcher();
	}
}
