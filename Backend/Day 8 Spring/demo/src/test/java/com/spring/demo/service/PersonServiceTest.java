package com.spring.demo.service;

import com.spring.demo.model.domain.Person;
import com.spring.demo.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Flow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository repositoryMock;

    @Mock
    private BarFormatter barFormatter;

    @InjectMocks
    private PersonService service;

    @Test
    public void When_FirstNamePresent_Expect_PersonsMatchingFirstName(){
        Person expected = Person.builder()
                .firstName("name").build();
        when(repositoryMock.findAllByFirstName(anyString())).thenReturn(List.of(expected));


        List<Person> actual = service.fetchPersons("name",null);

        assertEquals(expected.getFirstName(),actual.get(0).getFirstName());
    }
}

















