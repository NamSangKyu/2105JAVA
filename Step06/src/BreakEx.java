
public class BreakEx {

	public static void main(String[] args) {
		int total = 0, i = 1;
		
		while(true) {
			total += i;
			i++;
			if(total > 5000)
				break;
		}
		
		System.out.println(total);
	}

}
