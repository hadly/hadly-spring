package com.smart.resource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.core.io.*;


public class FileSourceExample {
	
	public static void main(String[] args) {
		try {
			String filePath = "file1.txt";

			WritableResource res1 = new PathResource(filePath);
			Resource res2 = new ClassPathResource("conf/file2.txt");

			OutputStream stream1 = res1.getOutputStream();
			stream1.write("欢迎光临\n小春论坛".getBytes());
			stream1.close();

            InputStream ins1 = res1.getInputStream();
			InputStream ins2 = res2.getInputStream();

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int i;
			while((i=ins1.read())!=-1){
				baos.write(i);
			}
			System.out.println(baos.toString());

            System.out.println("res1:"+res1.getFile().getAbsolutePath());
            System.out.println("res2:"+res2.getFile().getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
