package com.why.facetest.tile;

import java.util.Arrays;

public class Face {
	public static void printMutilpe(int a) {
		int x=0;
		int y = 0;
		String str = String.valueOf(a);
		char[] c =str.toCharArray();
		for(int i=0;i<str.length();i++) {
			int b = Integer.parseInt(c[i]+"");
			System.out.println(b);
			if( i %2 ==0) {
				x +=b;
			}else {
				y +=b;
			}
		}
		System.out.println("偶数的和"+x);
		System.out.println("奇数的和"+y);
	}
	
	public static void array(int[] arr) {
		Arrays.sort(arr);
		for(int i :arr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		//Face.printMutilpe(537);
//		int [] arr = new int[]{1,58,3,7,9}; 
//		int temp = 0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j =0;j<arr.length-1;j++) {
//				if(arr[j] >arr[j+1]) {
//					temp = arr[j];
//					arr[j] =arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//		for(int i :arr) {
//			System.out.println(i);
//		}
		/*String[] str = new String[] {"qwewq","advice","borwer","www"};
		Arrays.sort(str);
		for(String s :str) {
			System.out.println(s);
		}*/
		String str="THE PRICE OFBREAD IS ￥1 25 PER POUND";
		  //StringBuffer buff=new StringBuffer(str);
		  char[] arr=str.toCharArray();
		  Arrays.sort(arr);
		  System.out.println(arr);
	}

}
