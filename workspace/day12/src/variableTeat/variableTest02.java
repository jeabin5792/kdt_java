package variableTeat;
//5번 : 가변길이 매개변수
public class variableTest02 {
	public static void main(String[] args) {
		variableTest02 vt = new variableTest02();
		vt.printNumbers("가변길이 매개변수", 1);
		vt.printNumbers("가변길이 매개변수", 1,2);
		vt.printNumbers("가변길이 매개변수", 1,2,34,5,6,6);
		
		for(int i=0; i<10000; i++) {
			vt.printNumbers(null, i);
		}
	}
	
	void printNumbers(String name, int ... numbers) {
		System.out.println(numbers);
		int total=0;
		for(int num : numbers) {
//			System.out.println(num + " ");
			total += num;
//			System.out.println(num);
		}
		System.out.println(total);
		System.out.println(name);
	}
	
	
	
}
