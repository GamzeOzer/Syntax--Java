package class27;
/*
 * 2. Write program: user class  has a constructor that takes name and mobile number. 
 * Extend this class  by userInfo that will have user address variable.
 *  Print users name, mobile number and address in userDetails method. Test your code. (
 */

public class User {

	public String name;
	public long mobileNumber;
	
	public User(String name,long mobileNumber){
		this.name=name;
		this.mobileNumber=mobileNumber;
	}
}
class UserInfo extends User {

	public String address;
	
	public UserInfo(String name, long mobileNumber,String address) {
		super(name, mobileNumber);
		this.address=address;
		}
	
	void getInfo() {
		System.out.println(name+" "+mobileNumber+" "+address);
	}
	
	
}