package 산술연산자;

public class Main {
	
	public static void main(String[] args) {
		int firstNum = 10;
		int secondNum = 5;
		
		System.out.println("firstNum + secondNum =" + (firstNum = firstNum + secondNum));
		System.out.println("firstNum - secondNum =" + (firstNum = firstNum - secondNum));
		System.out.println("firstNum * secondNum =" + (firstNum = firstNum * secondNum));
		System.out.println("firstNum / secondNum =" + (firstNum = firstNum / secondNum));
		System.out.println("firstNum % secondNum =" + (firstNum = firstNum % secondNum));
	}

}
