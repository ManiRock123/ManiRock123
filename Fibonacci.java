package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int firstNum=0, secondNum=1, range=8, sumSeries;
		System.out.print(firstNum +" "+secondNum);
		for (int i = 2; i < range; i++) {
			sumSeries = firstNum+secondNum;
			System.out.print(" "+sumSeries);
			firstNum=secondNum;
			secondNum=sumSeries;
		}
	}
	

}
