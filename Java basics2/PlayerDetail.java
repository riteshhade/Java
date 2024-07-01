package Day;

public class PlayerDetail {
	public static void main(String[] args) {
		
		Player p1 =new Player("Ritesh", 20, 3400);
		Player.country ="India";
		p1.display();
		Player p2 =new Player("Viraj", 21, 300);
		p2.display();
		Player p3 =new Player("tej", 23, 5100);
		p3.display();
		Player p4 =new Player("Brian", 27, 3400);
		p4.display();
		Player p5 =new Player("sky", 24, 3400);
		p5.display();
		
	}
}
