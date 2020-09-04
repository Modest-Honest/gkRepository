package com.zk.ywgk.agent.utils;

import java.io.*;


public class LinuxCmd {

	
	public String exec(String cmd) {
		Process process = null;
		BufferedReader buf = null;
		String result = "";
		try {
			process = Runtime.getRuntime().exec(new String[] {"sh","-c",cmd});
			buf = new BufferedReader(new InputStreamReader(process.getInputStream()));

			String line = null;
			while((line = buf.readLine())!=null) {
				result = result + line + " ";
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("Error!!");
		} 
		return result;

		
	}
	
	public String readFile(File file)  {
		String result = "";
		String line = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

			while ((line = br.readLine())!=null) {
				result = result + line + " ";
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	

}
