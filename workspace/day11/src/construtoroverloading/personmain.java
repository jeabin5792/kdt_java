package construtoroverloading;

public class personmain {
	 public static void main(String[] args) {
	      person p1 = new person();
//	      기본 생성자가 호출되었습니다
//	      생성자 : constructorOverloading.Person@279f2327
	      
	      person p2 = new person("유리");
	      System.out.println(p2.name); //유리
	      System.out.println(p2.age); //10
	      
	      person p3 = new person("짱아", 2, null);
	      System.out.println(p3.age);
	   }
}
