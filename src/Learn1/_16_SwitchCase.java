package Learn1;

public class _16_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//break means stop on that line
		
		int grade = 2;
		
		switch (grade) {
		case 1: System.out.println("Outstanding");
		break;
		case 2: System.out.println("Good");
		break;
		case 3: System.out.println("Enough");
		break;
		case 4: System.out.println("Very bad");
		break;
		default : System.out.println("Your grade is not on the scale");
		break;
		}
	}

}
