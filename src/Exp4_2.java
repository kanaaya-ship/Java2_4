
public class Exp4_2 {

	public static void main(String[] args) {
		int[] data = {12,45,3,67,22,90,15};
		int max = data[0];
		
		for(int num : data) {
			if(num > max) {
				max = num;
			}
		}

		System.out.println("最大値は" + max + "です");
	}

}
