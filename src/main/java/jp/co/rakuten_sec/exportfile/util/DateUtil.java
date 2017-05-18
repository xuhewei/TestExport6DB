package jp.co.rakuten_sec.exportfile.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static String getNowDate(){
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yyyyMMdd");
		String nowDate = format.format(date);
		return nowDate;
	}
	public static String getYYYYMMDDDate(Date date){
		DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		String fDate = format.format(date);
		return fDate;
	}
}
