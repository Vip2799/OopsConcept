public class Library {
    String bookTitle;
    String authorName;
    long isbnNumber ;
    int yearOfPublishing;

    public static void main(String[] args) {
        Library book1 = new Library();
        book1.bookTitle = "Power Of Your Subconscious Mind";
        book1.authorName = "Dr Joseph murphy";
        book1.isbnNumber = 9788192910963L;
        book1.yearOfPublishing = 2008 ;
        book1.displayBookDetails();

    }
    public void displayBookDetails(){
        System.out.println("Book title = "+bookTitle);
        System.out.println("Author Name = "+authorName);
        System.out.println("ISBN number = "+isbnNumber);
        System.out.println("Year of publication = "+yearOfPublishing);
    }
}
