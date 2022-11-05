package com;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class ReadDataFromWebsite {

	public static void main(String[] args) throws Exception {
	URL url = new URL("https://www.google.com/");
	  URLConnection openCon = url.openConnection();
	  FileOutputStream fos = new FileOutputStream("googlepage.html");
	 InputStream in = openCon.getInputStream();
	 //int size = in.available();
	 //System.out.println(size);
	 int ch;
	 while((ch=in.read()) != -1) {
		 //System.out.print((char)ch);
		 fos.write(ch);
	 }
	 fos.close();
	 in.close();
	 System.out.println("google page copied");
	}

}
