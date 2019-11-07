package io.turntabl.tcms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Client {
    private String name;
    private  String phone;
    private String email;
    private String adddress;


    public Client(String name, String phone, String email, String adddress)  {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.adddress = adddress;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", adddress='" + adddress + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdddress() {
        return adddress;
    }

    public void setAdddress(String adddress) {
        this.adddress = adddress;
    }

    public String nameToWriteToFile(){
        return name;
    }

    public void writeToFile() throws IOException {
//        f.append(name);
//        f.append(",");
//        f.append(adddress);
//        f.append(",");
//        f.append(phone);
//        f.append(",");
//        f.append(email);
//        f.append("\n");
//
//        f.flush();
//        f.close();
        FileWriter f = null;

        try {
           f = new FileWriter("db.csv", true);
           f.append(name);
        f.append(",");
        f.append(adddress);
        f.append(",");
        f.append(phone);
        f.append(",");
        f.append(email);
        f.append("\n");

        }
        catch (Exception e ){
            e.printStackTrace();
        }
        finally {
         try{
             if (f != null){
                 if (f !=null) {
                     f.flush();
                     f.close();
                 }
             }
         }
         catch (IOException e) {
             e.printStackTrace();
         }
        }

    }

}
