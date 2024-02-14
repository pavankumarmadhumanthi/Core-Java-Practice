package java8Practice;

public class LocalInnerClass {
	private int value1 = 35;

	public void printdata() {
		int value2 = 90;
		class First {
			public void printFirstdata() {
				System.out.println(value1 + value2);
			}

		}
		First first = new First();
		first.printFirstdata();

	}

	public static void main(String[] args) {
		LocalInnerClass localInnerClass = new LocalInnerClass();
		localInnerClass.printdata();
	}
}
