package Algorithm;

public class star {
	public static void main(String[] args) {
		
		System.out.println("\n 1st");
//		*****
//		*****
//		*****
//		*****
//		*****
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("\n 2nd");
//		*****
//		*****
//		*****
//		*****
//		*****
		
		for(int i=1; i<=5; i++) {
			System.out.println("*****");
		}
		
		System.out.println("\n 3rd");
//		*
//		**
//		***
//		****
//		*****
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("\n 4th");
//		*****
//		****
//		***
//		**
//		*
		
		for(int i=0; i<5; i++) {
			for(int j=5; i<j; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
	}
}
