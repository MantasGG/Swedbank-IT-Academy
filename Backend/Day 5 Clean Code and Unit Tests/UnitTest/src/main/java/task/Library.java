package task;

import java.util.List;

public class Library {
    public List<Book> getBooks(){
        return books;
    }
    public Book getBookWithHighestPageCount() {
        if (books.isEmpty()) {
            throw new RuntimeException();
        }
        Book bookWithHighestPageCount = books.get(0);
        for (int i = 1; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getPages() > bookWithHighestPageCount.getPages()) {
                bookWithHighestPageCount = book;
            }
        }
        return bookWithHighestPageCount;
    }
}
















