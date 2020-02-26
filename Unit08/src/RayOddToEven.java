//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int index = 0;
		for(int i = 0; i < ray.length; i++) {
			if(ray[i] % 2 == 1) {
				index = i;
				break;
			}
			else {
				return -1;
			}
		}
		for(int i = index; i < ray.length; i++) {
			if(ray[i] % 2 == 0) {
				index = i-index;
				break;
			}
			else {
				return -1;
			}
		}
		return index;
	}
}