package io.turntabl.tcms;

import org.junit.Test;

import javax.swing.plaf.IconUIResource;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void testNameWithAphabet(){
        assertTrue(Utils.nameIsAphabet("Dennis"));
    }

    @Test
    public void testNameWithNumbers(){
        assertFalse(Utils.nameIsAphabet("321"));
    }

    @Test
    public void testNameWithAtSigns(){
        assertTrue(Utils.nameIsAphabet("Null"));
    }

    @Test
    public void testDistance(){
        assertEquals(3, Utils.lavenstine("Flomax", "Volmax"));
    }

    @Test
    public void testDistance2(){
        assertEquals(4, Utils.lavenstine("Dennis", "Bernice"));
    }

//    @Test
//    public void testMatchingStrings() {
////        List<Client> names = Arrays.asList(
////                new Client("Dennis", "3332", "kamponsah","This")
////                ); //from fake storage
//
//        Client c =  new Client("Dennis", "3332", "kamponsah","This");
//
//        assertEquals(Arrays.asList(c),Utils.searchByName("Dennis "));
////        Utils.searchByName("Dennis");
//    }

    @Test
    public void testReadingDataFromFile(){
        Utils.readFromFile();
    }

}