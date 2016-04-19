package com.github.burgermannetje.helloworld;

public class App {

	public Object getMessage(String name) {
		if (name == null){
			return "Hello World!";
			
		}
		return "Hello "+ name + "!";
	}

}
