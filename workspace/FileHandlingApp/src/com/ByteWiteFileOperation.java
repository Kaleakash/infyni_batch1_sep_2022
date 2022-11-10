package com;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteWiteFileOperation {
	public static void main(String[] args) throws Exception{
//		DataInputStream dis = new DataInputStream(System.in);
//		//FileOutputStream fos = new FileOutputStream("abc.doc"); // it override the data 
//		FileOutputStream fos = new FileOutputStream("abc.doc",true);  // it append the data 
//		System.out.println("Enter the text");
//		int ch;
//		while((ch=dis.read()) != '\n') {  /*  \n is equal to enter key*/ 
//			fos.write(ch);
//		}
//		fos.close();
		
//		//FileInputStream fis = new FileInputStream("abc.doc");
//		FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Java and SQ Trainng\\Batch 1\\Java Programs\\ArrayDemo.java");
//		int ch;
//		while((ch = fis.read()) != -1) {    // -1 mean end of the file 
//			//System.out.print(ch +"="+(char)ch);
//			System.out.print((char)ch);
//		}
//		
//		fis.close();
		
		//copy from one file to another file 
//		File ff =new File("\"C:\\\\Users\\\\LENOVO\\\\OneDrive\\\\Desktop\\\\Java and SQ Trainng\\\\Batch 1\\\\Java Programs\\\\ArrayDemo.java\"");
//		System.out.println(ff.getPath());
//		System.out.println(ff.getAbsolutePath());
//		System.out.println(ff.canRead());
//		System.out.println(ff.canWrite());
//		System.out.println(ff.canExecute());
//		System.out.println(ff.length());
		FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Java and SQ Trainng\\Batch 1\\Java Programs\\ArrayDemo.java");
		FileOutputStream fos = new FileOutputStream("demo.txt");
		int ch;
		while((ch = fis.read()) != -1) {    // -1 mean end of the file 
			fos.write(ch);
		}
		System.out.println("File copied");
		fos.close();
		fis.close();
	}
}
