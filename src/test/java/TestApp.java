import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestApp {

	public static void main(String[] args) {
			
			ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
			HelloWorld hello = (HelloWorld) app.getBean("hello");
			System.out.println(hello.getMessage());
			System.out.println("in testing ");
	}

}
