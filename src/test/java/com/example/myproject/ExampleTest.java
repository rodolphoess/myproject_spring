package com.example.myproject;

import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class ExampleTest {
	
	private Example example = new Example();
	
	@Test
	public void exampleHello() {
		assertThat(example.home(), CoreMatchers.containsString("Hello World!"));
	}
}
