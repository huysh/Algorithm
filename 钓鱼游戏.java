package fishing;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String[] line = sc.nextLine().trim().split("\\s+");
			int m = Integer.parseInt(line[0]);
			int n = Integer.parseInt(line[1]);
			int x = Integer.parseInt(line[2]) - 1;
			int y = Integer.parseInt(line[3]) - 1;
			int t = Integer.parseInt(line[4]);
			double[][] rect = new double[m][n];
			for(int i = 0; i < m; i++){
				String[] line1 = sc.nextLine().trim().split("\\s+");
				for(int j = 0; j < n; j++){
					//ǿתΪdouble
					rect[i][j] = Double.parseDouble(line1[j]);
				}
			}
			helper(rect, rect[x][y], t);
		}
	}
	public static void helper(double[][] rect, double cc, int t){
		double ss = 0;
		for(int i = 0; i < rect.length; i++){
			for(int j = 0; j < rect[0].length; j++){
				ss = ss + rect[i][j];
			}
		}
		ss = ss / (rect.length * rect[0].length);
		if(ss > cc){
			System.out.println("ss");
			System.out.println(String.format("%.2f", 1 - Math.pow(1 - ss, t)));
		}else if(cc > ss){
			System.out.println("cc");
			System.out.println(String.format("%.2f", 1 - Math.pow(1 - cc, t)));
		}else {
			System.out.println("equal");
			System.out.println(String.format("%.2f", 1 - Math.pow(1 - cc, t)));
		}
	}
}
