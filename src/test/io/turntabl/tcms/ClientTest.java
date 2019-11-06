package io.turntabl.tcms;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ClientTest {


    @Test
    public void testClient() throws IOException {
        Client c = new Client("Jim", "3332", "kamponsah","This");
        assertEquals("Jim", c.nameToWriteToFile());
    }

    @Test
    public void testWriteToFile() throws IOException {
        Client c = new Client("Dennis", "3332", "kamponsah","This");
        c.writeToFile();

    }

//    @Test
//    public void testAllCLients() throws IOException {
//        FileWriter f = new FileWriter("db.csv");
//        List<Client> cs = Arrays.asList(
//                new Client("Francis", "3332", "kamponsah","Address1"),
//                new Client("James", "33", "kamponsah","This")
//        );
//
//        for (Client c: cs){
//            f.append(c.getName());
//            f.append(",");
//            f.append(c.getAdddress());
//            f.append(",");
//            f.append(c.getPhone());
//            f.append(",");
//            f.append(c.getEmail());
//            f.append("\n");
//
//        }
//
//        f.flush();
//        f.close();
//    }

}