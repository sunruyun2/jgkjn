package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import Model.Tamagotchi;

public class interactionTest {
    Tamagotchi tamagotchi;

    @Before
    public void setup(){
        tamagotchi = new Tamagotchi();
    }

    @Test
    public void initializationTest(){
        assertEquals(10, tamagotchi.getCleanliness());
    }


    @Test
    public void feedTest(){
        tamagotchi.setHungriness(10);
        tamagotchi.feed();
        assertEquals(5, tamagotchi.getHungriness());
    }

}
