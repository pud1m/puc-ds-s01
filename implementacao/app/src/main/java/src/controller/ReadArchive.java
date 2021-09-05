package src.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.ClosedFileSystemException;
import java.util.Scanner;

public class ReadArchive{
    public ReadArchive(){}

    private File fileInput;
	private int fileSize = 0;
	private Scanner fileScanner;

	public ReadArchive(String fileName){
		setFileInput(fileName);
		setScannerFile(fileInput);
	}

	public ReadArchive(File file){
        try {
            if(file == null){
                throw new FileNotFoundException();
            } else {
                fileInput = file;
			    setScannerFile(file);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
	}

	public void setScannerFile(File file){
        try {
            if(file == null){
                throw new FileNotFoundException();
            } else {
                fileScanner = new Scanner(file);
            }
        } catch (FileNotFoundException e) {
             System.out.println(e.getMessage());
        }
	}

	public File getFileInput() {
		return fileInput;
	}

	public void setFileInput(String fileName) {
        try {
            if(fileName == null){
                throw new FileNotFoundException();
            } else {
                this.fileInput = new File(fileName);
                System.out.println("THIS " + this.fileInput);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
	}

	public int getArrayLength(){
        try {
            Scanner fileLength = new Scanner(fileInput);
            System.out.println("Teste1");
            int count = 0;
            

            while (fileLength.hasNextLine()) {
                count++;
                fileLength.nextLine();
            }
    
            fileLength.close();
            return count; 
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        return -1;
	}

	public String[] getFileInArrayFormat(){

        try {
            System.out.println("Hei");
            String array[] = new String[getArrayLength()];
		
            while (fileScanner.hasNextLine()) {
                System.out.println("teste");
                String data = fileScanner.nextLine();
                System.out.println(data);
                array[fileSize] = data;
                fileSize++;
            }
    
            return array; 
        } catch (Exception e) {
            //System.out.println(e.getMessage());
        }

        return null;
	}

	public void closeFile() throws ClosedFileSystemException {
		fileScanner.close();
	}
}