package joonu.spring.polymorphism;

import org.springframework.stereotype.Component;

public class SonySpeaker implements Speaker{

	public SonySpeaker() {
		System.out.println("sony speaker 객체 생");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker - sound up");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker - sound down");
	}
	
}
