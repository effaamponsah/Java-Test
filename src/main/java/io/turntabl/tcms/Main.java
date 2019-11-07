package io.turntabl.tcms;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Client c = new Client("Dennis", "3332", "kamponsah","This");
        boolean exists = Files.exists(Paths.get("./db.csv"));
        String fileName = "db.csv";
        String line;
        int b = 0;

        Path s = Paths.get(fileName);



//        System.out.println(exists);
//        Main.loadFromCSV();
//        c.nameToWriteToFile();
        Scanner scanner = new Scanner(System.in);

//        private String name;
//        private  String phone;
//        private String email;
//        private String adddress;

        String userName = scanner.nextLine();
        String phone = scanner.nextLine();
        String email = scanner.nextLine();
        String address = scanner.nextLine();
        Client newClient = new Client(userName,phone,email,address);
        newClient.writeToFile();
    }

    private static void loadFromCSV() throws IOException {
        Scanner sc = new Scanner(new File("./db.csv"));
        sc.useDelimiter(",");
        while(sc.hasNext()){
            System.out.print(sc.next());
        }
        sc.close();
    }




}
