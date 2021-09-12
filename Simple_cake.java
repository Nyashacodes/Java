import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Main {
	
	public static void main (String[] args) {
        Set<Integer> uniqeSet = new TreeSet<Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if(uniqeSet.contains(a[i])) {
				
			} else {
				count++;
				uniqeSet.add(a[i]);
			}
		}
		System.out.println(count);
	}
}
