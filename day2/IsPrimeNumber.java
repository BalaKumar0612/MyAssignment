package week1.day2;
public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =25;
		for(int i=2;n-1>=i;i++) {
			for (int j=2;i>j;j++){
			
			if (i%j==0) {
				System.out.println(i + " "+ "NonPrime");
				break;
			}
			else {
				System.out.println(i + " " + "Prime");
				break;
			}
		}
			

	}

}
}