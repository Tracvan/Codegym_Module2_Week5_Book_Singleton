public class Test {
    public static void main(String[] args) {
        System.out.println("BEGIN TESTING SINGLETON PATTERN");

        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("Bookborrwer1 asked to borrow the book");
        System.out.println("Bookborrwed1 Author and Title");
        System.out.println(bookBorrower1.getTitleAndAuthor());

        bookBorrower2.borrowBook();
        System.out.println("Bookborrower2 asked to borrow the book");
        System.out.println("Bookborrower2 Author and Title");
        System.out.println(bookBorrower2.getTitleAndAuthor());

        bookBorrower1.returnBook();
        System.out.println("Bookborrower1 returned the book");

        bookBorrower2.borrowBook();
        System.out.println("Bookborrower2 Author and Title");
        System.out.println(bookBorrower2.getTitleAndAuthor());

        System.out.println("END TESTING SINGLETON PATTERN");
    }
}