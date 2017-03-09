package net.codejava.networking;

import java.io.IOException;
import java.util.Timer;

public class HttpDownloader {

//	private static final int numberOfdays = 7;
//	private static final int hoursInday = 24;
//	private static final int minutesInHour = 60;
//	private static final int secondsInMinutes = 60;
//	private static final int millisecondsInSeconds = 1000;
//	static int processingInterval = 300000;
//	Date date = new Date();
//	Time time = new Time(0);
//	LocalDateTime localDateTime = date.toInstant()
//			.atZone(ZoneId.systemDefault()).toLocalDateTime();
//	int year = localDateTime.getYear();
//	int month = localDateTime.getMonthValue();
//	int day = localDateTime.getDayOfMonth();
//	DayOfWeek dayOfweek = localDateTime.getDayOfWeek();
//	int hours = localDateTime.getHour();
//	int minutes = localDateTime.getMinute();
//	static long startTime = System.currentTimeMillis();
//	static long endTime = System.currentTimeMillis()
//			+ (numberOfdays * hoursInday * minutesInHour * secondsInMinutes * millisecondsInSeconds);
	


	public static void main(String[] args) throws IOException,
			InterruptedException {

		// for (int i = hours * minutes; i <= totalCollectionData; i+) {
		// System.out.println("date is: " + day + "." + month +
		// "." + year + "_"
		// + dayOfweek + "; " + hours + ":" + minutes);

		// Calendar start = Calendar.getInstance();
		// start.set(2015, Calendar.DECEMBER, 25);
		// start.set(Calendar.DAY_OF_MONTH, Calendar.getInstance()
		// .getActualMinimum(Calendar.DAY_OF_MONTH));
		// Calendar end = Calendar.getInstance();
		// end.setTime(start.getTime());
		// end.set(Calendar.DAY_OF_MONTH,
		// Calendar.getInstance().getActualMaximum(Calendar.DAY_OF_MONTH));
		// end.add(Calendar.DATE, 7);
		//
		// Calendar now = Calendar.getInstance();
		// SimpleDateFormat sdf = new SimpleDateFormat("EEE d MMM yyyy");
		//
		// for (Date dt = start.getTime(); !start.after(end); start.add(
		// Calendar.DATE, 1), dt = start.getTime()) {
		//
		// System.out.println(sdf.format(dt));
		// }

		Timer time = new Timer(); // Instantiate Timer Object
		ScheduleDownloadAndParsing st = new ScheduleDownloadAndParsing();
		// Instantiate SheduledTask
		System.out.println(Constant.getStartTime() + ";" + Constant.getEndTime() + ";" + Constant.processingInterval);
		while (Constant.getStartTime() <= Constant.getEndTime()) {
			time.schedule(st, 0, Constant.processingInterval); // Create Repetitively												// task for every
		}
	}

}