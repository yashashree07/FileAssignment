package com.montran.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamUtil {
	
	private byte[] data;
	private int fileLength;
	private InputStream inputstream;
	
	
	public byte[] getfileData(File file)
	{
		try
		{
			fileLength=(int)file.length();
			data=new byte[fileLength];
			inputstream=new FileInputStream(file);
			inputstream.read(data);
			return data;
			
		}catch(FileNotFoundException e)
		{
			System.out.println("FileNotFoundException");
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println("IOException");
			System.out.println(e.getMessage());
		}finally
		{
			try {
					inputstream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("IOException");
				System.out.println(e.getMessage());
			}
		}
		
		return null;
	}
}



