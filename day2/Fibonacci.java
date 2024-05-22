package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int r=8;
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0; i<=r; i++) {
			int n3= n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}

	}

}
