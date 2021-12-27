///////////////////////////////////////////////////////////////////
class Link{
	public String book_name, author, language;
	public Link next;
	
	public Link(String book, String author, String language) {
		book_name = book;
		this.author = author;
		this.language = language;
	}
	
	public void DisplayLink() {
		System.out.println(book_name+", "+author+", "+language+" ");
	}
}
///////////////////////////////////////////////////////////////////
class Linklist{
	private Link first;
	public int nElems = 0;
	
	public Linklist() {
		first = null;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void insert(String book, String author, String language) {
		Link newLink = new Link(book, author, language);
		newLink.next = first;
		first = newLink;
		nElems++;
	}
	
	public void delete() {
		first = first.next;
	}
	
	public void DisplayList() {
		Link current = first;          
	      while(current != null)         
	         {
	         current.DisplayLink();      
	         current = current.next;     
	         }
	      System.out.println("");
	}
	
	public int size() {
		return nElems;
	}
	
	public void bubblesort() {
		Link current = first;
		while(current!=null){
			Link second = current.next;
			while(second!=null) {
				if(current.book_name.charAt(0)>second.book_name.charAt(0)) {
					String temp = current.book_name;
					current.book_name = second.book_name;
					second.book_name = temp;
					
					String temp1 = current.author;
					current.author = second.author;
					second.author = temp1;
					
					String temp2 = current.language;
					current.language = second.language;
					second.language = temp2;
				}
				second = second.next;
			}
			current = current.next;
		}
	}
	
}
///////////////////////////////////////////////////////////////////
public class BookSorting {
	public static void main(String args[]) {
		Linklist Book = new Linklist();
		
		Book.insert("The Little Prince (Le Petit Prince)", "Antoine de Saint-Exupéry", "French");
		Book.insert("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "English");
		Book.insert("The Hobbit", "J.R.R. Tolkien", "English");
		Book.insert("Dream of Red Chamber", "Cao Xueqin", "Chinese");
		Book.insert("The Lion, the Witch and the Wardrobe", "C.S. Lewis", "English");
		Book.insert("The Adventures of Pinocchio (Le avventure do Pinocchio)", "Carlo Collodi", "Italian");
		
		System.out.println("Before:\n");
		Book.DisplayList();
		Book.bubblesort();
		System.out.println("After:\n");
		Book.DisplayList();
	}
}
