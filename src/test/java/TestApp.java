import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hello.HelloWorld;


public class TestApp {

	public static void main(String[] args) {
			
			ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
			HelloWorld hello = (HelloWorld) app.getBean("helloWorld");
			System.out.println(hello.getMessage());
			System.out.println("in testing Annotations");
	}

}
