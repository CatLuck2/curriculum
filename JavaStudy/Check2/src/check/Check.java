package check;

public class Check {
	
	private static String firstName = "藤澤";
	private static String lastName = "洋佑";
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Pet pet = new Pet(constants.Constants.CHECK_CLASS_JAVA, constants.Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(constants.Constants.CHECK_CLASS_R2D2, constants.Constants.CHECK_CLASS_LUKE);
		
		printName(firstName, lastName);
		pet.introduce();
		robotPet.introduce();
	}
	
	private static void printName(String first_name, String last_name) {
		System.out.println("printNameメソッド" + " " + "→" + " " + first_name + last_name);
	}
}
