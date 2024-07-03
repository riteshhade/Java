package Ass3;

public class Author
{
	String name;
	String mail;
	char gen;
	
	public Author(String name, String mail, char gen) {
		
		this.name = name;
		this.mail = mail;
		this.gen = gen;
	}
	
	void display()
	{
		System.out.println("Author Name: "+name);
		System.out.println("Email id: "+mail);
		System.out.println("Gender: "+gen);
	}
	
}
