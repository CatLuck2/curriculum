package check;
import constants.Constants;

public class Check {
	
	private static String firstName = "藤澤";
	private static String lastName = "洋佑";
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		
		printName(firstName, lastName);
		pet.introduce();
		robotPet.introduce();
	}
	
	// main関数はstaticなので、非static関数を呼び出せない
	private static void printName(String first_name, String last_name) {
		System.out.println("printNameメソッド → " + first_name + last_name);
	}
}
