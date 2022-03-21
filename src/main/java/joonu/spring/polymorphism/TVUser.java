package joonu.spring.polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
//		TV tv = new LgTV();
//		
//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV) factory.getBean(args[0]);
		
		
		//1. Spring container 구
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
//		//2.Spring container에서 필요한 객체를 요청한다.
		TV tv = (TV) factory.getBean("tv");
		
		//2. Spring container 로부터 필요한 객체를 요청한다.
		
//		TV tv1 = (TV) factory.getBean("tv");
//		TV tv2 = (TV) factory.getBean("tv");
//		TV tv3 = (TV) factory.getBean("tv");
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3. Spring 컨테이너 종료
		factory.close();
		
	}

}
