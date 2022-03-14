package fpoly;

public class PTBac1 {
	float a, b, c;

	public boolean isPTBac1(float a, float b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình này có vô số nghiệm.");
			} else {
				System.out.println("Phương trình vô nghiệm.");
			}
			return false;
		} else {
			c = -b / a;
			System.out.println("Phương trình có nghiệm x = " + c);
			return true;
		}
	}
}
