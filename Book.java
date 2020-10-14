//Saleh Abdullah Alqahtani 439102178

public class Book {
	private int isbn;
	private String author, genre, title, refcode;

	public Book() {

	}

	public Book(int i, String au, String ti, String gen) {
		setISBN(i);
		setAuthor(au);
		setTitle(ti);
		setGenre(gen);
		this.refcode=generateReference( au,  gen); 
	}

	public void setISBN(int i) {
		this.isbn = i;
	}

	public void setAuthor(String a) {
		this.author = a;
	}

	public void setTitle(String t) {
		this.title = t;
	}

	public void setGenre(String a) {
		this.genre = a;
	}

	public int getISBN() {
		return this.isbn;
	}

	public String getAuthor() {
		return this.author;
	}

	public String getTitle() {
		return this.title;
	}

	public String getGenre() {
		return this.genre;
	}

	public String generateReference(String au, String ge) {
		return (au.charAt(0) + au.charAt(1) + "-" + ge.charAt(0) + ge.charAt(1)); // modified
	}

	public boolean verifyISBN(int a) {
		if (((a / 1000 * 3) + (a / 100 * 2) + (a / 10 * 1)) % 4 == a % 10)
			return true;
		else 
			return false;
	}

	public void printBookInfo() {
		System.out.println("Title:" + this.title + "\nAuthor: " + this.author + "\nISBN:" + this.isbn
				+ "- Reference Code: " + this.refcode);
	}

	public boolean equals(Book a) {
		if (this.author.equals(a.author) && this.genre.equals(a.genre) && this.title.equals(a.title))
			return true;
		else
			return false;
	}
}