package joonu.spring.polymorphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker{
	
	
	public AppleSpeaker() {
		System.out.println("AppleSpeaker 객체생성.");
	}

	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker - sound up");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker - sound down");
	}
	
	

}
