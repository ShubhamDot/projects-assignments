import java.util.*;

class post_to_pre {
	static boolean is_operator(char x)
	{
		switch (x) {
		case '+':
		case '-':
		case '/':
		case '*':
			return true;
		}
		return false;
	}
	static String post_to_pre(String post_exp)
	{
		Stack<String> s = new Stack<String>();
		int length = post_exp.length();

		for (int i = 0; i < length; i++) {
			if (is_operator(post_exp.charAt(i))) {
				String op1 = s.peek();
				s.pop();
				String op2 = s.peek();
				s.pop();
				String temp = post_exp.charAt(i) + op2 + op1;
				s.push(temp);
			}
			else {
				s.push(post_exp.charAt(i) + "");
			}
		}
		String ans = "";
		for (String i : s)
			ans += i;
		return ans;
	}
	
	public static void main(String args[])
	{
		String exp = "ABC/-AK/L-*";
		System.out.println("Postfix : "+exp+"\nPrefix : " + post_to_pre(exp));
	}
}
