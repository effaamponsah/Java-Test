package io.turntabl.tcms;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {

    public static boolean nameIsAphabet(String name) {
        return name.matches("[A-Z][a-z]*" );
    }

    public static int lavenstine(String string1, String string2){
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        int [ ] costs = new int [string2.length()+1];
        for (int j = 0; j<costs.length; j++){
            costs[j] = j;
        }
       for (int i =1; i<=string1.length(); i++){
           costs[0] = i;
           int nw = i-1;
           for (int j =1; j<=string2.length(); j++){
               int cj = Math.min(1 + Math.min(costs[j], costs[j -1]), string1.charAt(i-1) == string2.charAt(j-1) ? nw: nw +1);
               nw = costs[j];
               costs[j]=cj;
           }
       }
       return costs[string2.length()];


    }

    public static List<Client> searchByName(String search) {
        List<Client> names = Arrays.asList(
                new Client("Dennis", "3332", "kamponsah","This"),
                new Client("Jim", "3332", "kamponsah","This")

        );
        List<Client> matching = new ArrayList<>();
        for (Client s: readFromFile()){
            if (lavenstine(s.getName(),search) < 2 ){
                matching.add(s);
            }
        }
        System.out.println(matching);
        return matching;
    }

    public static List<Client> readFromFile(){
        List<Client> clients = new ArrayList<>();
        Path path = Paths.get("db.csv");

        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line = br.readLine();
            while(line != null){
                String [] attributes = line.split(",");
                Client client = createBook(attributes);
                clients.add(client);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clients;
    }

    private static Client createBook(String[] attributes) {
        String name = attributes[0];
        String phone = attributes[2];
        String email = attributes[3];
        String adddress = attributes[1];
        return new Client(name,phone,email,adddress);
    }

}
