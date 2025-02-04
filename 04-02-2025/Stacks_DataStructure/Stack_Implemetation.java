package Stacks_DataStructure;
import java.util.Stack;

public class Stack_Implemetation {
 public void showPush(Stack st,int a) {
	 st.push(a);
	 System.out.println(st);
	 
 }
 
 public static void showPop(Stack st) {
	Object s= st.pop();
	 System.out.println(s);
	 
 }
 
 
 public static void main(String args[]) {
	 Stack<Integer> st=new Stack<>();
	 Stack_Implemetation o=new Stack_Implemetation();
	 o.showPush(st,1000);
	 o.showPush(st, 1212);
	 o.showPop(st);
	 
	 
 
 }
}
