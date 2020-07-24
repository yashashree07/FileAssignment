package com.montran.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamUtil{
	
	private OutputStream outputstream;
	
	public byte[] writeDataIntoFile(File file,byte[] data)
	{
		try {
			outputstream = new FileOutputStream(file,true);
			
			outputstream.write(data);
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("FileNotFoundException");
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println("IOException :: ");
			System.out.println(e.getMessage());
		} finally {
			try {
				outputstream.close();
			} catch (IOException e) {
				System.out.println("IOException :: ");
				System.out.println(e.getMessage());
			}
		}
		return null;
	}

	

}




