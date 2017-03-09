package net.codejava.networking;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ScheduleDownloadAndParsing extends TimerTask {

	Date now;
//	String fileURL = "http://www.bcp-bonn.de/stellplatz/bcpinfo.xml";
//	String saveDir = "C:/Users/Pratyush/workspace/SmartCityProject/resource";
//	String readFile = "resource/bcpinfo.xml";
//	String writeFile = "resource/writeBcpinfoData.txt";
	BufferedWriter bw = null;
	FileWriter fw = null;
	List<Parkhaus> list = null;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		now = new Date(); // initialize date
		System.out.println("Time is :" + now); // Display current time

		try {
			HttpDownloadUtility.downloadFile(Constant.getFileURL(), Constant.getSaveDir());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		try {
			File readXmlFile = new File(Constant.getReadFile());
			System.out.println("File  name" + readXmlFile.getAbsolutePath());
			JAXBContext jaxbContext = JAXBContext
					.newInstance(Parkhaeuser.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Parkhaeuser parkhaeuser = (Parkhaeuser) jaxbUnmarshaller
					.unmarshal(readXmlFile);

			File writingfile = new File(Constant.getWriteFile());

			if (!writingfile.exists()) {
				System.out.println("inside if loop!");

				fw = new FileWriter(writingfile.getAbsoluteFile(), true);
				bw = new BufferedWriter(fw);
				writingfile.createNewFile();
//				String fileHeader = "lfdnr" + "\t" + "bezeichnung" + "\t"
//						+ "gesamt" + "\t" + "frei" + "\t" + "status" + "\t"
//						+ "zeitstempel" + "\t" + "tendenz" + "\n";
				bw.write(Constant.getFileHeader());
				System.out.println("Done");
				list = parkhaeuser.getParkhaus();
				for (Parkhaus p : list) {
					System.out.println(p.toString());
					bw.write(p.toString());
				}
				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();
			} else {
				System.out.println("outside if loop!");
				fw = new FileWriter(writingfile.getAbsoluteFile(), true);
				bw = new BufferedWriter(fw);
				list = parkhaeuser.getParkhaus();
				for (Parkhaus p : list) {
					System.out.println(p.toString());
					bw.write(p.toString());
				}
			}
			System.out.println("Done");
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		} finally {

			try {

				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
	}

}
