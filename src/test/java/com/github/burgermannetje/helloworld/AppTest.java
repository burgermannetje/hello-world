package com.github.burgermannetje.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void getMessage() throws Exception {
		App app = new App();
		
		String name = "Jeroen";
		assertEquals(app.getMessage(name), "Hello Jeroen!");
	}

	@Test
	public void getMessageTjeerd() throws Exception {
		App app = new App();
		
		String name = "Tjeerd";
		assertEquals(app.getMessage(name), "Hello Tjeerd!");
	}
	
	@Test
	public void getMessageNull() throws Exception {
		App app = new App();
		
		String name = null;
		assertEquals(app.getMessage(name), "Hello World!");
	}

}