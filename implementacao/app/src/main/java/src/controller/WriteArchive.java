package src.controller;

import java.io.*;

public class WriteArchive {
	private BufferedWriter archive;
	private String FileOutput;

	public WriteArchive(String FileOutput){
		try {
			this.FileOutput = FileOutput;
			archive = new BufferedWriter(new FileWriter(FileOutput));
		} catch (Exception e) {
			//
		} 
	}

	public String getFileOutput() {
		return FileOutput;
	}

	public void setFileInput(String FileOutput) {
		this.FileOutput = FileOutput;
	}

	public void write(String textInput) {
		try {
			archive.write(textInput);
			archive.newLine();
		} catch (IOException e) {
			//
		}
	}

	public void ArchiveClose() {
		try {
			if(archive != null){
				archive.close();
			}
		} catch (IOException e) { 
			//
		}
	}
}