package task;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LibraryTest {

    @Mock
    private List<Book> mockedBooks;

    @Mock
    private Book mockedBook;

    @InjectMocks
    private Library library;

    @Test
    public void Should_Get_Books(){
        when(mockedBooks.get(0)).thenReturn(new Book(5, "title"));

        assertEquals(5,library.getBooks().get(0).getPages());
        assertEquals("title",library.getBooks().get(0).getTitle());
    }

    @Test
    public void Should_ReturnBookWithHighestPagesCount_When_LibraryHasBooks(){
        when(mockedBooks.get(0)).thenReturn(new Book(10,"mocks"));
        when(mockedBooks,size()).thenReturn(2);

        Book actual = library.getBookWithHighestPageCount();

        assertEquals(43, actual.getPages());
    }

    @Test
    public void Should_ThrowRuntimeException_When_LibraryIsEmpty(){
        when(mockedBooks.isEmpty()).thenReturn(true);

        assertThrows(RuntimeException.class, () -> library.getBookWithHighestPageCount());
    }
}














