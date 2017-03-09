package net.codejava.networking;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;

public class ScheduledTask extends TimerTask{
	
	Date now;
	String fileURL = "http://www.bcp-bonn.de/stellplatz/bcpinfo.xml";
	String saveDir = "C:/Users/Pratyush/workspace/SmartCityProject/resource";
	String readFile = "resource/bcpinfo.xml";
	String writeFile = "resource/writeBcpinfoData.txt";
	// FileOutputStream out = null;
	BufferedWriter bw = null;
	FileWriter fw = null;
	List<Parkhaus> list = null;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		now = new Date(); // initialize date
		System.out.println("Time is :" + now); // Display current time
		
	}

}
