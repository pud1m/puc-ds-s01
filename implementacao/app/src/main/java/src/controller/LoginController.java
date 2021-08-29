package src.controller;

import java.util.Scanner;
import src.model.*;
import src.view.UI;

public class LoginController{
    public LoginController(){}

    private void getName(){}

    private void getPassword(){}

    public void getUser(){}
    
    private static User validateLogin(String name, String pass){
        User tmpUser;

        if(name.equals("leo") && pass.equals("1234")){
            return tmpUser = new Student("leo","1234", ""); 
        }else if(name.equals("bolacha") && pass.equals("1234")){
            return tmpUser = new Professor("bolacha", "1234", "");
        }

        return null;
    }

    public static int login(){
        String tmpUser;
        String tmpPass;
        
        try {
            Scanner readInput = new Scanner(System.in); 

            System.out.println("Digite seu usuário: ");
            tmpUser = readInput.nextLine();
            System.out.println("Digite sua senha: ");
            tmpPass = readInput.nextLine();

            User user = validateLogin(tmpUser, tmpPass);
            UI.Control(user);

            if(user != null){
                return 0;
            }
            
        } catch (Exception e) {
            //TODO: handle exception
        }

        return -1;
    }
}