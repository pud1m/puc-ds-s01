package src.controller;

import java.util.Scanner;
import src.model.*;

public class LoginController{
    public LoginController(){}

    private void getName(){}

    private void getPassword(){}

    public void getUser(){}
    
    private static User validateLogin(String name, String pass){
        User tmpUser;

        if(name.equals("leo") && pass.equals("1234")){
            return tmpUser = new Student(); 
        }else if(name.equals("bolacha")){
            return tmpUser = new Professor();
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

            if(validateLogin(tmpUser, tmpPass) == null){
                System.out.println("Deu ruim");
            } else {
                System.out.println("Deu bom");
            }
            return 0;
        } catch (Exception e) {
            //TODO: handle exception
        }

        return -1;
    }
}