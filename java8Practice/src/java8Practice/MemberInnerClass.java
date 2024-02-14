package java8Practice;

public class MemberInnerClass {
	private int num=98;
	class First{
		public int value=898;
		public void printdata() {
			
			System.out.println(num+value);
		}
	}
	public static void main(String[] args) {
		MemberInnerClass obj = new MemberInnerClass();
		First first = obj.new First();
		first.printdata();
		
	}

}
