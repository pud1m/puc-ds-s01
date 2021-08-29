package src.view;

import java.util.Scanner;
import src.controller.LoginController;
import src.model.*;

public class UI{
    public UI(){}

    public static void UserExperience(){
        try {
            int choice;
            Scanner readInput = new Scanner(System.in);
            int response = 1;

            do{
                LoginMenu.GetLoginMenu();
                choice = readInput.nextInt();

                switch (choice) {
                    case 1:
                        response = LoginController.login();
                        break;
                    case 2:
                        
                        break;
                    default:
                        break;
                }
            }while (choice != 3 && response != 0);

            readInput.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }


    public static void Control(User user){
        int choice;

        try {
            do{
                MenuStudent.GetMenuStudent();
                Scanner readInput = new Scanner(System.in);
                choice = readInput.nextInt();
                
            }while(choice != 3); 
            
            readInput.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}