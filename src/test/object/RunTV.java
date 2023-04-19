package test.object;

public class RunTV {

	public static void main(String[] args) {
		TVjava t1 =new TVjava();
		TVjava t2 =new TVjava();
		
		t1.setChannel(7);
		t1.setColor("Silver");
		t1.setPrice(1000000);
		t1.setProducer("LG");
		t1.setSize(70);
		
		t2.setChannel(0);
		t2.setColor("Blue");
		t2.setPrice(700000);
		t2.setProducer(" 삼성");
		t2.setSize(60);
		
		t1.powerOn();
		t1.upChannel();
		t1.upChannel();
		t1.downChannel();
		
		t2.powerOn();
		t2.upChannel();
		t2.upChannel();
		t2.powerOff();

	}

}
