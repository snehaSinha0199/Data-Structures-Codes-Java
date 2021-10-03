package stack;

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class ValidateParanthesis {
	private static List getExpression() {
	 List<String> expression=new ArrayList<>();
	 expression.add("{");
	 expression.add("(");
	 expression.add("[");
	 return expression;
	}
public static boolean isValidExpression(String s) {
	String[] split = s.split("");
	Stack<String> stack=new Stack<>();
	for(int i=0;i<split.length;i++) {
		if(getExpression().contains(split[i])) {
			stack.push(split[i]);
		}
		else {
			if(stack.size()>0) {
				stack.pop();
			}
		}
	}
	return stack.isEmpty();
}
public static void main(String[] args) {
	boolean exp = isValidExpression("]({})[");
	System.out.println(exp);
	boolean exp1=isValidExpression("{()}");
	System.out.println(exp1);
}
}
