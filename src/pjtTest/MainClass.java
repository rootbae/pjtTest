package pjtTest;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {
	
	public static void main(String[] args) {
//		System.out.println("Hello Java World!!!!!");
//		
//		int[] arr = new int[5];
//		arr[0]= 100;
//		
//		System.out.println(arr[0]);
//		
//		int[] arr2 = {10,20,30};
//		System.out.println(arr2[0]);
//		
//		
		ChildClass child = new ChildClass();
		child.getInfo();
		
		int[] L = {1,2,3,4,5,6};
		int x = 6;
		int start = 0;
		int end = L.length;
		
		int retval = child.solution(L, x, start, end);
		System.out.println(retval);
//		
//		
//		InterfaceA ia = new InterfaceClass();
//		InterfaceB ib = new InterfaceClass();
//		ia.funA();
//		ib.funB();
		
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("hello");
//		
//		System.out.println(list);
//	
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
	}
	

}


