public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;
    public void borrowBook(){
        borrowedBook = BookSingleton.borrowBook();
        if(borrowedBook == null){
            haveBook = false;
        }else {
            haveBook = true;
        }
    }
    public String getTitleAndAuthor(){
        if(haveBook){
            return borrowedBook.getAuthorAndTitle();
        }else {
            return "I don't have a book";
        }
    }
    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }
}
