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
            fileInput = file;
			setScannerFile(file);
        } catch (Exception e) {
            //TODO: handle exception
        }
	}

	public void setScannerFile(File file){
        try {
            fileScanner = new Scanner(file);
        } catch (Exception e) {
            //TODO: handle exception
        }
	}

	public File getFileInput() {
		return fileInput;
	}

	public void setFileInput(String fileName) {
        try {
            this.fileInput = new File(fileName);
        } catch (Exception e) {
            //TODO: handle exception
        }
	}

	public int getArrayLength(){
        try {
            Scanner fileLength = new Scanner(fileInput);
            int count = 0;
    
            while (fileLength.hasNextLine()) {
                count++;
                fileLength.nextLine();
            }
    
            fileLength.close();
            return count; 
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        return -1;
	}

	public String[] getFileInArrayFormat(){

        try {
            String array[] = new String[getArrayLength()];
		
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                array[fileSize] = data;
                fileSize++;
            }
    
            return array; 
        } catch (Exception e) {
            //TODO: handle exception
        }

        return null;
	}

	public void closeFile() throws ClosedFileSystemException {
		fileScanner.close();
	}
}