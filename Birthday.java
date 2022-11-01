
public class Birthday{
	public int day;
	public int month;
	public int year;
	public Birthday(){
		day = 1;
		month = 1;
		year = 2000;
	}
	public Birthday(int x, int y , int z){
		day = x;
		month = y;
		year = z;
	}
	public void halfBirthday(){
		int temp = month;
		temp = temp+6;
		System.out.println(temp);
	}
	public boolean isOlder(Birthday temp){
		if(year<temp.year){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isLeapYear(int year ){
		return true;
	}
}
