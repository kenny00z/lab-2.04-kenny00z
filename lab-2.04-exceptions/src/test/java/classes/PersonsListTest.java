package classes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonsListTest {

    @Test
    void findByName_Name_HasFirstNAmeAndLastName() {

        ArrayList<Person> personList = new ArrayList<Person>(){
            Person yisus = new Person("Yisus Gracias", 1,30,"unemployed");
            Person yisus2= new Person("Yisus", 1,30,"unemployed");

        };

        assertThrows(IllegalArgumentException.class, () -> PersonsList.findByName("Yisus", personList));

        Person yisus = new Person("Yisus Gracias", 1,30,"unemployed");
        assertEquals(yisus,PersonsList.findByName("Yisus Gracias", personList));


    }
}