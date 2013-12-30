package com.swacorp.hellospring;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestGreeter {
	@Test
	public void shouldGreetMeProperly() {
		Greeter greeter = new Greeter();

		assertEquals("Hello world!", greeter.sayHello());
	}
}

