package com.hello;

import org.springframework.stereotype.Component;

@Component
public class Explore implements World{

	public void enjoy() {
		System.out.println("Exploring new things here.. i'm Loving it!");
	}

}
