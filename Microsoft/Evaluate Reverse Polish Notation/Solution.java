class Solution {
    public int evalRPN(String[] tokens) 
    {	
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<tokens.length;i++)
		{
			char c = tokens[i].charAt(0);
			if(Character.isDigit(c) || (c=='-' && tokens[i].length()>1))
			{
				int n=Integer.valueOf(tokens[i]);
				stack.push(n);
			}
			else
			{
				int b = stack.pop();
				int a = stack.pop();
				
				switch(c)
				{
					case '+':
					stack.push(a+b);
					break;
					
					case '-':
					stack.push(a-b);
					break;
					
					case '/':
					stack.push(a/b);
					break;
					
					case '*':
					stack.push(a*b);
					break;
				}
			}
		}
		return stack.pop(); 
    }
}
