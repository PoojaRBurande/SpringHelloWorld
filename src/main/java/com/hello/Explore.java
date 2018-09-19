package com.hello;

import org.springframework.stereotype.Component;

@Component
public class Explore implements World{
	
	public void print(){
		System.out.println("in print of Explore ");
	}
	public void enjoy() {
		System.out.println("Exploring new things here.. i'm Loving it!");
	}

}
