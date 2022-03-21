package joonu.spring.polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	
	@Autowired
//	@Qualifier("apple")
//	@Resource(name="apple")
	private Speaker speaker;
	
	
	
	public void powerOn() {
		System.out.println("LG TV power ON");
		
	}

	
	public void powerOff() {
		System.out.println("LG TV power OFF");
		
	}

	
	public void volumeUp() {
//		System.out.println("LG TV volume UP");
		speaker.volumeUp();
		
	}

	
	public void volumeDown() {
//		System.out.println("LG TV volume DOWN");
		speaker.volumeDown();
	}

}
