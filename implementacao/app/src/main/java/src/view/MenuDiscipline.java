package src.view;

import java.io.File;
import src.controller.ReadArchive;

public class MenuDiscipline{
    public MenuDiscipline(){}

    public static void GetMenuDiscipline(){
        File file = new File("/home/l1n3rd4/Projects/puc-ds-s01/implementacao/app/build/libs/Historia");
        ReadArchive read = new ReadArchive(file);
        String[] file1 = read.getFileInArrayFormat();

        for(int i = 0; i < file1.length; i++){
            System.out.println(file1[i]);
        }
    }
}