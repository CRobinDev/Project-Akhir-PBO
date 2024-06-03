package Implementasi_GUI.Class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Akun {
    private String username;
    private String password;

    public Akun(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername (String username){
        this.username = username;
    }
    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    private boolean validateUser(String username, String password) {
        try (BufferedReader br = new BufferedReader(new FileReader("akun.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String storedUsername = parts[0];
                    String storedPassword = parts[1];
                    if (authenticate(storedUsername,storedPassword)) {
                        return true; // Username and password match
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Username and password don't match any entry in the file
    }
}
