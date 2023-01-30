package classes;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void CheckAge_Age_Works() {

        Person yisus = new Person("Yisus", 1,30,"unemployed");
        Person juan = new Person("Juan", 2, -1,"NET Developer");

        assertEquals(30,yisus.getAge());
        assertThrows(IllegalArgumentException.class, () -> juan.setAge(-1));


    }
}