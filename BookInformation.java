class Book{
	private String bookName;
	private String bookType;
	public Book(String bn,String bt) {
		this.bookName=bn;
		this.bookType=bt;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public void BookInfoFunc() {
		System.out.println("Name of Book: "+this.bookName);
		System.out.println("Type of Book: "+this.bookType);
	}
}
class Author extends Book{
	private String bookAuthor;
	
	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Author(String bn,String bt,String ba) {
		super(bn,bt);
		this.bookAuthor=ba;
	}
	public void bookAuthorFunc() {
		System.out.println("Author of Book: "+this.bookAuthor);
	}
}
public class BookInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book("Papillon","Biography");
		Author at=new Author("Papillon","Biography","John Taylor");
		b.BookInfoFunc();
		at.bookAuthorFunc();
		

	}

}
