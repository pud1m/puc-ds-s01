package src;

import controller.Login;

public class App {
    public static void main(String[] args) {
        Login login = new Login();
        boolean logon;

        logon = login.validateLogin();
        
        if(logon){
            String userName = login.getUser();   
        }
    }
}
