package 보물_1026;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		int[] b = new int[num];
		for(int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < num; i++) {
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int sum = 0;
		for(int i = 0; i < num; i++) {
			sum += a[i] * b[num-1-i];
		}
		System.out.println(sum);
	}
}
