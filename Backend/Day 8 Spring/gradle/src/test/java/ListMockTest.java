import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class ListMockTest {

    @Test
    public void whenNotUsingMockAnnotation(){
        List<String> mockedList = Mockito.mock(ArrayList.class);

        mockedList.add("one");

        Mockito.verify(mockedList).add("one");

        Assertions.assertEquals(0,mockedList.size());

        Mockito.when(mockedList.size()).thenReturn(100).thenReturn(45);
        Assertions.assertEquals(100, mockedList.size());
        Assertions.assertEquals(45, mockedList.size());
    }

    @Mock
    private List<String> mockedList;

    @Test
    public void whenUsingMockAnnotation(){
        mockedList.add("one");

        Mockito.verify(mockedList).add("one");

        Assertions.assertEquals(0,mockedList.size());

        Mockito.when(mockedList.size()).thenReturn(100).thenReturn(45);
        Assertions.assertEquals(100, mockedList.size());
        Assertions.assertEquals(45, mockedList.size());
    }

    @Test
    public void WhenNotUsingArgumentCaptorAnnotation(){
        List<String> mockedList = Mockito.mock(ArrayList.class);
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        mockedList.add("one");
        mockedList.add("two");
        Mockito.verify(mockedList, Mockito.times(2)).add(argumentCaptor.capture());
        //Mockito.verify(mockedList).add(argumentCaptor.capture());

        Assertions.assertEquals("one",argumentCaptor.getAllValues().get(0));
        Assertions.assertEquals("two",argumentCaptor.getAllValues().get(1));
    }

    @Mock
    List<String> mockedListAnnotation;
    @Captor
    ArgumentCaptor<String> argumentCaptor;

    @Test
    public void WhenUsingArgumentCaptorAnnotation(){

        mockedListAnnotation.add("one");
        mockedListAnnotation.add("two");

        Mockito.verify(mockedList, Mockito.times(2)).add(argumentCaptor.capture());

        Assertions.assertEquals("one",argumentCaptor.getAllValues().get(0));
        Assertions.assertEquals("two",argumentCaptor.getAllValues().get(1));
    }

    @Mock
    private Map<String, String> wordMap;

    @InjectMocks
    private MyDictionary dictionary;

    @Test
    public void injectMocks(){
        //Mockito.when(wordMap.get("aWord")).thenReturn("aMeaning");
        Mockito.when(wordMap.get(Mockito.any(String.class))).thenReturn("aMeaning");

        Assertions.assertEquals("aMeaning",dictionary.getMeaning("qwer"));
    }
}
















