package net.codejava.networking;

public class Constant {

	/*
	 * Constant variables for HttpDownloader.java
	 */
	private static final int numberOfdays = 7;
	private static final int hoursInday = 24;
	private static final int minutesInHour = 60;
	private static final int secondsInMinutes = 60;
	private static final int millisecondsInSeconds = 1000;
	static int processingInterval = 60000;
	static long startTime = 0;
	static long endTime = 0;

	/*
	 * Constant variables for ScheduledDownloadParsing.java
	 */
	private static String fileURL = "http://www.bcp-bonn.de/stellplatz/bcpinfo.xml";
	private static String saveDir = "C:/Users/Pratyush/workspace/SmartCityProject/resource";
	private static String readFile = "resource/bcpinfo.xml";
	private static String writeFile = "resource/writeBcpinfoData.txt";
	private static String fileHeader = null;

	/*
	 * Constant variables for HttpDownloader.java
	 */
	public static int getProcessingInterval() {
		return processingInterval;
	}

	public static void setProcessingInterval(int processingInterval) {
		Constant.processingInterval = processingInterval;
	}

	public static long getStartTime() {
		startTime = System.currentTimeMillis();
		return startTime;
	}

	public static void setStartTime(long startTime) {
		Constant.startTime = startTime;
	}

	public static long getEndTime() {
		endTime = System.currentTimeMillis()
				+ (numberOfdays * hoursInday * minutesInHour * secondsInMinutes * millisecondsInSeconds);
		return endTime;
	}

	public static void setEndTime(long endTime) {
		Constant.endTime = endTime;
	}

	public static int getNumberofdays() {
		return numberOfdays;
	}

	public static int getHoursinday() {
		return hoursInday;
	}

	public static int getMinutesinhour() {
		return minutesInHour;
	}

	public static int getSecondsinminutes() {
		return secondsInMinutes;
	}

	public static int getMillisecondsinseconds() {
		return millisecondsInSeconds;
	}

	/*
	 * Constant variables for ScheduledDownloadParsing.java
	 */

	public static String getFileURL() {
		return fileURL;
	}

	public static void setFileURL(String fileURL) {
		Constant.fileURL = fileURL;
	}

	public static String getSaveDir() {
		return saveDir;
	}

	public static void setSaveDir(String saveDir) {
		Constant.saveDir = saveDir;
	}

	public static String getReadFile() {
		return readFile;
	}

	public static void setReadFile(String readFile) {
		Constant.readFile = readFile;
	}

	public static String getWriteFile() {
		return writeFile;
	}

	public static void setWriteFile(String writeFile) {
		Constant.writeFile = writeFile;
	}

	public static String getFileHeader() {
		fileHeader = "lfdnr" + "\t" + "bezeichnung" + "\t" + "gesamt" + "\t"
				+ "frei" + "\t" + "status" + "\t" + "zeitstempel" + "\t"
				+ "tendenz" + "\n";
		return fileHeader;
	}

	public static void setFileHeader(String fileHeader) {
		Constant.fileHeader = fileHeader;
	}

}
