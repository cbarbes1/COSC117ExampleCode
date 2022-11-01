public class testBirthday{
	public static void main(String args[]){
		Birthday myObject = new Birthday(5, 15, 2002);
		myObject.halfBirthday();
		System.out.println(myObject.day);
	}
}
