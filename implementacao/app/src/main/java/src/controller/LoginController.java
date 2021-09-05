package src.controller;

import java.io.File;
import java.util.Scanner;
import src.model.*;
import src.view.UI;

public class LoginController{
    public LoginController(){}

    private static void loadNames(String FileName){
        File file = new File(FileName);
        ReadArchive read = new ReadArchive(file);
        String[] file1 = read.getFileInArrayFormat();
        String[][] places1 = {{"", "", "", ""}, {"", "", ""}};

        for(int i = 0; i < file1.length; i++){
            String places[] = file1[i].split(";");
            places1[i] = new String[places.length];

            for(int j = 0; j < places.length; j++){

                places1[i][j] = places[j];
            }
        }
    }

    private void getName(){}

    private void getPassword(){}

    public void getUser(){}
    
    private static User validateLogin(String name, String pass, String FileName){
        User tmpUser;

        loadNames(FileName);

        if(name.equals("leo") && pass.equals("1234")){
            return tmpUser = new Student("leo","1234", ""); 
        }else if(name.equals("bolacha") && pass.equals("1234")){
            return tmpUser = new Professor("bolacha", "1234", "");
        }

        return null;
    }

    public static int login(String FileName){
        String tmpUser;
        String tmpPass;
        
        try {
            Scanner readInput = new Scanner(System.in); 

            System.out.println("Digite seu usuário: ");
            tmpUser = readInput.nextLine();
            System.out.println("Digite sua senha: ");
            tmpPass = readInput.nextLine();

            User user = validateLogin(tmpUser, tmpPass, FileName);

            if(user != null){
                UI.Control(user);
                return 0;
            }
            
        } catch (Exception e) {
            //TODO: handle exception
        }

        return -1;
    }
}