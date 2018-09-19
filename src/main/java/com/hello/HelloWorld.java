package com.hello;
import org.springframework.stereotype.Component;


@Component
public class HelloWorld {
	private String message;
	
	public HelloWorld(){
		System.out.println("in constructor");
	}
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}
}
