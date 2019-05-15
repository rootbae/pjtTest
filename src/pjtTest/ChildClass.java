package pjtTest;

public class ChildClass {
	private String name;
	private String gender;
	private int age;
	
	public ChildClass() {
		System.out.println("constructor");
	}
	
	public void getInfo() {
		System.out.println("getinfo");
	}
	
	public int solution(int L[], int x, int start, int end ) {
		if( start > end) {
			return -1;
		}
		
		int mid = (start+end)/2;
		if( x == L[mid]) {
			return mid;
		}else if( x < L[mid]) {
			return solution(L, x, start, mid-1);
		}else {
			return solution(L, x, mid+1, end);
		}
		
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("finalize");
		
		super.finalize();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
