package ludeng;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int nums = sc.nextInt();
			int[] array = new int[nums + 1];
			array[nums] = sc.nextInt();
			for(int i = 0; i < nums; i++){
				array[i] = sc.nextInt();
			}
			System.out.println(String.format("%.2f", helper(array)));
		}
		sc.close();
	}
	public static double helper(int[] array){
		Arrays.sort(array);
		int max = Integer.MIN_VALUE;
		for(int i = 1; i < array.length; i++){
			if(array[i] - array[i - 1] > max) max = array[i] - array[i -1];
		}
		return max / 2.0;
	}
}
