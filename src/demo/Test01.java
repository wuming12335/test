package demo;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		System.out.println("a+b="+add(1, 2));
		System.out.println("123123");
		
	}
	
	public static int add(int a, int b){
		return a+b;
	}
	
	public static int convert(String str){
		return Integer.parseInt(str);
	}
	
	public static  void test(){
		System.out.println("test");
	}
}
