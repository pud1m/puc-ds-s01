package src;

import src.view.UI;

public class App {
    public static void main(String[] args) {
        try {
            UI.UserExperience(args[0]);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
