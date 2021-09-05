package src.controller;

import java.io.File;
import java.util.Scanner;
import src.model.*;
import src.view.UI;

public class LoginController{
    public LoginController(){}

    private static String[][] user;
    private static int Lines;
    private static int Columns;

    private static void loadNames(String FileName){
        File file = new File(FileName);
        ReadArchive read = new ReadArchive(file);
        String[] file1 = read.getFileInArrayFormat();
        String[][] places1 = {{""}, {""}, {""},{""}};
        String[] places;

        Lines = file1.length;

        for(int i = 0; i < file1.length; i++){
            places = file1[i].split(";");
            places1[i] = new String[places.length];
            
            for(int j = 0; j < places.length; j++){
                System.out.println("i " + i + " j " + j);
                places1[i][j] = places[j];
            }
            Columns = places.length;
        }

        user = places1;
    }

    private void getName(){}

    private void getPassword(){}

    public void getUser(){}
    
    private static User validateLogin(String name, String pass, String FileName){
        User tmpUser;

        loadNames(FileName);
        
        System.out.println("linhas " + Lines);
        for(int i = 0; i < Lines; i++){
            for(int j = 0; j < Columns; j++){
                System.out.println(name + " " + user[i][j]);
                if(name.equals(user[i][0]) && pass.equals(user[i][1])){
                    if(user[i][3].equals("User")){
                        
                    }
                }
            }
        }

        System.out.println("RUIMM");
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