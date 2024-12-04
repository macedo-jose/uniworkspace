package lu.uni.programming1;

public record SimpleDate (int day, int month, int year) implements Comparable<SimpleDate> {

	@Override
	public int compareTo(SimpleDate other) {
		int diff;
		
		if ((diff = (year - other.year)) != 0) {
			return diff;
		}
		if ((diff = (month - other.month)) != 0) {
			return diff;
		}
		return day - other.day;
	}

	@Override
	public String toString() {
		return String.format("%02d.%02d.%04d", day, month, year);
	}

}


// the old fashioned way, using a regular class, would work as well
// however, taking advantage of records saves a lot of typing (or generating :-)

// public class SimpleDate implements Comparable<SimpleDate> {
	
// 	private int day, month, year;
	
// 	public SimpleDate(int day, int month, int year) {
// 		this.day = day;
// 		this.month = month;
// 		this.year = year;
// 	}

// 	@Override
// 	public int compareTo(SimpleDate other) {
// 		int diff;
		
// 		if ((diff = (year - other.year)) != 0) {
// 			return diff;
// 		}
// 		if ((diff = (month - other.month)) != 0) {
// 			return diff;
// 		}
// 		return day - other.day;
// 	}
	
// 	@Override
// 	public String toString() {
// 		return String.format("%02d.%02d.%04d", day, month, year);
// 	}

// 	@Override
// 	public boolean equals(Object obj) {
// 		if (this == obj)
// 			return true;
// 		if (obj == null)
// 			return false;
// 		if (getClass() != obj.getClass())
// 			return false;
// 		SimpleDate other = (SimpleDate) obj;
// 		return day == other.day && month == other.month && year == other.year;
// 	}

// 	@Override
// 	public int hashCode() {
// 		final int prime = 31;
// 		int result = 1;
// 		result = prime * result + day;
// 		result = prime * result + month;
// 		result = prime * result + year;
// 		return result;
// 	}

// }
