package Ass3;

public class Testbook {
	public static void main(String[] args) {
		Author a = new Author("James","james@gmail.com",'m');
		
		Book b = new Book("gsggsfdg",5000,1,a);
		b.show();
	}
}
