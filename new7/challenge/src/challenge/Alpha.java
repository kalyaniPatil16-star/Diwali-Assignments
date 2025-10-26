package challenge;

import java.util.Scanner;

public class Alpha {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String str=sc.nextLine();
		
		boolean alpha=true;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			 if (!Character.isLetterOrDigit(ch)) {
	                alpha = false;
	                break;
	            }
		}
		if(alpha) {
			System.out.println("string contain alphanumeric");
		}
		else {
			System.out.println("string not contain alphanumeri");
		}
		

	}

}
