
public class Main {

	public static String main(String[] args) {
		int day=31; 
		int month=9; 
		int year = 2024;
		String[] weekDays = { "Thursday", "Friday", "Saturday","Sunday", "Monday", "Tuesday","Wednesday"};
		int x = 0;
		try {
			x = (dayToYear(year)+dayOfYear(day,month,year))%7;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    return weekDays[x];
		}

		static int dayToYear(int year) {
		    int result = year - 1971;
		    result += (year - 1968 - 1) / 4;
		    return result;
		}

		static int dayOfYear(int day, int month, int year) {
		    int result = 0;
		    int y = 0;
		    if (year%400==0||(year%100!=0&&year % 4 == 0)) {
		        y = 1;
		    }
		    switch (month) {
		        case 1:
		            result = day;
		            break;
		        case 2:
		            result = 31 + day;
		            break;
		        case 3:
		            result = 59 + day + y;
		            break;
		        case 4:
		            result = 90 + day + y;
		            break;
		        case 5:
		            result = 120 + day + y;
		            break;
		        case 6:
		            result = 151 + day + y;
		            break;
		        case 7:
		            result = 181 + day + y;
		            break;
		        case 8:
		            result = 212 + day + y;
		            break;
		        case 9:
		            result = 243 + day + y;
		            break;
		        case 10:
		            result = 273 + day + y;
		            break;
		        case 11:
		            result = 304 + day + y;
		            break;
		        case 12:
		            result = 334 + day + y;
		            break;
		    }
		    return result;

	}

}
