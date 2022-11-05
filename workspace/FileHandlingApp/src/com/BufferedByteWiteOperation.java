package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedByteWiteOperation {

	public static void main(String[] args) throws Exception{
	FileInputStream fis = new FileInputStream("demo.txt");
	
	BufferedInputStream bis = new BufferedInputStream(fis);
	FileOutputStream fos = new FileOutputStream("Demo.java");
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	bis.skip(4);
	int ch;
	while((ch = bis.read()) != -1) {
			bos.write(ch);
	}
	
	bos.flush();
	System.out.println("file copied");
	fis.close();
	fos.close();
	}

}
