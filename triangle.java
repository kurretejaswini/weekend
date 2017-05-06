package world;

public class triangle {
	
	int a, b, c;

	public triangle(int newa, int newb, int newc) {
		a = newa;
		b = newb;
		c = newc;
	}

	public boolean isTriangle() {
		if (a > 0 && b > 0 && c > 0) {
			if ((a + b) > c && (a + c) > b && (b + c) > a) {
				return true;
			}
		}

		return false;

	}

	public double getAngle(int edge) {
		double angle;
		if (!isTriangle())
			return 0;

		if (edge == a) {
			angle = Math.acos((b * b + c * c - a * a) / (2.0 * b * c));

		} else if (edge == b) {
			angle = Math.acos((a * a + c * c - b * b) / (2.0 * a * c));
		} else if (edge == c) {
			angle = Math.acos((b * b + a * a - c * c) / (2.0 * a * b));
		} else {
			angle = 0;
            return angle;
		}
		angle = angle * 180.0 / Math.PI;
		System.out.println(angle);
		return angle;
	}

}
