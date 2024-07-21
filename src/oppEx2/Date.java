package oppEx2;

public class Date {
	
	private int year,month,day;
	
	public Date(int year , int month , int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return String.format("%d/%d/%4d", day, month, year);
	}
	
	
	public void setDate(int month ,int day ,int year ) {
		this.day = day;
	      this.month = month;
	      this.year = year;
	      
	}
	
	

}
