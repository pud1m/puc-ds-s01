package src.view;

import java.util.Scanner;
import src.controller.LoginController;
import src.controller.ReadArchive;
import src.model.*;
import java.io.File;

public class UI{
    public UI(){}

    public static void UserExperience(String FileName){
        try {
            int choice;
            Scanner readInput = new Scanner(System.in);
            int response = 1;
            

            do{
                LoginMenu.GetLoginMenu();
                choice = readInput.nextInt();

                switch (choice) {
                    case 1:
                        response = LoginController.login(FileName);
                        break;
                    case 2:
                        
                        break;
                    default:
                        break;
                }
            }while (choice != 3 && response != 0);

            readInput.close();
        } catch (Exception e) {
            System.out.println();
        }
    }


    public static void Control(User user){
        int choice;

        try {
            Scanner readInput = new Scanner(System.in)  ;

            do{
                MenuStudent.GetMenuStudent();    
                choice = readInput.nextInt();

                switch (choice) {
                    case 1:
                        MenuDiscipline.GetMenuDiscipline();
                        readInput.nextLine();
                        //user.createRegistrations();
                        break;
                    case 2:
                        //user.getGroups();
                        break;
                    default:
                        break;
                }
            }while(choice != 3); 
            
            readInput.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}