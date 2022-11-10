package com;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterwiseFileCopy {

	public static void main(String[] args) throws Exception{
	FileReader fr = new FileReader("info.txt");
	FileWriter fw = new FileWriter("info.doc");
	int ch;
	
	while((ch=fr.read()) != -1) {
		fw.write(ch);
	}
	fr.close();
	fw.close();
	System.out.println("file copied...");
	}

}
