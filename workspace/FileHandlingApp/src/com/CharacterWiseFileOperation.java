package com;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class CharacterWiseFileOperation {

	public static void main(String[] args) {
	try {
//InputStreamReader isr = new InputStreamReader(System.in);
//BufferedReader br = new BufferedReader(isr);

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
FileWriter fw = new FileWriter("info.txt");
System.out.println("Ente the data");
int ch;
	while((ch=br.read()) != '@') {
		fw.write(ch);
	}
	fw.close();
	} catch (Exception e) {
		// TODO: handle exception
	}

	}

}
