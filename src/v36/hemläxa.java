package v36;

public class hemläxa {
	public static void main(String[] args) {
		
		int arr[] = { 4, 6, 10, 8, 2 };
		System.out.print(heltal_summa(arr));
	
	}
	
	public static int heltal_summa(int[] arr) {
		int res = 0;
		for(int i = 0; i < arr.length; i++) {
			res = res + arr[i];
		}
		return res;
	}
}

