 

import java.util.Scanner;

public class LastCharacterInEveryWord {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		   String [] arr=str.split(" ");
		   String res="";
		   for(String i:arr) {
			   if(Character.isAlphabetic(i.charAt(i.length()-1))) {
				   res=res+i.charAt(i.length()-1);
			   }
		   }
		   System.out.println(res);

		
	}

}
