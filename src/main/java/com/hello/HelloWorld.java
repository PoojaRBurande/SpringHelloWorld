package com.hello;
import org.springframework.stereotype.Component;


@Component
public class HelloWorld implements World{
	private String message;
	
	public HelloWorld(){
		System.out.println("in HelloWorld constructor");
	}
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}
	public void enjoy() {
		System.out.println("Just Born in this Java World! lalalala");
	}
}
