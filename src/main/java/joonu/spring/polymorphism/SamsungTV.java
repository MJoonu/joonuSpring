package joonu.spring.polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("SamsungTV 객체 생성");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("SamsungTV 객체 생성 : 생성자 인젝션");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("SamsungTV 객체 생성 : 생성자 인젝션 - 다중매핑");
		this.speaker = speaker;
		this.price = price;
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker() 메서드 호출");
		this.speaker = speaker;
	}
	
	public void setPrice(int price) {
		System.out.println("setPrice() 메서드 호출");
		this.price = price;
	}
	
	
//	public Speaker getSpeaker() {
//		return speaker;
//	}
//
//	public void setSpeaker(Speaker speaker) {
//		this.speaker = speaker;
//	}
	
	
//	public void start() {
//		System.out.println("객체 초기화 작업 처");
//	}
//	
//	public void stop() {
//		System.out.println("객체 삭제 전에 처리할 로직 처리");
//	}
	
	
	public void powerOn() {
//		System.out.println("Samsung TV power ON");
		System.out.println("Samsung TV power ON (가격 : " + price + ")");
	}
	
	public void powerOff() {
		System.out.println("Samsung TV power OFF");
	}
	
	public void volumeUp() {
//		System.out.println("Samsung TV volume UP");
//		speaker=new SonySpeaker();
//		speaker.volumeUp();
		speaker.volumeUp();
	}
	
	public void volumeDown() {
//		System.out.println("Samsung TV volume DOWN");
//		speaker=new SonySpeaker();
//		speaker.volumeDown();
		speaker.volumeDown();
	}

}