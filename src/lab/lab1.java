package lab;

public class lab1 {
	private static int result =0;
	public int yuan(int x) {
		if (x / 50 > 1)
			result = 0;
		else {
			x = x % 50;
			if (x / 20 > 1)
				result = 0;
			else {
				x = x % 20;
				if (x / 5 > 2)
					result = 0;
				else {
					x = x % 5;
					if (x <= 3) {
						result = 1;
					}
					else
						result = 0;
				}	
			}
		}
		return result;
	}

}