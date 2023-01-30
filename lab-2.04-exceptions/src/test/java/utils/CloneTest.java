package utils;

import classes.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloneTest {

    @Test
    void testClone() {
        Person yisus = new Person("Yisus", 1,30,"unemployed");
        Person yisusTest = new Person("Yisus", 3,30,"unemployed");
        assertEquals(yisusTest, Clone.duplicate(yisus,1));

    }
}