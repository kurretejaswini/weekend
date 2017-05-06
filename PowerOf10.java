package world;

public class PowerOf10 {
	public String PowerOf(int number) {
		String s="";
		switch (number) {
		case 6:
			System.out.println("million");
			s = "million";

			break;
		case 9:
			System.out.println("billion");
			s = "billion";

			break;
		case 12:
			System.out.println("Trillion");
			s = "Trillion";

			break;
		case 15:
			System.out.println("Quadrillion");
			s = "Quadrillion";
			break;
		case 18:
			System.out.println("Quintillion");
			s = "Quintillion";
			break;
		case 21:
			System.out.println("Sextillion");
			s = "Sextillion";
			break;
		case 30:
			System.out.print("Nonillion");
			s = "Nonillion";
			break;
		case 100:
			System.out.println("Googol");
			s = "Googol";
			break;
			default:System.out.println("enter a valid value");
			s="enter a valid number";

		}
		System.out.println(10+"raised to the"+number+"th power is a"+s);
		return s;
	}
}
