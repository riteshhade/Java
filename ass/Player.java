package ass;

public class Player {

	String name;
	int age;
	String country;
	int total;
	
	public static void main(String[] args) {
		
		PlayerInfo p1 = new PlayerInfo();
		
		p1.read();
		p1.display();
		
		PlayerInfo p2 = new PlayerInfo();
		
		p2.read();
		p2.display();
		
		PlayerInfo p3 = new PlayerInfo();
		
		p3.read();
		p3.display();
		
		PlayerInfo p4 = new PlayerInfo();
		
		p4.read();
		p4.display();
		
		PlayerInfo p5 = new PlayerInfo();
		
		p5.read();
		p5.display();
	}
}
