package practice;

public class Sum {
	public static void main(String[] args) {
		//summing even numbers
		int sum = 0;
		for (int i=1; i<51; i++) {
			if(i%2==0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}

}
//for odd numbers
if(i%2==1 ) {
	sum = sum+i;
}