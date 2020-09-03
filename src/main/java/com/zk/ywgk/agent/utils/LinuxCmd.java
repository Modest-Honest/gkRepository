package com.zk.ywgk.agent.utils;

import java.io.*;


public class LinuxCmd {
	Process process = null;
	BufferedReader buf = null;
	String result = "";
	
	public String exec(String cmd) {
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
			System.out.print("Error");
		}
		return result;

		
	}
	

}
