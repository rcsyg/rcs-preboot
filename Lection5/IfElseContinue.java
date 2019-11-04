
public class IfElseContinue {
	public static void main(String[] args) {
		boolean isWithinTown = false;
		boolean isInLatvia = false;
		boolean isHighway = true;
		int maxSpeed;
		/*if (isWithinTown) {
			if(isInLatvia) {
				maxSpeed = 50;
			} else {
				maxSpeed = 60;
			}
		} else {
			maxSpeed = 90;
		}*/
		// <boolean> ? <if true> : <else>
		maxSpeed = isWithinTown ? 
				(isInLatvia ? 50 : 60) : 
				(isHighway ? 110 : 90);
		System.out.println("Max speed : " + maxSpeed);
	}
}
