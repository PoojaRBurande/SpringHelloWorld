import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.constr.Constructor;
import com.hello.Explore;
import com.hello.HelloWorld;
import com.hello.World;


public class TestApp {
  
	public static void main(String[] args) {
			
			ApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
			
			HelloWorld hello = (HelloWorld) app.getBean("helloWorld");
			hello.setMessage("Hie");
			hello.enjoy();
			
			System.out.println("-----------------------");
			
			World wr=(Explore)app.getBean("explore");
			wr.enjoy();
			
			System.out.println("-----------------------");
			
			Constructor Constructor = (Constructor)app.getBean("constructor");
			
	}

}
