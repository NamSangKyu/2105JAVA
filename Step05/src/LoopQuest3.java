
public class LoopQuest3 {

	public static void main(String[] args) {
		/*					   별    줄
		 * 		    *			1	 0 * 2 + 1
		 * 		   ***			3	 1 * 2 + 1
		 * 		  *****			5	 2 * 2 + 1
		 * 		 *******		7	 3
		 * 		*********		9	 4
		 */
		for(int i=0;i<5;i++) {
			String star = "";
			for(int j=0;j<5-1-i;j++) {
				star += " ";
			}
			for(int j=0;j<i*2+1;j++) {
				star += "*";
			}
			System.out.println(star);
		}
	}

}
